package org.example.CustomersAnTickets;

import lombok.*;

import java.util.ArrayList;
import java.util.Collection;

@Getter
@Setter


public class Customer
{
    private final String loging;
    private final String password;
    private static int counter;
    private final int id;
    private String firstName;
    private String lastName;
    private String cardNo;
    private Collection<Ticket> tickets = new ArrayList<>();


    public Customer(String firstName, String lastName,String loging, String password, String cardNo)
    {
        this.loging = loging;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.cardNo = cardNo;
        this.id = ++counter;
    }


    public int getId()
    {
        return id;
    }

    public Collection<Ticket> getTickets()
    {
        return tickets;
    }

    public void setTickets(Collection<Ticket> tickets)
    {
        this.tickets = tickets;
    }
    public Customer getCustomer()
    {
        return new Customer(loging, password, firstName, lastName, cardNo);
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("\n").append("Номер покупателя: ").append(id).append("\n")
                .append("Фамилия покупателя: ").append(firstName).append("\n")
                .append("Имя покупателя: ").append(lastName).append("\n")
                .append("Карта покупателя: ").append(cardNo).append("\n")
                .append("Билеты покупателя № ").append(id).append(": ").append("\n").append("[");
        for(Ticket ticket: tickets)
        {
            sb.append("\n").append("[ ").append("номер билета: ").append(ticket.getId()).append("\n")
                    .append("Дата продажи билета: ").append(ticket.getLocalDate()).append("\n")
                    .append("Статус билета: ").append(ticket.getTicketStatus()).append("\n")
                    .append("QR код билета: ").append(ticket.getQrCode()).append("\n")
                    .append("Номер покупателя билета: ").append(ticket.getClientId()).append(" ]").append("\n");
        }
        return sb.toString();
    }

}
