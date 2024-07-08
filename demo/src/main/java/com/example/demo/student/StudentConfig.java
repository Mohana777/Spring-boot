package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.util.Calendar.OCTOBER;

public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {

            student saketh = new student(
                    "saketh",
                    "saketh@gmail.com",
                    LocalDate.of(2001, Month.AUGUST,9));
            student Navya = new student(
                    "Navya",
                    "Navya@gmail.com",
                    LocalDate.of(2000, OCTOBER, 9));
            repository.equals(List.of(saketh, Navya));

        };
    }
}
