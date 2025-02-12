package com.Movie;


//Movie class implementing Comparable interface
class Movie implements Comparable<Movie> {
 private double rating;
 private String name;
 private int year;

 // Constructor
 public Movie(String name, double rating, int year) {
     this.name = name;
     this.rating = rating;
     this.year = year;
 }

 // Getter methods
 public double getRating() { return rating; }
 public String getName() { return name; }
 public int getYear() { return year; }

 // Overriding compareTo method to sort by year
 @Override
 public int compareTo(Movie other) {
     return this.year - other.year;
 }
}

