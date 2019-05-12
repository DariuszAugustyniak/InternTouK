package pl.intern.touk.internTouK;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.intern.touk.internTouK.initializer.Initializer;
import pl.intern.touk.internTouK.model.*;
import pl.intern.touk.internTouK.repository.CinemaRepository;

@SpringBootApplication
public class InternTouKApplication implements CommandLineRunner {

    @Autowired
    CinemaRepository cinemaRepository;

    public static void main(String[] args) {
        SpringApplication.run(InternTouKApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Cinema cinema = Initializer.initialize();

        cinemaRepository.save(cinema);

    }
}
