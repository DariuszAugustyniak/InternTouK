package pl.intern.touk.internTouK.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.intern.touk.internTouK.model.ScreeningRoom;

public interface RoomRepository extends JpaRepository<ScreeningRoom, Long> {
}
