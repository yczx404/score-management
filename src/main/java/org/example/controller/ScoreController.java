package org.example.controller;

import org.example.entity.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ScoreController {

    @RequestMapping("/")
    public List<Student> home() {
        return List.of(new Student("1", 98, 1, 1));
    }
}
