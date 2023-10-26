package org.example.CustomersAnTickets;

import java.util.Collection;

public class Core
{
        private final CustomerProvider customerProvider;
        private final TicketProvider ticketProvider;
        private final PaymentProvider paymentProvider;
        private final Datebase database;
        private final MobileApp mobileApp;
        private final BusStation busStation;
        private Collection<Customer> listOsCustomers;
        private Collection<Ticket> listOfTickets;
        public Core()
        {
            database = new Datebase();
            customerProvider = new CustomerProvider(database);
            paymentProvider = new PaymentProvider();
            ticketProvider = new TicketProvider(database, paymentProvider);
            mobileApp = new MobileApp(ticketProvider, customerProvider, database, listOsCustomers, listOfTickets);
            busStation = new BusStation(ticketProvider);
        }

        /**
         * Внешний сервис
         * @return возвращает сервис по работе с билетами
         */
        public TicketProvider getTicketProvider()
        {
            return ticketProvider;
        }

        /**
         * Внешний сервис
         * @return возвращает сервис по работе с покупателями
         */
        public CustomerProvider getCustomerProvider()
        {

            return customerProvider;
        }

    /**
     * Внешний сервис
     * @return возвращает сервис по рааботе с платежами за билеты
     */
        public PaymentProvider getPaymentProvider()
        {
            return paymentProvider;
        }

    /**
     * Внешний сервис
     * @return возвращает сервис по рааботе с базой данных
     */
        public Datebase getDatabase()
        {
            return database;
        }
    /** Внешний сервис
     * @return возвращает сервис по работе с MobileApp **/
        public MobileApp getMobileApp()
        {
            return mobileApp;
        }

    /** Внешний сервис
     * @return возвращает сервис по работе с BusStaition **/
    public BusStation getBusStation()
    {
        return busStation;
    }

}
