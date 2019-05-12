package pl.intern.touk.internTouK.model;

import pl.intern.touk.internTouK.validator.NameConstraint;
import pl.intern.touk.internTouK.validator.SurNameConstraint;

import javax.persistence.*;

@Entity
public class Ticket implements Cloneable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private TicketType type;
    private Double price;
    @NameConstraint
    private String name;
    @SurNameConstraint
    private String surname;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "TICKET_ID")
    private Seat seat;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Ticket() {
    }

    public Ticket(TicketType type, Double price, String name, String surname) {
        this.type = type;
        this.price = price;
        this.name = name;
        this.surname = surname;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public TicketType getType() {
        return type;
    }

    public void setType(TicketType type) {
        this.type = type;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
