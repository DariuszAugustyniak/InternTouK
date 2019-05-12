package pl.intern.touk.internTouK.initializer;

import pl.intern.touk.internTouK.model.Seat;
import pl.intern.touk.internTouK.model.SeatState;
import pl.intern.touk.internTouK.model.Ticket;

public class SeatInitializer {

    public static Seat createFreeSeat() {
        Seat seat = new Seat();
        seat.setSeatState(SeatState.FREE);
        return seat;
    }

}
