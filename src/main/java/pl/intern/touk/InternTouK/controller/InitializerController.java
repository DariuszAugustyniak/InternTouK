package pl.intern.touk.InternTouK.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import pl.intern.touk.InternTouK.model.Cinema;
import pl.intern.touk.InternTouK.repository.CinemaRepository;
import pl.intern.touk.InternTouK.repository.ScreeningRepository;

@Controller
public class InitializerController {

    @Autowired
    CinemaRepository cinemaRepository;

    @Autowired
    ScreeningRepository screeningRepository;

    public Cinema saveCinema(Cinema cinema){
        return cinemaRepository.save(cinema);
    }
}
