package pl.intern.touk.InternTouK.initializer;

import pl.intern.touk.InternTouK.model.Ticket;
import pl.intern.touk.InternTouK.model.TicketType;

public class TicketInitializer {

    public Ticket createNormal(){
        Ticket ticket = new Ticket();
        ticket.setType(TicketType.ADULT);
        ticket.setPrice(25.00);
        ticket.setName("name");
        ticket.setSurname("surname");
        return ticket;
    }
    public Ticket createNormal(String name,String surname){
        Ticket ticket = new Ticket();
        ticket.setType(TicketType.ADULT);
        ticket.setPrice(25.00);
        ticket.setName(name);
        ticket.setSurname(surname);
        return ticket;
    }
    public Ticket createStudent(){
        Ticket ticket = new Ticket();
        ticket.setType(TicketType.STUDENT);
        ticket.setPrice(18.00);
        ticket.setName("name");
        ticket.setSurname("surname");
        return ticket;
    }
    public Ticket createStudent(String name,String surname){
        Ticket ticket = new Ticket();
        ticket.setType(TicketType.STUDENT);
        ticket.setPrice(18.00);
        ticket.setName(name);
        ticket.setSurname(surname);
        return ticket;
    }
    public Ticket createKid(){
        Ticket ticket = new Ticket();
        ticket.setType(TicketType.CHILD);
        ticket.setPrice(12.50);
        ticket.setName("name");
        ticket.setSurname("surname");
        return ticket;
    }
    public Ticket createKid(String name,String surname){
        Ticket ticket = new Ticket();
        ticket.setType(TicketType.CHILD);
        ticket.setPrice(12.50);
        ticket.setName(name);
        ticket.setSurname(surname);
        return ticket;
    }

}
