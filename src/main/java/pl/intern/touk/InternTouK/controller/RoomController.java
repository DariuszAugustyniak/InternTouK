package pl.intern.touk.InternTouK.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.intern.touk.InternTouK.DTO.RoomDTO;
import pl.intern.touk.InternTouK.DTO.ScreeningDTO;
import pl.intern.touk.InternTouK.repository.RoomRepository;
import pl.intern.touk.InternTouK.service.RoomConverter;
import pl.intern.touk.InternTouK.service.ScreeningConverter;

import java.util.Collection;

@RestController
@RequestMapping("/room")
public class RoomController {
    @Autowired
    RoomRepository roomRepository;

    @GetMapping
    Collection<RoomDTO> getRooms() {
        return RoomConverter.toRoomDTO(roomRepository.findAll());
    }
}
