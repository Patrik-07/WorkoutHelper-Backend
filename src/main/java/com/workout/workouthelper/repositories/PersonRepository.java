package com.workout.workouthelper.repositories;

import com.workout.workouthelper.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> { }
