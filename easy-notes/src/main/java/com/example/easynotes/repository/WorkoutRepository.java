package com.example.easynotes.repository;

import com.example.easynotes.model.Workout;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WorkoutRepository extends JpaRepository<Workout,String> {

    //Page<Workout> findByWorkoutCategoryId(String categoryId,Pa)
   // Page<Comment> findByPostId(Long postId, Pageable pageable);
   // public List<Workout> findByWorkoutCategoryId(String categoryId);

}
