package com.bollywood.service;

import com.bollywood.model.Bollywood;
import org.springframework.stereotype.Service;

import java.util.List;


public interface BollywoodService {

    boolean saveMovie(Bollywood movie);

    boolean isMovieAvailable(int movieId);


    List<Bollywood> findAll();

    boolean updateMovie(int movieID, Bollywood updateMovie);


    String deleteMovie(int movieId);
}
