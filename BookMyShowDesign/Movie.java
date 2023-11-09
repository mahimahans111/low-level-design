package BookMyShowDesign;

public class Movie {
    int movieId;
    String movieName;
    int movieDurationInMinutes;

    public void setMovieId(int movieId){
        this.movieId = movieId;
    }
    public int getMovieId() {
        return movieId;
    }

    public void setMovieName(String movieName){
        this.movieName = movieName;
    }

    public String getMovieName(){
        return this.movieName;
    }
    public void setMovieDurationInMinutes(int movieDurationInMinutes){
        this.movieDurationInMinutes = movieDurationInMinutes;
    }
    public int getMovieDurationInMinutes(){
        return movieDurationInMinutes;
    }
}
