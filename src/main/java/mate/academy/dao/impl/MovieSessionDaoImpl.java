package mate.academy.dao.impl;

import mate.academy.dao.MovieSessionDao;
import mate.academy.model.MovieSession;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class MovieSessionDaoImpl implements MovieSessionDao {
    @Override
    public List<MovieSession> findAvailableSessions(Long movieId, LocalDate date) {
        return null;
    }

    @Override
    public Optional<MovieSession> get(Long id) {
        return Optional.empty();
    }

    @Override
    public MovieSession add(MovieSession session) {
        return null;
    }
}
