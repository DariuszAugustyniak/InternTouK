package pl.intern.touk.InternTouK.DTO;

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
