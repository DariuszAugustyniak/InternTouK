package pl.intern.touk.internTouK.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.intern.touk.internTouK.dto.CinemaDTO;
import pl.intern.touk.internTouK.repository.CinemaRepository;
import pl.intern.touk.internTouK.service.CinemaConverter;

@RestController
@RequestMapping("/cinema")
public class CinemaController {

    @Autowired
    CinemaRepository cinemaRepository;

    @GetMapping("/{name}")
    CinemaDTO getCinema(@PathVariable String name) {
        CinemaDTO cinemaDTO =CinemaConverter.toCinemaDTO(cinemaRepository.findById(name).get());
        return cinemaDTO;
    }


}
