package com.spring.student.service;

import com.spring.student.entity.Student;
import com.spring.student.utility.GlobalResources;
import org.slf4j.Logger;

import java.util.List;

public interface StudentService {



    public List<Student> getAllStudent();

    Student saveStudent(Student student);

    Student getStudentById(Integer id);

    Student updateStudent(Student student);

    void deleteStudentById(Integer id);
}
