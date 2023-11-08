package ru.geekbrains.lesson8.Presenters;

import ru.geekbrains.lesson8.Models.TableModel;
import ru.geekbrains.lesson8.Views.BookingView;

import java.util.Date;
import java.util.Scanner;

public class BookingPresenter implements ViewObserver
{

    private final Model model;
    private final View view;

    public BookingPresenter(Model model, View view)
    {
        this.model = model;
        this.view = view;
        this.view.registerObserver(this);
    }
    public void updateTables()
    {
        view.showTables(model.loadTables());
    }

    private void showReservationTableResult(int reservationNo)
    {
        view.showReservationTableResult(reservationNo);
    }

    @Override
    public void onReservationTable(Date reservtionDate, int tableNo, String name)
    {
        try
        {
            int reservationNo = model.reservationTable(reservtionDate, tableNo, name);
            showReservationTableResult(reservationNo);
        }
        catch (RuntimeException e)
        {
            showReservationTableResult(-1);
        }
    }

    @Override
    public void changeReservationTable()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер брони которую хотите отменить: ");
        int oldReservation = sc.nextInt();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите номер стола который хотите забронировать: ");
        int tableNo = sc1.nextInt();

        Scanner sc2= new Scanner(System.in);
        System.out.println("Введите имя на которое Вы хотите забронировать стол: ");
        String name = sc2.nextLine();

        try {
            int newReservationNo =  model.changeReservationTable(oldReservation, new Date(), tableNo, name);
            showReservationTableResult(newReservationNo);
        }
        catch (RuntimeException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
