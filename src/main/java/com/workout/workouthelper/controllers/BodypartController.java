package com.workout.workouthelper.controllers;

import com.workout.workouthelper.models.Bodypart;
import com.workout.workouthelper.services.BodypartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/bodypart")
public class BodypartController {
    private final BodypartService bodypartService;

    @Autowired
    public BodypartController(BodypartService bodypartService) {
        this.bodypartService = bodypartService;
    }

    @GetMapping("/getAll")
    public List<Bodypart> getBodypart() {
        return bodypartService.getBodyparts();
    }

    @GetMapping("/get")
    public Bodypart getBodypartByName(@RequestParam String name) {
        Optional<Bodypart> bodypart = bodypartService.getBodypartByName(name);
        return bodypart.orElse(null);
    }

    @GetMapping("/getDescription")
    public String getDescriptionByName(@RequestParam String name) {
        return bodypartService.getDescriptionByName(name);
    }
}
