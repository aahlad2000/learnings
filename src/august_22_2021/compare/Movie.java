package august_22_2021.compare;

import java.io.*;
import java.util.*;

// A class 'Movie' that implements Comparable
public class Movie implements Comparable<Movie>
{
    private double rating;
    private String name;
    private int year;

    // Used to sort movies by year
    @Override
    public int compareTo(Movie m)
    {
        return this.year - m.year;
    }

    // Constructor
    public Movie(String nm, double rt, int yr)
    {
        this.name = nm;
        this.rating = rt;
        this.year = yr;
    }

    // Getter methods for accessing private data
    public double getRating() { return rating; }
    public String getName()   {  return name; }
    public int getYear()      {  return year;  }

    public static void main(String args[]) {
        Movie dieHard1 = new Movie("Die hard 1", 7.8, 1997);
        Movie dieHard2 = new Movie("Die hard 2", 6.8, 2002);
        System.out.println(dieHard1.compareTo(dieHard2));
    }
}

// Class to compare Movies by ratings
