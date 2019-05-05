package pl.intern.touk.InternTouK.model;

import java.util.ArrayList;
import java.util.Collection;

public class Cinema {

    private String name;
    private Collection<ScreeningRoom> rooms;
    private Collection<Screening> screenings;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Collection<ScreeningRoom> getRooms() {
        return rooms;
    }

    public void setRooms(Collection<ScreeningRoom> rooms) {
        this.rooms = rooms;
    }

    public Collection<Screening> getScreenings() {
        return screenings;
    }

    public void setScreenings(Collection<Screening> screenings) {
        this.screenings = screenings;
    }
}
