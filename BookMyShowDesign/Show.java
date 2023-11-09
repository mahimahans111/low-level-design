package BookMyShowDesign;

import java.util.ArrayList;
import java.util.List;

public class Show {
    int showId;
    Movie movie;
    Screen screen;
    int showStartTime;
    List<Integer> bookedSeatIds = new ArrayList<>();

    public int getShowId() {
        return showId;
    }

    public void setShowId(int showId) {
        this.showId = showId;
    }

    public int getShowStartTime() {
        return showStartTime;
    }

    public void setShowStartTime(int showStartTime) {
        this.showStartTime = showStartTime;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public List<Integer> getBookedSeatIds() {
        return bookedSeatIds;
    }

    public void setBookedSeatIds(List<Integer> bookedSeatIds) {
        this.bookedSeatIds = bookedSeatIds;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }
}
