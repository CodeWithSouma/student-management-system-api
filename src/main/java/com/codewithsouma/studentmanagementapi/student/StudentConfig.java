package com.codewithsouma.studentmanagementapi.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            List<Student> students = List.of(
                    new Student("Souma", "souma.hitech@gmail.com", LocalDate.of(1999, Month.MAY, 11)),
                    new Student("Soumik", "soumik.hitech@gmail.com", LocalDate.of(2000, Month.JUNE, 11)),
                    new Student("Arijit", "arijit.hitech@gmail.com", LocalDate.of(2002, Month.JULY, 11))
            );

            repository.saveAll(students);
        };
    }
}
