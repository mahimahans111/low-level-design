package BookMyShowDesign;

import BookMyShowDesign.Enums.*;

import java.util.*;
import java.io.*;

public class MovieController {
    Map<City, List<Movie>> cityVsMovies;
    List<Movie> allMovies;

    MovieController(){
        cityVsMovies = new HashMap<City, List<Movie>>();
        allMovies = new ArrayList<>();
    }

    void addMovie(Movie movie, City city){
        allMovies.add(movie);
        List<Movie> movies = cityVsMovies.getOrDefault(city, new ArrayList<>());
        movies.add(movie);
        cityVsMovies.put(city, movies);
    }

    Movie getMovieByName(String movieName){
        for(Movie movie: allMovies){
            if(movie.getMovieName().equals(movieName)){
                return movie;
            }
        }
        return null;
    }


    List<Movie> getMoviesByCity(City city) {
        return cityVsMovies.get(city);
    }
    //REMOVE movie from a particular city, make use of cityVsMovies map

    //UPDATE movie of a particular city, make use of cityVsMovies map

    //CRUD operation based on Movie ID, make use of allMovies list

}
