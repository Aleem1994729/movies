package com.bollywood.service.impl;
import com.bollywood.model.Bollywood;
import com.bollywood.repo.BollywoodRepository;
import com.bollywood.service.BollywoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BollywoodServiceImpl implements BollywoodService {

    @Autowired
    BollywoodRepository bollywoodRepository;

    @Override
    public boolean saveMovie(Bollywood movie) {
        try {
            bollywoodRepository.save(movie);
            return true;
        }
        catch(Exception e){
            return false;
        }
    }

    @Override
    public boolean isMovieAvailable(int movieId) {
        return bollywoodRepository.findById(movieId).isPresent();
    }


    @Override
    public List<Bollywood> findAll() {
        return bollywoodRepository.findAll();
    }

    @Override
    public boolean updateMovie(int movieId, Bollywood updateMovie) {
        try {
            updateMovie.setMovieId(movieId);
            bollywoodRepository.save(updateMovie);
            return true;
        }catch(Exception e){
            return false;
        }
    }

    @Override
    public String deleteMovie(int movieId) {
        if(isMovieAvailable(movieId)){
            Bollywood deleteMovie = bollywoodRepository.findById(movieId).get();
            bollywoodRepository.delete(deleteMovie);
            return "Movie Deleted";
        }
        else{
            return "Movie is not available in database to delete or it is deleted already";
        }
    }
}
