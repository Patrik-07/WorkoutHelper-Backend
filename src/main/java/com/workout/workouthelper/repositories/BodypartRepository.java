package com.workout.workouthelper.repositories;

import com.workout.workouthelper.models.Bodypart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BodypartRepository extends JpaRepository<Bodypart, Long> {
    @Query("SELECT bp.description FROM Bodypart bp WHERE bp.name = :name")
    String findDescriptionByName(@Param("name") String name);
}
