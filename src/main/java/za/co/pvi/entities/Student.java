package za.co.pvi.entities;

import javax.persistence.*;

@Entity
@Table(name = "students")
public class Student extends  Person{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id + " "+ super.toString()+
                '}';
    }
}
