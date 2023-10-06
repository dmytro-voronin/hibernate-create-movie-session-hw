package mate.academy.service.impl;

import mate.academy.dao.CinemaHallDao;
import mate.academy.lib.Inject;
import mate.academy.lib.Service;
import mate.academy.model.CinemaHall;
import mate.academy.service.CinemaHallService;

import java.util.List;
import java.util.Optional;

@Service
public class CinemaHallServiceImpl implements CinemaHallService {
    @Inject
    private CinemaHallDao cinemaHallDao;
    @Override
    public CinemaHall add(CinemaHall cinemaHall) {
        return cinemaHallDao.add(cinemaHall);
    }

    @Override
    public Optional<CinemaHall> get(Long id) {
        return cinemaHallDao.get(id);
    }

    @Override
    public List<CinemaHall> getAll() {
        return cinemaHallDao.getAll();
    }
}