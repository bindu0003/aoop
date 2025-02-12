package com.Movie;

import java.util.*;

public class MovieSorter {
    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Inception", 8.8, 2010));
        movies.add(new Movie("The Godfather", 9.2, 1972));
        movies.add(new Movie("Interstellar", 8.6, 2014));
        movies.add(new Movie("Parasite", 8.6, 2019));
        
        // Sorting movies using Collections.sort()
        Collections.sort(movies);
        
        // Display sorted movies
        System.out.println("Movies sorted by year of release:");
        for (Movie movie : movies) {
            System.out.println(movie.getYear() + " - " + movie.getName() + " (Rating: " + movie.getRating() + ")");
        }
    }
}
