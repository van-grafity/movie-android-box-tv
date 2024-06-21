package com.ivansuhendra.myapplication;

import android.os.Bundle;
import androidx.leanback.app.BrowseSupportFragment;
import androidx.leanback.widget.ArrayObjectAdapter;
import androidx.leanback.widget.HeaderItem;
import androidx.leanback.widget.ListRow;
import androidx.leanback.widget.ListRowPresenter;

import java.util.ArrayList;
import java.util.List;

public class MainFragment extends BrowseSupportFragment {
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setTitle("My Android TV App");

        // Set headers state
        setHeadersState(HEADERS_ENABLED);
        setHeadersTransitionOnBackEnabled(true);

        // Set up rows
        ArrayObjectAdapter rowsAdapter = new ArrayObjectAdapter(new ListRowPresenter());

        HeaderItem header = new HeaderItem(0, "Movies");
        ArrayObjectAdapter listRowAdapter = new ArrayObjectAdapter(new CardPresenter());

        // Add movies to the listRowAdapter
        List<Movie> movies = getMovies();
        for (Movie movie : movies) {
            listRowAdapter.add(movie);
        }

        rowsAdapter.add(new ListRow(header, listRowAdapter));
        setAdapter(rowsAdapter);
    }

    private List<Movie> getMovies() {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie(76, "The Dark Knight", "When the menace known as the Joker emerges...", 199, "https://images-na.ssl-images-amazon.com/images/M/MV5BMTMxNTMwODM0NF5BMl5BanBnXkFtZTcwODAyMTk2Mw@@._V1_SY1000_CR0,0,675,1000_AL_.jpg", 2008, "2016-01-05T00:00:00"));
        movies.add(new Movie(77, "Interstellar", "A team of explorers travel through a wormhole...", 129, "https://images-na.ssl-images-amazon.com/images/M/MV5BMjIxNTU4MzY4MF5BMl5BanBnXkFtZTgwMzM4ODI3MjE@._V1_SY1000_CR0,0,640,1000_AL_.jpg", 2014, "2017-07-16T00:00:00"));
        movies.add(new Movie(78, "Le fabuleux destin d'Amélie Poulain", "Amélie is an innocent and naive girl in Paris...", 100, "https://images-na.ssl-images-amazon.com/images/M/MV5BNDg4NjM1YjMtYmNhZC00MjM0LWFiZmYtNGY1YjA3MzZmODc5XkEyXkFqcGdeQXVyNDk3NzU2MTQ@._V1_SY1000_CR0,0,666,1000_AL_.jpg", 2001, "2017-07-10T00:00:00"));
        return movies;
    }
}
