package pl.intern.touk.InternTouK.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.intern.touk.InternTouK.DTO.ScreeningDTO;
import pl.intern.touk.InternTouK.model.Screening;
import pl.intern.touk.InternTouK.repository.ScreeningRepository;
import pl.intern.touk.InternTouK.service.ScreeningConverter;

import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping("/screening")
public class ScreeningController {
    @Autowired
    ScreeningRepository screeningRepository;

    @GetMapping("/{id}")
    ScreeningDTO getScreening(@PathVariable Long id) {
        return ScreeningConverter.toScreeningDTO(screeningRepository.findById(id).get());
    }

    @GetMapping
    Collection<ScreeningDTO> getScreenings(){
        return ScreeningConverter.toScreeningDTO(screeningRepository.findAll());
    }



}
