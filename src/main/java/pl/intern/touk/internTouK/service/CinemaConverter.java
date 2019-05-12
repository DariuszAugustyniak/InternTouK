package pl.intern.touk.internTouK.service;

import pl.intern.touk.internTouK.dto.CinemaDTO;
import pl.intern.touk.internTouK.model.Cinema;

public abstract class CinemaConverter {


    public static CinemaDTO toCinemaDTO(Cinema cinema) {
        CinemaDTO cinemaDTO = new CinemaDTO();
        cinemaDTO.setName(cinema.getName());
        cinemaDTO.setRooms(RoomConverter.toRoomDTO(cinema.getRooms()));
        cinemaDTO.setScreenings(ScreeningConverter.toScreeningDTO(cinema.getScreenings()));


        return cinemaDTO;
    }


}
