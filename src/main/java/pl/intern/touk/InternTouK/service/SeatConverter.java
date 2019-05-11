package pl.intern.touk.InternTouK.service;

import pl.intern.touk.InternTouK.DTO.RowDTO;
import pl.intern.touk.InternTouK.DTO.SeatDTO;
import pl.intern.touk.InternTouK.model.RowSeats;
import pl.intern.touk.InternTouK.model.Seat;
import pl.intern.touk.InternTouK.model.Ticket;

import java.util.ArrayList;
import java.util.List;

public abstract class SeatConverter {

    public static SeatDTO toSeatDTO (Seat seat){
        SeatDTO seatDTO = new SeatDTO();

        seatDTO.setName(seat.getTicket().getName());
        seatDTO.setPrice(seat.getTicket().getPrice());
        seatDTO.setSeatState(seat.getSeatState());
        seatDTO.setSurname(seat.getTicket().getSurname());
        seatDTO.setType(seat.getTicket().getType());

        return seatDTO;
    }

    public static List<SeatDTO> toSeatDTO1D (List<Seat> seats){
        List<SeatDTO> seatDTOs = new ArrayList<SeatDTO>();
        for (Seat seat: seats) {
            seatDTOs.add(toSeatDTO(seat));
        }
        return seatDTOs;
    }

    public static List<RowDTO> toSeatDTO(List<RowSeats> seats){
        List<RowDTO> seatDTOs = new ArrayList<>();

        for (RowSeats rowseat: seats) {
            RowDTO rowDTO = new RowDTO();
            rowDTO.setRow(toSeatDTO1D(rowseat.getRow()));
            seatDTOs.add(rowDTO);
        }
        return seatDTOs;
    }

    public static Seat toSeat (SeatDTO seatDTO){

        Seat seat = new Seat();
        Ticket ticket = new Ticket();

        seat.setSeatState(seatDTO.getSeatState());
        ticket.setName(seatDTO.getName());
        ticket.setSurname(seatDTO.getSurname());
        ticket.setType(seatDTO.getType());
        ticket.setPrice(seatDTO.getPrice());
        seat.setTicket(ticket);

        return  seat;
    }

    public static List<Seat> toSeat (List<SeatDTO> seatDTOs){
        List<Seat> seats = new ArrayList<Seat>();
        for (SeatDTO seatDTO: seatDTOs) {
            seats.add(toSeat(seatDTO));
        }
        return seats;
    }


}
