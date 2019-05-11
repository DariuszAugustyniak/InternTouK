package pl.intern.touk.InternTouK.DTO;

import java.time.Duration;
import java.time.LocalDateTime;

public class ScreeningDTO {

    private LocalDateTime date;
    private String title;
    private Duration filmDuration;
    private RoomDTO roomDTO;


    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
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

    public RoomDTO getRoomDTO() {
        return roomDTO;
    }

    public void setRoomDTO(RoomDTO roomDTO) {
        this.roomDTO = roomDTO;
    }
}
