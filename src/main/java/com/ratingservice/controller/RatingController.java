package com.ratingservice.controller;

import com.ratingservice.entity.Rating;
import com.ratingservice.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rating")
public class RatingController {
    @Autowired
    private RatingService userService;
    @PostMapping("/add-rating")
    public ResponseEntity<Rating> SaveUser(@RequestBody Rating rating){
        try{
            Rating savedRating = userService.CreateRating(rating);
            return new ResponseEntity<>(savedRating, HttpStatus.CREATED);

        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @GetMapping("/all-rating")
    public ResponseEntity<List<Rating>> AllUsers(){
        try{
            List<Rating> savedRatings = userService.AllRatings();
            return new ResponseEntity<>(savedRatings, HttpStatus.OK);

        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @GetMapping ("/get-ratingBy-userId/{id}")
    public ResponseEntity<List<Rating>> getRatingByUserId(@PathVariable int id){
        try{
            List<Rating> ratings = userService.GetRatingByUserId(id);
            return new ResponseEntity<>(ratings, HttpStatus.OK);

        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @GetMapping ("/get-ratingBy-hotelId/{id}")
    public ResponseEntity<List<Rating>> getRatingByHotelId(@PathVariable String id){
        try{
            List<Rating> ratings = userService.GetRatingByHotelId(id);
            return new ResponseEntity<>(ratings, HttpStatus.OK);

        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
