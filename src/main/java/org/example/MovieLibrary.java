package org.example;

import java.util.List;

public class MovieLibrary {

    private List<Movie> moviesList;

    public MovieLibrary(List<Movie> moviesList) {
        this.moviesList = moviesList;
    }

    public MovieLibrary() {
    }

    public List<Movie> getMoviesList() {
        return moviesList;
    }

    public void setMoviesList(List<Movie> moviesList) {
        this.moviesList = moviesList;
    }

    @Override
    public String toString() {
        return "MovieLibrary{" +
                "moviesList=" + moviesList +
                '}';
    }
}
