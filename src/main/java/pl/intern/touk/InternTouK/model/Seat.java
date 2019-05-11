package pl.intern.touk.InternTouK.model;

import javax.persistence.*;
import java.util.Optional;

@Entity
public class Seat implements Cloneable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private SeatState seatState;

    @OneToOne(cascade = CascadeType.ALL)

    private Ticket ticket;
    @ManyToOne()
    @JoinColumn(name = "Row_ID")
    private RowSeats rowSeats;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Seat seat = (Seat) super.clone();
        Optional<Ticket> ticketOptional = Optional.ofNullable(this.ticket);
        if(ticketOptional.isPresent()){seat.setTicket((Ticket) this.ticket.clone());}

        return seat;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public RowSeats getRowSeats() {
        return rowSeats;
    }

    public void setRowSeats(RowSeats rowSeats) {
        this.rowSeats = rowSeats;
    }

    public SeatState getSeatState() {
        return seatState;
    }

    public void setSeatState(SeatState seatState) {
        this.seatState = seatState;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
}
