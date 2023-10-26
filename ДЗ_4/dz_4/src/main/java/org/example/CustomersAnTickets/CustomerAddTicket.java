package org.example.CustomersAnTickets;

public class CustomerAddTicket
{
    public void customerAddTicket(Customer customer, Ticket ticket)
    {
        customer.getTickets().add(ticket);
    }
}
