package org.example.CustomersAnTickets;


import java.time.LocalDate;
import java.util.*;

public class TicketProvider
{
    private final Datebase datebase;
    private final PaymentProvider paymentProvider;

    public TicketProvider(Datebase datebase, PaymentProvider paymentProvider)
    {
        this.datebase = datebase;
        this.paymentProvider = paymentProvider;
    }


    /** Заказ бронь билетов пользователями в случайном порядке **/
    public void orderTicket(Collection<Customer> lictOfCustomer, Collection<Ticket> listOfTickets)
    {
        Random random = new Random();
        for (Customer customer : lictOfCustomer)
        {
            /** не более Двух билетов одному покупателю **/
            while (customer.getTickets().size() < 2 && !listOfTickets.isEmpty())
            {
                int randomIndex = random.nextInt(listOfTickets.size());
                Ticket randomTicket = new ArrayList<>(listOfTickets).get(randomIndex);
                listOfTickets.remove(randomTicket);
                randomTicket.setClientId(customer.getId());
                customer.getTickets().add(randomTicket);
            }
        }
        /** Сохранение изменений в БД
         * (у покупателей появились забронированные билеты)
         * (у билетов заполнилось поле customerId номером id покупателя) **/

        datebase.addCustomerWithTickets(lictOfCustomer);
        System.out.println(datebase.getListOfCustomers());
    }



    /** Поиск Конкретного Забронированного Билета, Конкретным Пользователем по номеру clientId **/
    public Ticket searchTicketByClientId(int clientId)
    {
        for (Ticket ticket: datebase.getListOfTickets())
        {
            if (ticket.getClientId() == clientId);
            return ticket;
        }
        return null;

    }

    /** Поиск всех Забронированных билетов пользователями **/
    public Collection<Ticket> searchAllBokedTickets(int clientId)
    {
        Collection<Ticket> collectionBooketTickets = new ArrayList<>();
        for (Ticket ticket: datebase.getListOfTickets()) {
            if (ticket.getClientId() == clientId)
                collectionBooketTickets.add(ticket);
        }
        return collectionBooketTickets;

    }

    /** Покупка билета Конкретным покупателем **/
    public void buyTicket(int clientId, String cardNo)
    {
        for (Customer customer : datebase.getListOfCustomers())
        {
            if (customer.getId() == clientId && customer.getCardNo().equals(cardNo))
            {
                int orderId = datebase.createTicketOrder(clientId);
                double amount = datebase.getTicketPrice();
                for (Ticket ticket : datebase.getListOfTickets())
                {
                    if (ticket.getClientId() == 0 && paymentProvider.buyTicket(orderId, cardNo, amount)) {
                        ticket.setClientId(customer.getId());
                        System.out.println("Операция по покупке билета прошла успешна!\n Поздравляю Вас с покупкой билета! ");
                        System.out.println(customer);
                        System.out.println(ticket);
                        break;
                    }
                    else
                    {
                        System.out.println("Проверьте реквизиты своей карты! ");
                    }
                }
            }
        }
        throw new RuntimeException("Неправильный ввод!");
    }

    /** Проверка билета по QRcode при входе на станцию
     * и изменение статуса билета с "Действующий" на "Использован" **/
    public void checkTicket(String qrcode)
    {
        for (Ticket ticket: datebase.getListOfTickets())
        {
            if (ticket.getQrCode().equals(qrcode))
            {
                System.out.println(ticket.getQrCode());
                System.out.println(qrcode);
                ticket.setTicketStatus(TicketStatus.EXPIRED);

                // save ticket

                System.out.println("Билет действующий!\n  Проходите на посадку! ");
                break;

            }
            else
            {
                System.out.println("такого билета нет, либо билет недействительный!");
            }
        }

    }

    /** Возврат списка билетов у пользователя **/
    public  Collection<Ticket> getTicket(Customer customer)
    {
         return   customer.getTickets();
    }
}




