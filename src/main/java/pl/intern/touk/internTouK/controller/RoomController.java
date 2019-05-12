package pl.intern.touk.internTouK.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.intern.touk.internTouK.dto.RoomDTO;
import pl.intern.touk.internTouK.repository.RoomRepository;
import pl.intern.touk.internTouK.service.RoomConverter;

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
