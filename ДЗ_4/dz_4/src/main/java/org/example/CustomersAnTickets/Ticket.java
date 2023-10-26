package org.example.CustomersAnTickets;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@EqualsAndHashCode
@ToString

public class Ticket
{
    public Ticket(Ticket ticket)
    {

    }

    public void setId(int id) {
        this.id = ++counter;
    }

    private static int counter;
    private  int id;
    private LocalDate localDate;
    private TicketStatus ticketStatus = TicketStatus.VALID;
    private String qrCode;
    private int clientId;


    public Ticket(int id, LocalDate localDate, TicketStatus ticketStatus, String qrCode, int clientId)
    {
        this.localDate = localDate;
        this.ticketStatus = TicketStatus.VALID;
        this.qrCode = qrCode;
        this.id = ++counter;
        this.clientId = clientId;
    }


    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("\n").append("Номер билета: ").append(id).append("\n")
                .append("Дата поупки билета: ").append(localDate).append("\n")
                .append("Статус билета: ").append(TicketStatus.VALID).append("\n")
                .append("QR код: ").append(qrCode).append("\n")
                .append("Номер покупателя билета: ").append(clientId).append("\n").append(" ]");
        return sb.toString();
    }
}
