package pl.intern.touk.internTouK.dto;

import java.util.List;

public class RowDTO {
    private List<SeatDTO> row;

    public List<SeatDTO> getRow() {
        return row;
    }

    public void setRow(List<SeatDTO> row) {
        this.row = row;
    }
}
