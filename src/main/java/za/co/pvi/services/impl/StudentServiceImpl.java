package za.co.pvi.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.co.pvi.entities.Student;
import za.co.pvi.repositories.StudentRepository;
import za.co.pvi.services.StudentService;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student createStudent(Student student) {
        final Student saveStudent = studentRepository.save(student);
        return saveStudent;
    }

    @Override
    public Student updateStudent(Student student) {
        final Student updatedStudent = studentRepository.save(student);
        return updatedStudent;
    }

    @Override
    public void deleteStudent(Student student) {
        studentRepository.delete(student);
    }

    @Override
    public void deleteStudentById(Integer id) {
        studentRepository.deleteById(id);
    }

    @Override
    public List<Student> findAllStudents() {
        final List<Student> students = studentRepository.findAll();
        return students;
    }

    @Override
    public Optional<Student> findById(Integer id) {
        final Optional<Student> studentById = studentRepository.findById(id);
        return studentById;
    }
}
