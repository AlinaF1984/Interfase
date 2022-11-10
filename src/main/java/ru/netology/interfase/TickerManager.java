package ru.netology.interfase;

import java.util.Arrays;

public class TickerManager {
    private TicketRepositiry repositiry;

    public TickerManager(TicketRepositiry repositiry) {
        this.repositiry = repositiry;
    }

    public void add(Ticket product) {
        repositiry.add(product);
    }

    public Ticket[] findAll(String from, String to) {
        Ticket[] result = new Ticket[0];
        for (Ticket ticket : repositiry.findAll()) {
            if (match(ticket, from, to)) {
                Ticket[] tmp = new Ticket[result.length + 1];
                System.arraycopy(result, 0, tmp, 0, result.length);
                tmp[tmp.length - 1] = ticket;
                result = tmp;
            }
        }
        Arrays.sort(result);
        return result;
    }


    private boolean match(Ticket ticket, String from, String to) {
        if (ticket.getFrom().equals(from)) {
            return ticket.getTo().equals(to);
        }
        return false;
    }
}

