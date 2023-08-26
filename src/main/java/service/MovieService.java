package service;

import domain.Movie;
import repository.MovieRepository;

public class MovieService {
    public void favoritar(String userName, String movieName) {
        //UserRepository userRepository = new UserRepository();
        //User user = userRepository.findByName(userName);
        MovieRepository movieRepository = new MovieRepository();
        Movie movie = movieRepository.addFavorite(movieName);
        System.out.println(movie.getQtdFavorites());
    }
}
