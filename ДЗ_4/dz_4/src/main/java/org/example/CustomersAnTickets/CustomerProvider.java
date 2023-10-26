package org.example.CustomersAnTickets;

import javax.swing.plaf.PanelUI;
import java.util.Collection;

public class CustomerProvider
{
    private final Datebase datebase;

    public CustomerProvider(Datebase datebase)
    {
        this.datebase = datebase;

    }

    /** Поиск покупателя по Логуну и Паролю **/
    public Customer getCustomer(String login, String password) throws IllegalAccessException
    {
            for (Customer customer : datebase.getListOfCustomers())
            {
                if (customer.getLoging().equals(login) && customer.getPassword().equals(password))
                {
                    System.out.println("Покупатель с таким паролем и логиным найден:\n " + customer);
                    return customer;
                }
            }

            {
                throw new IllegalAccessException("Пользователя с таким паролем и логиным нет! Авторизируйтесь!");
            }
    }
    /** Поиск билетов в БД **/
    public Collection<Ticket> getTicket()
    {
        return datebase.getListOfTickets();
    }

    /** Поиск покупателей в БД **/
    public Collection<Customer> getCustomers()
    {
        return datebase.getListOfCustomers();
    }


}

