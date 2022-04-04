package net.wodie.studentspring.controller;

import net.wodie.studentspring.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("student")

public class StudentController {

    @GetMapping
    public List<Student> getAllStudents() {
        return List.of(new Student("Anton",1234), new Student("Berta",1200));

    }

}
