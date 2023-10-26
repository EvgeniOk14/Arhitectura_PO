package org.example.CustomersAnTickets;

public class BusStation
{
        private final TicketProvider ticketProvider;

        public BusStation(TicketProvider ticketProvider)
        {
            this.ticketProvider = ticketProvider;

        }





    public void checkTicket(String qrCode)
        {
            ticketProvider.checkTicket(qrCode);
        }

}


