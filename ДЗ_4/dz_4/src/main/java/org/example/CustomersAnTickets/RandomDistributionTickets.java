package org.example.CustomersAnTickets;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;


public class RandomDistributionTickets {
    private final Datebase datebase;
    Collection<Customer> listOfCustomers;
    Collection<Ticket> listOfTickets;

    public RandomDistributionTickets(Collection<Customer> listOfCustomers, Collection<Ticket> listOfTickets, Datebase datebase) {
        this.datebase = datebase;
        this.listOfCustomers = listOfCustomers;
        this.listOfTickets = listOfTickets;
    }


    public void randomDistributionTickets(Collection<Customer> lictOfCustomer, Collection<Ticket> listOfTickets) {

//        Random random = new Random();
//
//        for (Customer customer : lictOfCustomer) {
//            while (lictOfCustomer.size() < 2 && !listOfTickets.isEmpty()) {
//                int randomIndex = random.nextInt(listOfTickets.size());
//
//                Ticket randomTicket = new ArrayList<>(listOfTickets).get(randomIndex); // Создайте новый экземпляр билета
//
//                listOfTickets.remove(randomTicket); // Удалите выбранный билет из общего списка
//                randomTicket.setClientId(customer.getId());
//                customer.getTickets().add(randomTicket); // Добавьте новый билет к покупателю
//                datebase.addCustomerWithTickets((Collection<Customer>) randomTicket);
//            }
//        }
//
//        System.out.println("Обновленный список покупателей:");
//        System.out.println(datebase.getListOfCustomers());
//        }
        Random random = new Random();

        for (Customer customer : listOfCustomers) {
            List<Ticket> availableTickets = listOfTickets.stream()
                    .filter(ticket -> ticket.getClientId() == 0)
                    .collect(Collectors.toList());

            if (availableTickets.size() < 2) {
                // Можно добавить логику обработки ситуации, когда недостаточно билетов.
                System.out.println("Недостаточно доступных билетов для " + customer.getFirstName() + " " + customer.getLastName());
            } else {
                for (int i = 0; i < 2; i++) {
                    int randomIndex = random.nextInt(availableTickets.size());
                    Ticket randomTicket = availableTickets.get(randomIndex);
                    randomTicket.setClientId(customer.getId());
                    customer.getTickets().add(randomTicket);
                    availableTickets.remove(randomIndex);
                }
            }
        }

            for (Customer customer : listOfCustomers) {
                System.out.println("Информация о покупателе:");
                System.out.println(customer);
                System.out.println("Билеты покупателя:");
                for (Ticket ticket : customer.getTickets()) {
                    System.out.println(ticket);
                }
                System.out.println(); // Добавляем пустую строку для разделения информации о разных покупателях
            }

    }


}


