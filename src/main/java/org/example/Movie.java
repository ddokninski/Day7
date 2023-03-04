package org.example;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Movie {
    private String title;
    private Integer releaseDate;
    private Director director;
    private String filmGenre;
    private List<Actor> actorsList;

    public Movie(String title, Integer releaseDate, Director director, String filmGenre, List<Actor> actorsList) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.director = director;
        this.filmGenre = filmGenre;
        this.actorsList = actorsList;
    }

    public Movie() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Integer releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public String getFilmGenre() {
        return filmGenre;
    }

    public void setFilmGenre(String filmGenre) {
        this.filmGenre = filmGenre;
    }

    public List<Actor> getActorsList() {
        return actorsList;
    }

    public void setActorsList(List<Actor> actorsList) {
        this.actorsList = actorsList;
    }

    @Override
    public String toString() {
        return
                "title: " + title + '\n' +
                        "releaseDate: " + releaseDate + '\n' +
                        "director: " + director + '\n' +
                        "filmGenre: " + filmGenre + '\n' +
                        "actorsList: " + actorsList + '\n';
    }

    public void getFilmWithReleaseDateBetween(List<Movie> movieList, int yearFrom, int yearTo) {
        List<Movie> filteredMovieList = movieList.stream()
                .filter(movie -> movie.getReleaseDate() >= yearFrom)
                .filter(movie -> movie.getReleaseDate() <= yearTo)
                .collect(Collectors.toList());
        System.out.println(filteredMovieList.isEmpty() ? "There are no videos for given dates" : filteredMovieList);
    }

    public void getAllInformationAboutRandomMovie(List<Movie> movieList) {
        Random random = new Random();
        System.out.println(movieList.get(random.nextInt(movieList.size())));
    }

    public boolean hasActorFirstName(Movie movie, String firstName) {
        return movie.getActorsList().stream()
                .anyMatch(m -> m.getFirstName().equals(firstName));
    }

    public boolean hasActorLastName(Movie movie, String lastName) {
        return movie.getActorsList().stream()
                .anyMatch(m -> m.getLastName().equals(lastName));
    }

    public void getMoviesWhereActorPlays(List<Movie> movieList, String actorFirstName, String actorLastName) {
        List<Movie> filteredMovieList = movieList.stream()
                .filter(movie -> movie.hasActorFirstName(movie, actorFirstName))
                .filter(movie -> movie.hasActorLastName(movie, actorLastName))
                .collect(Collectors.toList());
        System.out.println(filteredMovieList.isEmpty() ? "There are no videos for given dates" : filteredMovieList);
    }
}
