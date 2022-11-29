package za.co.pvi.resources;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.co.pvi.entities.Student;
import za.co.pvi.exceptions.InvalidIdException;
import za.co.pvi.services.StudentService;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;


    @PostMapping("/students")
    public Student registerStudent(@RequestBody Student student) {
        System.out.println("Before: " + student);
        if(student.getId() != null || student.getId() == 0){
            throw new InvalidIdException("Can not create a new student with id.");
        }
        final Student student1 = studentService.createStudent(student);
        System.out.println("Before: " + student1);
        return student1;
    }

    @PutMapping("/students")
    public Student updateStudent(@RequestBody Student student) throws Exception {
        if (student.getId() == null) {
            throw new Exception("Can not update student with id null.");
        }
        final Student student1 = studentService.updateStudent(student);
        return student1;
    }

    @DeleteMapping("/students")
    public String deleteStudent(@RequestBody Student student) {
        studentService.deleteStudent(student);
        return "Delete Successful.";
    }
    @DeleteMapping("/students/{id}")
    public String deleteStudentById(@PathVariable Integer id) {
        studentService.deleteStudentById(id);
        return "Delete Successful.";
    }

    @GetMapping("/students/{id}")
    public Optional<Student> getStudentById(@PathVariable Integer id) {
        final Optional<Student> byId = studentService.findById(id);
        return byId;
    }

    @GetMapping("/students")
    public List<Student> getAllStudents() {
        final List<Student> allStudents = studentService.findAllStudents();
        return allStudents;
    }
}
