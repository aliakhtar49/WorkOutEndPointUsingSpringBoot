package com.example.easynotes.repository;

import com.example.easynotes.model.WorkoutCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkoutCategoryRepository extends JpaRepository<WorkoutCategory,String> {

}
