package Spring_JDBC.Dao;

import Spring_JDBC.StudentSQL.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.util.List;
@Component("StudentDaoImpl")
public class StudentDaoImplement implements StudentDao{
    @Autowired  //either we can use here //or above set method
    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int insert(Student student) {
        //insert query
        String query="insert into student(id,name,city) values(?,?,?)";
        int r=this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
        return r;
    }

    @Override
    public int change(Student student) {
        //update query
        String query="update student set name=?, city=? where id=?";
        int r=this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
        return r;
    }

    @Override
    public int delete(int studentId) {
        //delete query
        String query="delete from student where id=?";
        int r=this.jdbcTemplate.update(query,studentId);
        return r;
    }

    @Override
    public Student getStudent(int studentId) {
        //select single student data
        String query="select * from student where id=?";
        RowMapper<Student> rowMapper=new rowMapperImplement(); //making parent class(interface) object using child class ie.rowMapperImplement
        Student student=this.jdbcTemplate.queryForObject(query,rowMapper,studentId);  //this jdbcTemplate will return single object
        return student;
    }

    @Override
    public List<Student> getAllStudent() {
        String query="select * from student";
        List<Student> students=this.jdbcTemplate.query(query,new rowMapperImplement());
        return students;
    }

}
