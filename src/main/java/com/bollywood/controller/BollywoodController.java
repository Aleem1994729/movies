package com.bollywood.controller;
import com.bollywood.model.Bollywood;
import com.bollywood.service.BollywoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/Bollywood/")
public class BollywoodController {

  private BollywoodService bollywoodService;

  @Autowired
  public void setBollywoodService(BollywoodService bollywoodService){
      this.bollywoodService = bollywoodService;
  }

    @GetMapping("/AllMovies")
    @ResponseBody
    public List<Bollywood> findAll() {
        return bollywoodService.findAll();
    }

    @PostMapping (value = "/saveMovie", produces = "plain/text")
    public String MovieName(@RequestBody Bollywood movie) {
        return String.valueOf(bollywoodService.saveMovie(movie));
    }

    @PostMapping (value="/IsMovieAvailable" ,produces = "plain/text")
    public String isMovieAvailable(@RequestParam(value = "Id") int movieId) {
        return String.valueOf(bollywoodService.isMovieAvailable( movieId));
    }

    @PostMapping (value="/updateMovie" ,produces = "plain/text")
    public String updateMovie(@RequestParam(value = "Id") int movieName, @RequestBody Bollywood movie) {
        return String.valueOf(bollywoodService.updateMovie(movieName,movie));
    }

    @PostMapping (value="/deleteMovie" ,produces = "plain/text")
    public String deleteMovie(@RequestParam(value = "name") int movieId) {
        return bollywoodService.deleteMovie(movieId);
    }

}
