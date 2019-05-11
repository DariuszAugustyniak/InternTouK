package pl.intern.touk.InternTouK;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.intern.touk.InternTouK.controller.InitializerController;
import pl.intern.touk.InternTouK.initializer.Initializer;
import pl.intern.touk.InternTouK.model.*;
import pl.intern.touk.InternTouK.repository.CinemaRepository;
import pl.intern.touk.InternTouK.repository.RoomRepository;

import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class InternTouKApplication implements CommandLineRunner {
    @Autowired
    InitializerController initializerController;
    @Autowired
    RoomRepository roomRepository;
    public static void main(String[] args) {
        SpringApplication.run(InternTouKApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Cinema cinema = Initializer.initialize();


        initializerController.saveCinema(cinema);

       // roomRepository.save(screeningRoom1);

    }
}
