package za.co.pvi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.co.pvi.entities.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
