package pl.intern.touk.internTouK.initializer;

import pl.intern.touk.internTouK.model.Cinema;
import pl.intern.touk.internTouK.model.Screening;
import pl.intern.touk.internTouK.model.ScreeningRoom;

import java.time.Duration;
import java.time.LocalDateTime;

public class ScreeningInitializer {

    public static Screening createScreening(String title, ScreeningRoom screeningRoom, Integer durationInMinutes, Integer year, Integer month, Integer day, Integer hour, Integer minute, Cinema cinema) throws Exception {
        Screening screening = new Screening();
        screening.setScreeningRoom((ScreeningRoom) screeningRoom.clone());
        screening.setTitle(title);
        screening.setFilmDuration(Duration.ofMinutes(durationInMinutes));
        screening.setDate(LocalDateTime.of(year, month, day, hour, minute));
        screening.setCinema(cinema);
        return screening;
    }
}
