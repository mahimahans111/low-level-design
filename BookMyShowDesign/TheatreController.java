package BookMyShowDesign;

import BookMyShowDesign.Enums.City;

import java.util.*;

public class TheatreController {
    Map<City, List<Theatre>> cityVsTheatre;
    List<Theatre> allTheatres;

    TheatreController(){
        cityVsTheatre = new HashMap<>();
        allTheatres = new ArrayList<>();
    }

    void addTheatre(Theatre theatre, City city){
        allTheatres.add(theatre);
        List<Theatre> theatresInCity = cityVsTheatre.getOrDefault(city, new ArrayList<>());
        theatresInCity.add(theatre);
        cityVsTheatre.put(city, theatresInCity);
    }

    Map<Theatre, List<Show>> getAllShow(Movie movie, City city) {

        //get all the theater of this city

        Map<Theatre, List<Show>> theatreVsShows = new HashMap<>();

        List<Theatre> theatres = cityVsTheatre.get(city);

        //filter the theatres which run this movie

        for(Theatre theatre : theatres) {

            List<Show> givenMovieShows = new ArrayList<>();
            List<Show> shows = theatre.getShows();

            for(Show show : shows) {
                if(show.movie.getMovieId() == movie.getMovieId()) {
                    givenMovieShows.add(show);
                }
            }
            if(!givenMovieShows.isEmpty()) {
                theatreVsShows.put(theatre, givenMovieShows);
            }
        }

        return theatreVsShows;
    }
}
