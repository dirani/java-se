package repository;

import domain.Movie;

import java.util.HashSet;
import java.util.Set;

public class MovieRepository {
    static Set<Movie> movies = new HashSet<>();
    public Movie findByName(String movieName) {
        Movie movie = new Movie(movieName);
        if (movies.contains(movie)){
            System.out.println("if");
            return movies.stream().filter(m -> m.equals(movie)).findFirst().orElse(null);
        }

        movies.add(movie);
        return movie;
    }
    public Movie addFavorite(String movieName) {
        var movie = findByName(movieName);
        movie.addFavorite();
        return movie;
    }
}
