package pl.intern.touk.internTouK.dto;

import java.util.List;

public class RoomDTO {


    private List<RowDTO> rowDTOs;

    private String name;


    public List<RowDTO> getRowDTOs() {
        return rowDTOs;
    }

    public void setRowDTOs(List<RowDTO> rowDTOs) {
        this.rowDTOs = rowDTOs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
