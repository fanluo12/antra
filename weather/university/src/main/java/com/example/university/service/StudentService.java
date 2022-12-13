package com.example.university.service;

import com.example.university.domain.StudentDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    StudentDTO[] getAllStudents();
    StudentDTO findById(String id);
}
