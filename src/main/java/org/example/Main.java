package org.example;

import java.nio.file.Paths;

public class Main {
    private static final String menu =
            """
                    1. Podaj dwie daty aby wyświetlić nazwy filmów wydanych pomiędzy tymi datami
                    2. Wyświetl wszystkie informacje o losowym filmie
                    3. Podaj imię i nazwisko aktora aby wyświetlić nazwy filmów w jakich zagrał
                    4. Zakończ program""";

    public static void main(String[] args) {

        MovieLibrary movieLibrary = new MovieLibrary(JsonFileReader.getDataFromJsonFile(Paths.get("src/main/resources/movies.json")));

        while (true) {
            InputDataHandler inputDataHandler = new InputDataHandler();
            Movie movie = new Movie();
            switch (inputDataHandler.getIntFromUser(menu)) {
                case 1 -> movie.getFilmWithReleaseDateBetween(movieLibrary.getMoviesList(), inputDataHandler.getIntFromUser("Rok od"), inputDataHandler.getIntFromUser("Rok do"));
                case 2 -> movie.getAllInformationAboutRandomMovie(movieLibrary.getMoviesList());
                case 3 -> movie.getMoviesWhereActorPlays(movieLibrary.getMoviesList(), inputDataHandler.getTextFromUser("Actor first name: "), inputDataHandler.getTextFromUser("Actor last name: "));
                case 4 -> System.exit(0);
            }
        }
    }
}