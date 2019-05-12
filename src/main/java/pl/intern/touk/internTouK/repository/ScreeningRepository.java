package pl.intern.touk.internTouK.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.intern.touk.internTouK.model.Screening;

import java.time.LocalDateTime;
import java.util.List;


@Repository
public interface ScreeningRepository extends JpaRepository<Screening, Long> {

    List<Screening> findByDateGreaterThan(LocalDateTime time);

}
