package com.example.easynotes.controller;

import com.example.easynotes.model.User;
import com.example.easynotes.model.Workout;
import com.example.easynotes.model.WorkoutCategory;
import com.example.easynotes.repository.UserRepository;
import com.example.easynotes.repository.WorkoutCategoryRepository;
import com.example.easynotes.repository.WorkoutRepository;
import org.hibernate.jdbc.Work;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@RestController
public class WorkOutController {

    @Autowired
    WorkoutCategoryRepository workoutCategoryRepository;

    @Autowired
    WorkoutRepository workoutRepository;

    @GetMapping("/workouts")
    public List<WorkoutCategory> getWorkOuts() {

      //  workoutCategoryRepository.deleteAll();
        if(workoutCategoryRepository.findAll().isEmpty()){
            saveWorkOutsInDataBase();
        }

        return workoutCategoryRepository.findAll();

    }

    private void saveWorkOutsInDataBase(){


        WorkoutCategory workoutCategoryCardio = new WorkoutCategory("CARDIO");
        workoutCategoryCardio.setWorkouts(Arrays.asList( new Workout("106","High Knees","Baic","N/A",""),
                new Workout("105","Jumping Jacks","Baic","N/A",""),
                new Workout("341","Mod. Jumping Jacks","Baic","Home",""),
                new Workout("197","Walking High Knees","Baic","Home",""),
                new Workout("117","Clap Jacks","Tough","Home","")));
        workoutCategoryRepository.save(workoutCategoryCardio);


        WorkoutCategory workoutCategoryAbsAndCore = new WorkoutCategory("ABS & CORE");
        workoutCategoryAbsAndCore.setWorkouts(Arrays.asList(
                new Workout("130","Bicycle Crunches","Intermediate","Home",""),
                new Workout("127","Crunches","Baic","Home",""),
                new Workout("59","High Plank Jumping Jacks","Tough","N/A",""),
                new Workout("67","Low Plank Knee Drops","Intermediate","Home",""),
                new Workout("133","Knee Tuck Crunches","Intermediate","Home","")));
        workoutCategoryRepository.save(workoutCategoryAbsAndCore);


        WorkoutCategory workoutCategoryFlexibility = new WorkoutCategory("FLEXIBILITY");
        workoutCategoryFlexibility.setWorkouts(Arrays.asList(
                new Workout("190","Child's Pose","Baic","Home",""),
                new Workout("189","Cobblers Stretch","Baic","Home",""),
                new Workout("243","Dynamic Calf Stretch L","Baic","Home",""),
                new Workout("191","Kneeling Hip Flexor Stretch L","Home","Home",""),
                new Workout("193","Lying Figure 4 Stretch L","Intermediate","Home","")));
        workoutCategoryRepository.save(workoutCategoryFlexibility);

    }
}
