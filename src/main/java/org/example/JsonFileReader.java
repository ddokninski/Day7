package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JsonFileReader {

    public static List<Movie> getDataFromJsonFile(Path path) {
        ObjectMapper objectMapper = new ObjectMapper();
        List<Movie> movieList = new ArrayList<>();
        try {
            movieList = Arrays.asList(objectMapper.readValue(path.toFile(), Movie[].class));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return movieList;
    }
}
