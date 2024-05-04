package com.ratingservice.repository;

import com.ratingservice.entity.Rating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RatingRepository extends JpaRepository<Rating, String> {
    public List<Rating> findByHotelId(String hotelId);
    public List<Rating> findByUserId(int userId);
}
