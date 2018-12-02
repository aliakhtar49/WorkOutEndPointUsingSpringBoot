package com.example.easynotes.model;

import com.example.easynotes.controller.WorkOutController;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "workoutCategory")
public class WorkoutCategory implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "workOutCategoryId")
    private Integer workOutCategoryId;

    private String workOutCategoryName;



    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "workOutCategoryId",referencedColumnName = "workOutCategoryId")
    private List<Workout> workouts;


    public List<Workout> getWorkouts() {
        return workouts;
    }

    public void setWorkouts(List<Workout> workouts) {
        this.workouts = workouts;
    }

    public String getWorkOutCategoryName() {
        return workOutCategoryName;
    }

    public void setWorkOutCategoryName(String workOutCategoryName) {
        this.workOutCategoryName = workOutCategoryName;
    }

    public WorkoutCategory(String workOutCategoryName) {
        this.workOutCategoryName = workOutCategoryName;
    }

    public WorkoutCategory() {
    }
}
