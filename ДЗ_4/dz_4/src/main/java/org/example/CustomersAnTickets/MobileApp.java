package org.example.CustomersAnTickets;

import java.util.Collection;

public class MobileApp
{
    private final CustomerProvider customerProvider;
    private final TicketProvider ticketProvider;
    private final Datebase datebase;
    private Collection<Customer> listOsCustomers;
    private Collection<Ticket> listOfTickets;


    public MobileApp(TicketProvider ticketProvider, CustomerProvider customerProvider, Datebase datebase,Collection<Customer> listOsCustomers, Collection<Ticket> listOfTickets )
    {
        this.ticketProvider = ticketProvider;
        this.customerProvider = customerProvider;
        this.datebase = datebase;
        this.listOsCustomers = listOsCustomers;
        this.listOfTickets = listOfTickets;
    }

    /** Возврат списка билетов конкретного пользователя **/
    public Collection<Ticket> getTickets(Customer customer)
    {
       return ticketProvider.getTicket(customer);

    }
    /** Возврат списка всех Пользователей из БД **/
    public  Collection<Customer> searchCuctomers()
    {
        return customerProvider.getCustomers();
    }

    /** Возврат списка всех Билетов из БД **/
    public Collection<Ticket> searchAllTicket()
    {
       return customerProvider.getTicket();

    }

    /** Поиск Конкретного Забронированного Билета конкретным Покупателем по clientId **/
    public Ticket searchTicketByClientId(int clientId)
    {
       return ticketProvider.searchTicketByClientId(clientId);
    }

    /** Покупка билетов из Базы  **/
    public void buyTicket(Customer customer, String cardNo)
    {
         ticketProvider.buyTicket(customer.getId(), cardNo);
    }

    /** Проверка билета на станции
     * и изменение статуса билета с "Дествующий на "Использованный"  **/
    public void checkTicket(String qrcode)
    {
          ticketProvider.checkTicket(qrcode);
    }

    /** Создание списка Покупателей и добавление их в БД **/
    public Collection<Customer> createCustomer()
    {
        CreateCustomer createCustomer = new CreateCustomer(datebase);
        return createCustomer.createCustomer();
    }

    /** Создание списка Билетов и добавление их в БД **/
    public Collection<Ticket> createTickets()
    {
        CreateTicket createTicket = new CreateTicket();
        return createTicket.createTicket();
    }

    public Collection<Ticket> createNewTicket()
    {
        CreateTicket createTicket = new CreateTicket();
        return createTicket.createNewTicket();
    }

    /** Покупка конкретного билета, конкретным пользователем **/
    public void buyTicket(int clientId, String cardNo)
    {
        ticketProvider.buyTicket(clientId, cardNo);
    }

    /** Печать списка Пользователей из БД **/
    public void printCustomers(Datebase datebase)
    {
        System.out.println(datebase.getListOfCustomers().toString());
    }

    /** Печать списка всех Билетов из БД **/
    public void printTicets(Datebase datebase)
    {
        System.out.println(datebase.getListOfTickets().toString());
    }

    /** Добавление билетов покупателям случайным методом **/
    public void randomDistributionTicket(Datebase datebase)
    {
        RandomDistributionTickets randomDistributionTickets = new RandomDistributionTickets(listOsCustomers, listOfTickets, datebase);
        randomDistributionTickets.randomDistributionTickets(datebase.getListOfCustomers(), datebase.getListOfTickets());
    }


}

