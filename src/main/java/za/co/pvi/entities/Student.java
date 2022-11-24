package za.co.pvi.entities;

import javax.persistence.*;

@Entity
@Table(name = "students")
public class Student extends  Person{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id + " "+ super.toString()+
                '}';
    }
}
