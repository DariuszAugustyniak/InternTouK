package pl.intern.touk.InternTouK.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.intern.touk.InternTouK.model.Cinema;
import pl.intern.touk.InternTouK.model.Screening;

@Repository
public interface CinemaRepository extends JpaRepository<Cinema, String> {
}
