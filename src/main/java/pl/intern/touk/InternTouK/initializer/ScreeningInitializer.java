package pl.intern.touk.InternTouK.initializer;

import pl.intern.touk.InternTouK.model.Cinema;
import pl.intern.touk.InternTouK.model.Screening;
import pl.intern.touk.InternTouK.model.ScreeningRoom;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class ScreeningInitializer {

    public static Screening createScreening(String title , ScreeningRoom screeningRoom, Integer durationInMinutes, Integer year, Integer month, Integer day, Integer hour, Integer minute, Cinema cinema) throws Exception{
        Screening screening = new Screening();
        screening.setScreeningRoom((ScreeningRoom) screeningRoom.clone());
        screening.setTitle(title);
        screening.setFilmDuration(Duration.ofMinutes(durationInMinutes));
        screening.setDate(LocalDateTime.of(year,month,day,hour,minute));
        screening.setCinema(cinema);
        return screening;
    }
}
