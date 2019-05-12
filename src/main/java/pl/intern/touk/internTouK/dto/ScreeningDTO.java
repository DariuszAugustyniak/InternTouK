package pl.intern.touk.internTouK.dto;

import java.time.Duration;
import java.time.LocalDateTime;

public class ScreeningDTO {

    private Long id;
    private LocalDateTime date;
    private String title;
    private Duration filmDuration;
    private RoomDTO roomDTO;


    public LocalDateTime getDate() {
        return date;
    }

    public Long getId() {return id;}

    public void setId(Long id) {this.id = id;}

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
