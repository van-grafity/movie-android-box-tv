package com.ivansuhendra.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.leanback.widget.Presenter;

import com.bumptech.glide.Glide;

public class CardPresenter extends Presenter {
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_card, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, Object item) {
        Movie movie = (Movie) item;
        View view = viewHolder.view;
        ImageView imageView = view.findViewById(R.id.movie_image);
        TextView titleView = view.findViewById(R.id.movie_title);

        Glide.with(view.getContext()).load(movie.getImageUrl()).into(imageView);
        titleView.setText(movie.getName());
    }

    @Override
    public void onUnbindViewHolder(ViewHolder viewHolder) {
        // Clean up resources
    }
}
