package pl.intern.touk.internTouK.service;

import pl.intern.touk.internTouK.dto.ScreeningDTO;
import pl.intern.touk.internTouK.model.Screening;

import java.util.ArrayList;
import java.util.List;

public abstract class ScreeningConverter {

    public static ScreeningDTO toScreeningDTO(Screening screening) {
        ScreeningDTO screeningDTO = new ScreeningDTO();
        screeningDTO.setDate(screening.getDate());
        screeningDTO.setFilmDuration(screening.getFilmDuration());
        screeningDTO.setTitle(screening.getTitle());
        screeningDTO.setRoomDTO(RoomConverter.toRoomDTO(screening.getScreeningRoom()));
        screeningDTO.setId(screening.getId());

        return screeningDTO;
    }

    public static List<ScreeningDTO> toScreeningDTO(List<Screening> screenings) {
        List<ScreeningDTO> screeningDTOs = new ArrayList<>();
        for (Screening screening : screenings) {
            screeningDTOs.add(toScreeningDTO(screening));
        }
        return screeningDTOs;
    }


}
