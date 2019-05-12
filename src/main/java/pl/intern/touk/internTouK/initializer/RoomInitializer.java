package pl.intern.touk.internTouK.initializer;

import pl.intern.touk.internTouK.model.Cinema;
import pl.intern.touk.internTouK.model.RowSeats;
import pl.intern.touk.internTouK.model.ScreeningRoom;
import pl.intern.touk.internTouK.model.Seat;

import java.util.ArrayList;
import java.util.List;

public class RoomInitializer {
    public static ScreeningRoom roomInitailzer(Cinema cinema, Integer integer, Integer rows, Integer columns) {
        ScreeningRoom screeningRoom = new ScreeningRoom();
        screeningRoom.setCinema(cinema);
        screeningRoom.setName("Room " + integer);
        List<RowSeats> rowSeats = new ArrayList<>();
        for (int i = 0; i < columns; i++) {
            RowSeats rowSeat = new RowSeats();

            rowSeat.setScreeningRoom(screeningRoom);
            rowSeat.setRow(freeSeatsInitializer(rows));
            initializeSeats(rowSeat);
            rowSeats.add(rowSeat);
        }
        screeningRoom.setSeats(rowSeats);

        return screeningRoom;
    }

    private static List<Seat> freeSeatsInitializer(Integer rows) {
        List<Seat> seats = new ArrayList<>();

        List<Seat> rowSeats = new ArrayList<>();
        for (int i = 0; i < rows; i++) {
            rowSeats.add(SeatInitializer.createFreeSeat());
        }


        return rowSeats;
    }
    private static void initializeSeats(RowSeats rowSeats){
        for (Seat seat:rowSeats.getRow()) {
            seat.setRowSeats(rowSeats);
        }
    }
}
