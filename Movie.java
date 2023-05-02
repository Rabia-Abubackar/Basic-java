//  Comparator
import java.io.*;
import java.util.*;
class Movie implements Comparable<Movie> {
    private double rating;
    private String name;
    private int year;

    public int compareTo(Movie m)
    {
        return this.year - m.year;
    }

    public Movie(String nm, double rt, int yr)
    {
        this.name = nm;
        this.rating = rt;
        this.year = yr;
    }

    public double getRating() { return rating; }
    public String getName() { return name; }
    public int getYear() { return year; }
}

class RatingCompare implements Comparator<Movie> {
    public int compare(Movie m1, Movie m2)
    {
        if (m1.getRating() < m2.getRating())
            return -1;
        if (m1.getRating() > m2.getRating())
            return 1;
        else
            return 0;
    }
}
class Main {
    public static void main(String[] args) {
        ArrayList<Movie> list = new ArrayList<Movie>();
        list.add(new Movie("Love Story", 8.3, 2020));
        list.add(new Movie("Sita Ramam", 8.7, 2022));
        list.add(new Movie("Ok Kanmani", 8.8, 2021));
        list.add(new Movie("Jodha Akbar", 8.5, 2000));

        System.out.println("Sorted by movie rating");
        RatingCompare ratingCompare = new RatingCompare();
        Collections.sort(list, ratingCompare);
        for (Movie movie : list)
            System.out.println(movie.getRating() + " " + movie.getName() + " " + movie.getYear());
    }
}