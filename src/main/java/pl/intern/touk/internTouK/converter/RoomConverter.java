package pl.intern.touk.internTouK.converter;

import pl.intern.touk.internTouK.dto.RoomDTO;
import pl.intern.touk.internTouK.model.ScreeningRoom;

import java.util.ArrayList;
import java.util.List;

public abstract class RoomConverter {
    public static RoomDTO toRoomDTO(ScreeningRoom screeningRoom) {
        RoomDTO roomDTO = new RoomDTO();
        roomDTO.setName(screeningRoom.getName());
        roomDTO.setRowDTOs(SeatConverter.toSeatDTO(screeningRoom.getSeats()));
        return roomDTO;
    }


    public static List<RoomDTO> toRoomDTO(List<ScreeningRoom> screeningRooms) {
        List<RoomDTO> RoomDTOs = new ArrayList<RoomDTO>();
        for (ScreeningRoom screeningRoom : screeningRooms) {
            RoomDTOs.add(toRoomDTO(screeningRoom));
        }
        return RoomDTOs;
    }

}
