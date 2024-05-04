package com.ratingservice.service;

import com.ratingservice.entity.Rating;

import java.util.List;

public interface RatingService {

    public Rating CreateRating(Rating rating);
    public List<Rating> AllRatings();
    public List<Rating> GetRatingByHotelId(String id);
    public List<Rating> GetRatingByUserId(int id);
}
