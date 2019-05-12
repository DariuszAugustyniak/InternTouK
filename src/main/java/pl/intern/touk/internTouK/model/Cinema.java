package pl.intern.touk.internTouK.model;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;


@Entity
@Table(name = "cinema")
public class Cinema {

    @Id
    private String name;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cinema")
    private List<ScreeningRoom> rooms;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cinema")
    private List<Screening> screenings;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cinema)) return false;
        Cinema cinema = (Cinema) o;
        return Objects.equals(getName(), cinema.getName()) &&
                Objects.equals(getRooms(), cinema.getRooms()) &&
                Objects.equals(getScreenings(), cinema.getScreenings());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getRooms(), getScreenings());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ScreeningRoom> getRooms() {
        return rooms;
    }

    public void setRooms(List<ScreeningRoom> rooms) {
        this.rooms = rooms;
    }

    public List<Screening> getScreenings() {
        return screenings;
    }

    public void setScreenings(List<Screening> screenings) {
        this.screenings = screenings;
    }
}
