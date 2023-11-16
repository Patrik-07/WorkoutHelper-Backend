package com.workout.workouthelper.services;

import com.workout.workouthelper.models.Bodypart;
import com.workout.workouthelper.repositories.BodypartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BodypartService {
    private final BodypartRepository bodypartRepository;

    @Autowired
    public BodypartService(BodypartRepository bodypartRepository) {
        this.bodypartRepository = bodypartRepository;
    }

    public List<Bodypart> getBodyparts() {
        return bodypartRepository.findAll();
    }

    public Optional<Bodypart> getBodypartByName(String name) {
        return bodypartRepository.findAll().stream().filter(bodypart -> bodypart.getName().equals(name)).findFirst();
    }

    public String getDescriptionByName(String name) {
        return  bodypartRepository.findDescriptionByName(name);
    }
}
