package Spring_ORM.dao;

//in ORM you don't need to pass "query" like in jdbc
//also you don't need to use rowMapper for fetching data
//also you just need to pass studentID and student class in parameten in get/save/loadAll/update method
import Spring_ORM.entities.Student;
import jakarta.transaction.Transactional;
import org.springframework.orm.hibernate5.HibernateTemplate;

import java.util.List;

public class StudentDao {

    private HibernateTemplate hibernateTemplate;

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    //save student
    @Transactional //operation to write
    public int insert(Student student){
        //insert
        Integer i=(Integer)this.hibernateTemplate.save(student); //return id(unique identifier) of the data
        return i;
    }
    //get the single data(object)
    public Student getStudent(int studentId){
        Student student=this.hibernateTemplate.get(Student.class,studentId);
        return student;
    }
    //get all students(all rows)
    public List<Student> getAllStudents(){
        List<Student> students=this.hibernateTemplate.loadAll(Student.class);
        return students;
    }
    @Transactional
    //deleting the data
    public void deleteStudent(int studentId){
        Student student=this.hibernateTemplate.get(Student.class,studentId);
        this.hibernateTemplate.delete(student);
    }
    @Transactional
    //updating data
    public void updateStudent(Student student){
        this.hibernateTemplate.update(student);
    }
}
