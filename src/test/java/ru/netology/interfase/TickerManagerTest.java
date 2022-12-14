package ru.netology.interfase;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class TickerManagerTest {

    @Test
    public void fewTicketFound() {
        TicketRepositiry repo = new TicketRepositiry();
        TickerManager manager = new TickerManager(repo);

        Ticket ticket = new Ticket(1, 400, "UFA", "OMSK");
        Ticket ticket2 = new Ticket(2, 150, "UFA", "OMSK");
        Ticket ticket3 = new Ticket(3, 200, "UFA", "OMSK");
        Ticket ticket4 = new Ticket(4, 250, "UFA", "OMSK");
        Ticket ticket5 = new Ticket(5, 230, "ORK", "OMSK");
        Ticket ticket6 = new Ticket(6, 300, "UFA", "MOSA");
        Ticket ticket7 = new Ticket(7, 350, "UFA", "ORK");

        manager.add(ticket);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);


        Ticket[] actual = manager.findAll("UFA", "OMSK");
        Ticket[] expected = {ticket2, ticket3, ticket4, ticket};

        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void oneTicketFound() {
        TicketRepositiry repo = new TicketRepositiry();
        TickerManager manager = new TickerManager(repo);

        Ticket ticket = new Ticket(1, 400, "UFA", "OMSK");
        Ticket ticket2 = new Ticket(2, 150, "UFA", "OMSK");
        Ticket ticket3 = new Ticket(3, 200, "UFA", "OMSK");
        Ticket ticket4 = new Ticket(4, 250, "UFA", "OMSK");
        Ticket ticket5 = new Ticket(5, 230, "ORK", "OMSK");
        Ticket ticket6 = new Ticket(6, 300, "UFA", "MOSA");
        Ticket ticket7 = new Ticket(7, 350, "UFA", "ORK");

        manager.add(ticket);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);


        Ticket[] actual = manager.findAll("ORK", "OMSK");
        Ticket[] expected = {ticket5};

        Assertions.assertArrayEquals(expected, actual);

    }@Test
    public void notTicketFound() {
        TicketRepositiry repo = new TicketRepositiry();
        TickerManager manager = new TickerManager(repo);

        Ticket ticket = new Ticket(1, 400, "UFA", "OMSK");
        Ticket ticket2 = new Ticket(2, 150, "UFA", "OMSK");
        Ticket ticket3 = new Ticket(3, 200, "UFA", "OMSK");
        Ticket ticket4 = new Ticket(4, 250, "UFA", "OMSK");
        Ticket ticket5 = new Ticket(5, 230, "ORK", "OMSK");
        Ticket ticket6 = new Ticket(6, 300, "UFA", "MOSA");
        Ticket ticket7 = new Ticket(7, 350, "UFA", "ORK");

        manager.add(ticket);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);


        Ticket[] actual = manager.findAll("MOSA", "OMSK");
        Ticket[] expected = {};

        Assertions.assertArrayEquals(expected, actual);

    }

}