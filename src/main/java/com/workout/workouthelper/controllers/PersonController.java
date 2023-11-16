package com.workout.workouthelper.controllers;

import com.workout.workouthelper.models.Person;
import com.workout.workouthelper.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController {
    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping("/create")
    public void createPerson() {
        Person person = new Person();

        person.setAge(12);

        personService.createPerson(person);
    }
}
