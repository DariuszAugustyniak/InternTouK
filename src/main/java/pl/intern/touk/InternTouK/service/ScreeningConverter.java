package pl.intern.touk.InternTouK.service;

import pl.intern.touk.InternTouK.DTO.ScreeningDTO;
import pl.intern.touk.InternTouK.model.Screening;

import java.util.ArrayList;
import java.util.List;

public abstract class ScreeningConverter {

    public static ScreeningDTO toScreeningDTO(Screening screening){
        ScreeningDTO screeningDTO = new ScreeningDTO();
        screeningDTO.setDate(screening.getDate());
        screeningDTO.setFilmDuration(screening.getFilmDuration());
        screeningDTO.setTitle(screening.getTitle());
        screeningDTO.setRoomDTO(RoomConverter.toRoomDTO(screening.getScreeningRoom()));

        return screeningDTO;
    }

    public static List<ScreeningDTO> toScreeningDTO(List<Screening> screenings){
        List<ScreeningDTO> screeningDTOs = new ArrayList<>();
        for (Screening screening : screenings) {
            screeningDTOs.add(toScreeningDTO(screening));
        }
        return screeningDTOs;
    }


}
