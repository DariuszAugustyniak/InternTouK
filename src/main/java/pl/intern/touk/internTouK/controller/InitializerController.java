package pl.intern.touk.internTouK.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import pl.intern.touk.internTouK.model.Cinema;
import pl.intern.touk.internTouK.repository.CinemaRepository;
import pl.intern.touk.internTouK.repository.ScreeningRepository;

@Controller
public class InitializerController {

    @Autowired
    CinemaRepository cinemaRepository;

    @Autowired
    ScreeningRepository screeningRepository;

    public Cinema saveCinema(Cinema cinema) {
        return cinemaRepository.save(cinema);
    }
}
