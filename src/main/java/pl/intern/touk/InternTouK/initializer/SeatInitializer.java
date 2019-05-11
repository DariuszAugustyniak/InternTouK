package pl.intern.touk.InternTouK.initializer;

import pl.intern.touk.InternTouK.model.Seat;
import pl.intern.touk.InternTouK.model.SeatState;
import pl.intern.touk.InternTouK.model.Ticket;

import java.util.List;

public class SeatInitializer {

    public static Seat createFreeSeat(){
        Seat seat = new Seat();
        seat.setSeatState(SeatState.FREE);
        return seat;
    }
    public static Seat createReservedSeat(Ticket ticket){
        Seat seat = new Seat();
        seat.setSeatState(SeatState.REASERVED);
        seat.setTicket(ticket);
        return seat;
    }
    public static Seat createSoldSeat(Ticket ticket){
        Seat seat = new Seat();
        seat.setSeatState(SeatState.SOLD);
        seat.setTicket(ticket);
        return seat;
    }

}
