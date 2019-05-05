package pl.intern.touk.InternTouK.model;

import java.time.Duration;
import java.time.LocalDate;

public class Screening {

    private ScreeningRoom screeningRoom;
    private LocalDate date;
    private String title;
    private Duration filmDuration;

    public ScreeningRoom getScreeningRoom() {
        return screeningRoom;
    }

    public void setScreeningRoom(ScreeningRoom screeningRoom) {
        this.screeningRoom = screeningRoom;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Duration getFilmDuration() {
        return filmDuration;
    }

    public void setFilmDuration(Duration filmDuration) {
        this.filmDuration = filmDuration;
    }
}
