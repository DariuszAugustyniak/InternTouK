package pl.intern.touk.InternTouK.DTO;

import java.util.List;

public class RoomDTO {



    private List<RowDTO> seatDTOs;
    
    private String name;




    public List<RowDTO> getSeatDTOs() {
        return seatDTOs;
    }

    public void setSeatDTOs(List<RowDTO> seatDTOs) {
        this.seatDTOs = seatDTOs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
