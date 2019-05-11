package pl.intern.touk.InternTouK.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.intern.touk.InternTouK.model.ScreeningRoom;

public interface RoomRepository extends JpaRepository<ScreeningRoom, Long> {
}
