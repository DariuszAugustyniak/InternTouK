package pl.intern.touk.internTouK.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.intern.touk.internTouK.model.Cinema;

@Repository
public interface CinemaRepository extends JpaRepository<Cinema, String> {
}
