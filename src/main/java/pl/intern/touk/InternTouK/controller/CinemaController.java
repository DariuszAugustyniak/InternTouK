package pl.intern.touk.InternTouK.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.intern.touk.InternTouK.DTO.CinemaDTO;
import pl.intern.touk.InternTouK.DTO.ScreeningDTO;
import pl.intern.touk.InternTouK.model.Cinema;
import pl.intern.touk.InternTouK.repository.CinemaRepository;
import pl.intern.touk.InternTouK.service.CinemaConverter;
import pl.intern.touk.InternTouK.service.ScreeningConverter;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/cinema")
public class CinemaController {

    @Autowired
    CinemaRepository cinemaRepository;

    @GetMapping("/{name}")
    CinemaDTO getCinema(@PathVariable String name) {
        return CinemaConverter.toCinemaDTO(cinemaRepository.findById(name).get());
    }



}
