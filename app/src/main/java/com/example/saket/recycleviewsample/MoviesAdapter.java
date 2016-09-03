package com.example.saket.recycleviewsample;

import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by saket on 02-Sep-16.
 */
public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MyViewHolder> {
    private List<Movie> MovieList;
    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, year, genre;
        public ImageView imageView;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            genre = (TextView) view.findViewById(R.id.genre);
            year = (TextView) view.findViewById(R.id.year);
            //imageView=(ImageView)view.findViewById(R.id.imageView);

        }
    }
    public MoviesAdapter(List<Movie> moviesList) {
        this.MovieList = moviesList;
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent,int viewType)
    {
        View itemView= LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_list_row,parent,false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        Movie movie=MovieList.get(position);
        holder.title.setText(movie.getTitle());
        holder.genre.setText(movie.getGenre());
        holder.year.setText(movie.getYear());
        //holder.imageView.setImageURI(movie.getImageView());
    }

    @Override
    public int getItemCount() {
        return MovieList.size();
    }
}

