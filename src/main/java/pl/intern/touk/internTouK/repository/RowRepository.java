package pl.intern.touk.internTouK.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.intern.touk.internTouK.model.RowSeats;


public interface RowRepository extends JpaRepository<RowSeats, Long> {
}
