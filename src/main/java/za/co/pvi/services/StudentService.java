package za.co.pvi.services;

import org.springframework.stereotype.Service;
import za.co.pvi.entities.Student;

import java.util.List;
import java.util.Optional;

@Service
public interface StudentService {

    Student createStudent(Student student);

    Student updateStudent(Student student);

    void deleteStudent(Student student);

    void deleteStudentById(Long id);

    List<Student> findAllStudents();

    Optional<Student> findById(Long id);

}
