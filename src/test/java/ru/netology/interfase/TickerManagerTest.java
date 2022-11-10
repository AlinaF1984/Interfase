package ru.netology.interfase;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TickerManagerTest {

    @Test
    public void fewTicketFound() {
        TicketRepositiry repo = new TicketRepositiry();
        TickerManager manager = new TickerManager(repo);

        Ticket ticket = new Ticket(1, 100, "UFA", "OMSK");
        Ticket ticket2 = new Ticket(2, 150, "UFA", "OMSK");
        Ticket ticket3 = new Ticket(3, 200, "UFA", "OMSK");
        Ticket ticket4 = new Ticket(4, 250, "UFA", "OMSK");
        Ticket ticket5 = new Ticket(5, 200, "ORSK", "OMSK");
        Ticket ticket6 = new Ticket(6, 300, "UFA", "MOSKVA");
        Ticket ticket7 = new Ticket(7, 350, "UFA", "ORSK");

        manager.add(ticket);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);


        Ticket[] actual = manager.findAll("OMSK", "UFA");
        Ticket[] expected = {ticket, ticket2, ticket3, ticket4};

        Assertions.assertArrayEquals(expected, actual);

    }
}