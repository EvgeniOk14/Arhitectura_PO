package org.example.CustomersAnTickets;

import java.time.LocalDate;
import java.util.concurrent.ThreadLocalRandom;

public class GenerateRandomDate
{
    public LocalDate generateRandomDate(LocalDate startDate, LocalDate endDate)
    {
        long startEpochDay = startDate.toEpochDay();
        long endEpochDay = endDate.toEpochDay();

        long randomEpochDay = ThreadLocalRandom.current().nextLong(startEpochDay, endEpochDay);

        return LocalDate.ofEpochDay(randomEpochDay);
    }
}
