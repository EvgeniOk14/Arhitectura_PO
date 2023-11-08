package ru.geekbrains.lesson8.Models;

import ru.geekbrains.lesson8.Presenters.Model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class TableModel implements Model
{

    private Collection<Table> tables;

//    @Override
    public Collection<Table> loadTables()
    {
        if (tables == null)
        {
            tables = new ArrayList<>();
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
        }
        return tables;
    }

    @Override
    public int reservationTable(Date reservationDate, int tableNo, String name)
    {
        for (Table table : tables)
        {
            if (table.getNo() == tableNo)
            {
                Reservation reservation = new Reservation(tableNo, reservationDate, name);
                table.getReservations().add(reservation);
                return reservation.getId();
            }
        }
        throw new RuntimeException("Некорректный номер столика");
    }

    @Override
    public int changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name) {
        for(Table table: tables)
        {
            for(Reservation reservation: table.getReservations())
            {
                if(reservation.getId() == oldReservation)
                {
                    table.getReservations().remove(reservation);
                    reservationTable(reservationDate, tableNo, name);
                    return reservation.getId();
                }
                else
                {
                    throw new RuntimeException("Некорректный номер брони!\n Повторите ввод!");
                }
            }
        }
        return -1;
    }

    public int changeReservationTable()
    {
        return -1;
    }
}
