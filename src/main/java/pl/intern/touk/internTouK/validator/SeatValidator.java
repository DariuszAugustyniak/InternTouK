package pl.intern.touk.internTouK.validator;

import org.springframework.beans.factory.annotation.Autowired;
import pl.intern.touk.internTouK.controller.SeatRequest;
import pl.intern.touk.internTouK.model.RowSeats;
import pl.intern.touk.internTouK.model.Seat;
import pl.intern.touk.internTouK.model.SeatState;
import pl.intern.touk.internTouK.repository.ScreeningRepository;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class SeatValidator implements ConstraintValidator<SeatConstraint, SeatRequest> {

    @Autowired
    ScreeningRepository screeningRepository;



    @Override
    public boolean isValid(SeatRequest seatRequest, ConstraintValidatorContext constraintValidatorContext) {
        int row = seatRequest.getRow();
        int column = seatRequest.getCollumn();
        Long id = seatRequest.getId();

        Seat seat = screeningRepository.findById(id).get().getScreeningRoom().getSeats().get(row).getRow().get(column);
        RowSeats rowSeats = seat.getRowSeats();
        int index = rowSeats.getRow().indexOf(seat);
        if (index - 2 >= 0) {
            if (SeatState.FREE.compareTo(rowSeats.getRow().get(index - 1).getSeatState()) == 0) {
                if ((SeatState.FREE.compareTo(rowSeats.getRow().get(index - 2).getSeatState()) != 0)) {
                    return false;
                }
            }
        }
        if (index + 2 < rowSeats.getRow().size()) {
            if (SeatState.FREE.compareTo(rowSeats.getRow().get(index + 1).getSeatState()) == 0) {
                if (!(SeatState.FREE.compareTo(rowSeats.getRow().get(index + 2).getSeatState()) == 0)) {
                    return false;
                }
            }
        }
        return true;

    }
}
