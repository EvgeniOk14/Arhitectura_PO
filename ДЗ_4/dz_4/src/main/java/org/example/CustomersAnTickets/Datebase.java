package org.example.CustomersAnTickets;

import lombok.*;
import java.util.ArrayList;
import java.util.Collection;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString


public class Datebase
{
    private static int counter;
    private Collection<Customer> listOfCustomers = new ArrayList<>();
    private Collection<Ticket> listOfTickets = new ArrayList<>();

    public double getTicketPrice()
    {
        return 55;
    }

    public int createTicketOrder(int id)
    {
        return ++counter;
    }

    public void addCustomerWithTickets(Collection<Customer> list)
    {
        listOfCustomers.addAll(list);
    }

    public void addTickets(Collection<Ticket> listTicket)
    {
        listOfTickets.addAll(listTicket);
    }

}
