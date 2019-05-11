package pl.intern.touk.InternTouK.service;

import pl.intern.touk.InternTouK.DTO.CinemaDTO;
import pl.intern.touk.InternTouK.DTO.RoomDTO;
import pl.intern.touk.InternTouK.DTO.SeatDTO;
import pl.intern.touk.InternTouK.model.Cinema;
import pl.intern.touk.InternTouK.model.ScreeningRoom;
import pl.intern.touk.InternTouK.model.Seat;
import pl.intern.touk.InternTouK.model.Ticket;

import java.util.ArrayList;
import java.util.List;

public abstract class CinemaConverter {





    public static CinemaDTO toCinemaDTO(Cinema cinema) {
        CinemaDTO cinemaDTO = new CinemaDTO();
        cinemaDTO.setName(cinema.getName());
        cinemaDTO.setRooms(RoomConverter.toRoomDTO(cinema.getRooms()));
        cinemaDTO.setScreenings(ScreeningConverter.toScreeningDTO(cinema.getScreenings()));


        return cinemaDTO;
    }


}
