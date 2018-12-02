package com.example.easynotes.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.ManyToAny;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "workout")
public class Workout implements Serializable {

    @Id
    private String workOutId;

    private String workOutName;
    private String workOutLevel;  //Beginner , Intermediate , Tough
    private String workOutType;  //Home,Outside

    @JsonIgnore
    private String imageUrl;

    private Integer workOutCategoryId;

    public Integer getWorkOutCategoryId() {
        return workOutCategoryId;
    }

    public void setWorkOutCategoryId(Integer workOutCategoryId) {
        this.workOutCategoryId = workOutCategoryId;
    }
    //    @ManyToOne
//    private WorkoutCategory workoutCategory;

    public Workout(){

    }

    public String getWorkOutId() {
        return workOutId;
    }

    public void setWorkOutId(String workOutId) {
        this.workOutId = workOutId;
    }

    public String getWorkOutName() {
        return workOutName;
    }

    public void setWorkOutName(String workOutName) {
        this.workOutName = workOutName;
    }

    public String getWorkOutLevel() {
        return workOutLevel;
    }

    public void setWorkOutLevel(String workOutLevel) {
        this.workOutLevel = workOutLevel;
    }

    public String getWorkOutType() {
        return workOutType;
    }

    public void setWorkOutType(String workOutType) {
        this.workOutType = workOutType;
    }

//    public WorkoutCategory getWorkoutCategory() {
//        return workoutCategory;
//    }
//
//    public void setWorkoutCategory(WorkoutCategory workoutCategory) {
//        this.workoutCategory = workoutCategory;
//    }

    public Workout(String workOutId, String workOutName, String workOutLevel, String workOutType, String imageUrl) {
        this.workOutId = workOutId;
        this.workOutName = workOutName;
        this.workOutLevel = workOutLevel;
        this.workOutType = workOutType;
        this.imageUrl = imageUrl;
       // this.workoutCategory = workoutCategory;
    }

}
