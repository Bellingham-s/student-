package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service

public class StudentService {
    public StudentService() {

    }

    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "Mariam",
                        21,
                        LocalDate.of(2000, Month.JUNE, 22),
                        "Mariam.jamal@gmail.com"
                )
        );
    }
}
