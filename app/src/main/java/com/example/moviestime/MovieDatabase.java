package com.example.moviestime;

import java.util.ArrayList;
import java.util.List;

public class MovieDatabase {
    public static List<Movie> getMovies() {
        List<Movie> movies = new ArrayList<>();

        movies.add(new Movie("Атаман", "Жанр 1", 2023, 9.0, "https://cinematica.kg/movies/2062", R.drawable.ataman));
        movies.add(new Movie(" Тролли 3", "мультфильм", 2023, 7.8, "https://cinematica.kg/movies/2001", R.drawable.trolly3));
        movies.add(new Movie("Аяш 3", "Комедия", 2023, 8.8, "https://cinematica.kg/movies/2006", R.drawable.ayash3));
        movies.add(new Movie("Каптан Марвел 2", "фэнтези", 2023, 6.9, "https://cinematica.kg/movies/2043", R.drawable.cap_marvel));
        movies.add(new Movie("Катастрофа", "Триллер", 2020, 5.8, "https://cinematica.kg/movies/2035", R.drawable.katastrofa));


        return movies;
    }
}

