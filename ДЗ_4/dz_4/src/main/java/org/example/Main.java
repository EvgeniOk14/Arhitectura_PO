package org.example;

import org.example.CustomersAnTickets.*;

import java.util.ArrayList;
import java.util.Collection;

public class Main
{
    public static void main(String[] args) throws IllegalAccessException
    {


        Core core = new Core();
        Datebase datebase = new Datebase();
        Collection<Customer> listOfCustomer = new ArrayList<>();
        Collection<Ticket> listOfTickets = new ArrayList<>();
        //CustomerProvider customerProvider = core.getCustomerProvider();

        CustomerProvider customerProvider = new CustomerProvider(datebase);
        PaymentProvider paymentProvider = new PaymentProvider();
    //    TicketProvider ticketProvider = core.getTicketProvider();
        TicketProvider ticketProvider = new TicketProvider(datebase, paymentProvider);

      //  MobileApp mobileApp = core.getMobileApp();
        MobileApp mobileApp = new MobileApp(ticketProvider, customerProvider, datebase, listOfCustomer, listOfTickets);

        /** Создание списка покупателей и сохранение его в Базе Данных **/
        datebase.addCustomerWithTickets(mobileApp.createCustomer());
        System.out.println("Первый список покупателей\n");
        mobileApp.printCustomers(datebase);

        /** Создание списка билетов и сохранение её в Базе данных **/
        datebase.addTickets(mobileApp.createTickets());
        System.out.println("Первый список билетов:\n");
        mobileApp.printTicets(datebase);


        /** Добаление билетов покупателям случайным оразом **/
        System.out.println("Распределение билетов случайным способом\n");
        RandomDistributionTickets randomDistributionTickets = new RandomDistributionTickets(mobileApp.createCustomer(), mobileApp.createTickets(), datebase);
        randomDistributionTickets.randomDistributionTickets(mobileApp.createCustomer(), mobileApp.createTickets());
        System.out.println("Идентификация покупателя:\n");
         /** Идентификация покупателя по Паролю и Логину **/
        try {
            customerProvider.getCustomer("Михайлов", "Михаил");
        }
        catch (IllegalAccessException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Cоздание новых билетов\n");
        /** Создаём список новых (незабронированных) билетов **/
        datebase.addTickets(mobileApp.createNewTicket());
        System.out.println("Это новые билеты:\n");
        mobileApp.printTicets(datebase);

        try
        {
            ticketProvider.buyTicket(10, "card10");
        }
        catch (RuntimeException e)
        {
            e.getMessage();
        }

        System.out.println("Проверка на автобусной станции\n");
        /** Автобусная остановка проверка билета
         * замена статуса билета с "Действующий" на "Использованный" **/
        //BusStation busStation = core.getBusStation();
        BusStation busStation = new BusStation(ticketProvider);
        busStation.checkTicket("qr1");

    }
}

