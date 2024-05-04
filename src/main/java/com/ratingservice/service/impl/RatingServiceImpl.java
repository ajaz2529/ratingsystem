package com.ratingservice.service.impl;

import com.ratingservice.entity.Rating;
import com.ratingservice.repository.RatingRepository;
import com.ratingservice.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RatingServiceImpl implements RatingService {
    @Autowired
    private RatingRepository ratingRepository;

    @Override
    public Rating CreateRating(Rating rating) {
        try{return ratingRepository.save(rating);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Rating> AllRatings() {
        try{return ratingRepository.findAll();
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Rating> GetRatingByHotelId(String hotelId) {
        try{return ratingRepository.findByHotelId(hotelId);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Rating> GetRatingByUserId(int userId) {
        try{
            return ratingRepository.findByUserId(userId);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
