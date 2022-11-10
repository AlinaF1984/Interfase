package ru.netology.interfase;

public class TicketRepositiry {
    private Ticket[] tickets = new Ticket[0];

    public Ticket[] findAll() {
        return tickets;
    }

    public void add(Ticket ticket) {
        Ticket[] tmp = new Ticket[tickets.length + 1];
        System.arraycopy(tickets, 0, tmp, 0, tickets.length);
        tmp[tickets.length - 1] = ticket;
        tickets = tmp;
    }

     public void removeTicket(int id) {
       Ticket[] tmp = new Ticket[tickets.length - 1];
      int indexTo = 0;
       for (Ticket ticket : tickets) {
          if (ticket.getId() != id) {
          tmp[indexTo] = ticket;
             indexTo++;
       }
      }
       tickets = tmp;
    }

}
