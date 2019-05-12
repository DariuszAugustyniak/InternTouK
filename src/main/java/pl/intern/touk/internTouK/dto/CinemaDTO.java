package pl.intern.touk.internTouK.dto;

import java.util.List;

public class CinemaDTO {

    private String name;

    private List<RoomDTO> rooms;

    private List<ScreeningDTO> screenings;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<RoomDTO> getRooms() {
        return rooms;
    }

    public void setRooms(List<RoomDTO> rooms) {
        this.rooms = rooms;
    }

    public List<ScreeningDTO> getScreenings() {
        return screenings;
    }

    public void setScreenings(List<ScreeningDTO> screenings) {
        this.screenings = screenings;
    }
}
