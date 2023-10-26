package org.example.CustomersAnTickets;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

public class CreateCustomer
{
    private final Datebase datebase;

    public CreateCustomer(Datebase datebase) {
        this.datebase = datebase;
    }

    public Collection<Customer> createCustomer()
    {
        Customer customer1 = new Customer("Иванов","Иван", "Иван", "Иванов", "card1");
        Customer customer2 = new Customer( "Петров","Пётр", "Петров", "Пётр", "card2");
        Customer customer3 = new Customer("Сидоров","Сидор", "Сидоров", "Сидор", "card3");
        Customer customer4 = new Customer("Васильев","Василий","Васильев","Василий", "card4");
        Customer customer5 = new Customer("Максимов","Максим", "Максимов", "Максим", "card5");
        Customer customer6 = new Customer("Кириллов","Кирилл", "Кириллов", "Кирилл", "card6");
        Customer customer7 = new Customer("Михайлов","Михаил", "Михайлов", "Михаил", "card7");
        Customer customer8 = new Customer("Андреев","Андрей", "Андреев", "Андрей", "card8");
        Customer customer9 = new Customer("Антипов","Антип", "Антипов", "Антип", "card9");
        Customer customer10 = new Customer("Антонов","Антон", "Антонов", "Антон", "card10");

        Collection<Customer> listOfCustomers = new ArrayList<>();

        listOfCustomers.add(customer1);
        listOfCustomers.add(customer2);
        listOfCustomers.add(customer3);
        listOfCustomers.add(customer4);
        listOfCustomers.add(customer5);
        listOfCustomers.add(customer6);
        listOfCustomers.add(customer7);
        listOfCustomers.add(customer8);
        listOfCustomers.add(customer9);
        listOfCustomers.add(customer10);

        return  listOfCustomers;
    }

    public Customer getCustomer(Datebase datebase)
    {

        List<Customer> copyList = new ArrayList<>(datebase.getListOfCustomers());
        Random random = new Random();
        int randomIndex = random.nextInt(copyList.size());
        Customer randomCustomer = copyList.get(randomIndex);
        return  randomCustomer;
    }
}
