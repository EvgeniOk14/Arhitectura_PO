package org.example.CustomersAnTickets;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

public class CreateTicket
{
    public Collection<Ticket> createTicket()
    {
        Collection<Ticket> listOfTickets = new ArrayList<>();
        GenerateRandomDate generateRandomDate = new GenerateRandomDate();
        LocalDate startDate = LocalDate.of(2023, 7, 25); // Начальная дата
        LocalDate endDate = LocalDate.of(2023, 10, 25);  // Конечная дата

        // Создаем и добавляем билеты с уникальными номерами
        for (int i = 0; i < 20; i++)
        {

            LocalDate randomDate = generateRandomDate.generateRandomDate(startDate, endDate);
            Ticket ticket = new Ticket(i +1, randomDate ,TicketStatus.VALID, "qr" + (i + 1), 0);
            listOfTickets.add(ticket);
        }

    return  listOfTickets;
    }


    public Collection<Ticket> createNewTicket() {

        Collection<Ticket> listOfNewTicket = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Ticket ticket = new Ticket(i + 100, null, TicketStatus.VALID, "qr" + (i + 100), 0);
            listOfNewTicket.add(ticket);
        }
        return listOfNewTicket;
    }
}
