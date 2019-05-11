package pl.intern.touk.InternTouK.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class RowSeats {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne()
    @JoinColumn(name = "Room_ID")
    private ScreeningRoom screeningRoom;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "rowSeats")
    private List<Seat> row;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ScreeningRoom getScreeningRoom() {
        return screeningRoom;
    }

    public void setScreeningRoom(ScreeningRoom screeningRoom) {
        this.screeningRoom = screeningRoom;
    }

    public List<Seat> getRow() {
        return row;
    }

    public void setRow(List<Seat> row) {
        this.row = row;
    }
}
