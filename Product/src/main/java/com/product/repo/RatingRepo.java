package com.product.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.product.entity.Rating;


@Repository
public interface RatingRepo extends JpaRepository<Rating, Long>{
	
	

}
