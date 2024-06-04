package javademo;

import java.util.Date;

public class TicketService {
    public Ticket bookTicket(Row[] rows, int money, String movieName, Date time){

       Ticket ticket = new Ticket();
       ticket.movieName=movieName;
       ticket.time=time;





        return ticket;
    }
}
