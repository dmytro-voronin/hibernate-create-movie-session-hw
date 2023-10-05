package mate.academy.service;

import mate.academy.model.CinemaHall;

import java.util.List;
import java.util.Optional;

public interface CinemaHallService {
    CinemaHall add(CinemaHall cinemaHall);

    Optional<CinemaHall> get(Long id);
    
    List<CinemaHall> getAll();
}
