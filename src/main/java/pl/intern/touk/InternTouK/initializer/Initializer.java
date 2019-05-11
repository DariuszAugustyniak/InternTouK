package pl.intern.touk.InternTouK.initializer;

import pl.intern.touk.InternTouK.model.*;

import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Initializer {
    public static Cinema initialize() throws Exception {
        Cinema cinema = new Cinema();
        cinema.setName("Kino");
        ScreeningRoom screeningRoom1 = RoomInitializer.roomInitailzer(cinema, 1, 5,10);

        ScreeningRoom screeningRoom2 = RoomInitializer.roomInitailzer(cinema, 2, 7,7);

        ScreeningRoom screeningRoom3 = RoomInitializer.roomInitailzer(cinema, 3, 6,12);


        List<ScreeningRoom> screeningRooms = new ArrayList<>();
        screeningRooms.add(screeningRoom1);
        screeningRooms.add(screeningRoom2);
        screeningRooms.add(screeningRoom3);

        cinema.setRooms(screeningRooms);


        List<Screening> screenings = new ArrayList<>();
        screenings.add(ScreeningInitializer.createScreening("Film One", screeningRoom1, 120, 2019, 12, 10, 12, 0, cinema));
        screenings.add(ScreeningInitializer.createScreening("Film One", screeningRoom1, 120, 2019, 12, 10, 15, 30, cinema));
        screenings.add(ScreeningInitializer.createScreening("Film Two", screeningRoom1, 130, 2019, 12, 10, 19, 45, cinema));

        screenings.add(ScreeningInitializer.createScreening("Film Two", screeningRoom2, 130, 2019, 12, 10, 11, 10, cinema));
        screenings.add(ScreeningInitializer.createScreening("Film Three", screeningRoom2, 125, 2019, 12, 10, 15, 00, cinema));
        screenings.add(ScreeningInitializer.createScreening("Film Three", screeningRoom2, 125, 2019, 12, 10, 20, 30, cinema));

        screenings.add(ScreeningInitializer.createScreening("Film Three", screeningRoom2, 126, 2019, 12, 10, 11, 10, cinema));
        screenings.add(ScreeningInitializer.createScreening("Film Three", screeningRoom2, 125, 2019, 12, 10, 15, 30, cinema));
        screenings.add(ScreeningInitializer.createScreening("Film Two", screeningRoom2, 130, 2019, 12, 10, 20, 30, cinema));
        cinema.setScreenings(screenings);
        return cinema;

    }
}
