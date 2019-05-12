package pl.intern.touk.internTouK.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.intern.touk.internTouK.dto.ScreeningDTO;
import pl.intern.touk.internTouK.dto.SeatDTO;
import pl.intern.touk.internTouK.model.Seat;
import pl.intern.touk.internTouK.model.SeatState;
import pl.intern.touk.internTouK.model.Ticket;
import pl.intern.touk.internTouK.model.TicketType;
import pl.intern.touk.internTouK.repository.ScreeningRepository;
import pl.intern.touk.internTouK.service.ScreeningConverter;
import pl.intern.touk.internTouK.service.SeatConverter;


import javax.validation.Valid;
import java.time.LocalDateTime;
import java.util.Collection;

@RestController
@RequestMapping("/screening")
public class ScreeningController {
    @Autowired
    ScreeningRepository screeningRepository;

    @GetMapping("/{id}")
    ScreeningDTO getScreening(@PathVariable Long id) {
        return ScreeningConverter.toScreeningDTO(screeningRepository.findById(id).get());
    }

    @GetMapping
    Collection<ScreeningDTO> getScreenings() {
        return ScreeningConverter.toScreeningDTO(screeningRepository.findAll());
    }

    @GetMapping("/{year}/{month}/{day}/{hour}/{minute}")
    Collection<ScreeningDTO> getScreenings(@PathVariable Integer year, @PathVariable Integer month, @PathVariable Integer day, @PathVariable Integer hour, @PathVariable Integer minute) {
        return ScreeningConverter.toScreeningDTO(screeningRepository.findByDateGreaterThan(LocalDateTime.of(year, month, day, hour, minute+15)));
    }
    @GetMapping("/put")
    TicketRequest putticketRequest (){
        TicketRequest ticketRequest =new TicketRequest();
        ticketRequest.setName("Janowł");
        ticketRequest.setSurname("Kowalową");
        ticketRequest.setType("STUDENT");
        ticketRequest.setSeatRequest(new SeatRequest());
        ticketRequest.getSeatRequest().setCollumn(3);
        ticketRequest.getSeatRequest().setRow(3);
        ticketRequest.getSeatRequest().setId(327L);
        return  ticketRequest;
    }
    @PutMapping("/request")
    double editSeat(@RequestBody @Valid TicketRequest ticketRequest,BindingResult result){

        if (result.hasErrors()){
            return -1.0;
        }
        int row = ticketRequest.getSeatRequest().getRow();
        int column = ticketRequest.getSeatRequest().getRow();
        Long id = ticketRequest.getSeatRequest().getId();

        Ticket ticket =new Ticket();
        ticket.setName(ticketRequest.getName());
        ticket.setSurname(ticketRequest.getSurname());
        String type = ticketRequest.getType();
        if(ticketRequest.getType().equals("ADULT")){
            ticket.setType(TicketType.ADULT);
            ticket.setPrice(25.00);
        }
        if(ticketRequest.getType().equals("STUDENT")){
            ticket.setType(TicketType.STUDENT);
            ticket.setPrice(18.00);
        }
        if(ticketRequest.getType().equals("CHILD")){
            ticket.setType(TicketType.CHILD);
            ticket.setPrice(12.50);
        }
        Seat seat =screeningRepository.findById(id).get().getScreeningRoom().getSeats().get(row).getRow().get(column);
        ticket.setSeat(seat);
        seat.setSeatState(SeatState.REASERVED);

        seat.setTicket(ticket);


      return ticket.getPrice();
    }

}
