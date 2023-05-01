package Spring_JDBC.Dao;

import Spring_JDBC.StudentSQL.Student;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class rowMapperImplement implements RowMapper<Student> {//RowMapper is an interface just like dataSource is an interface
    @Override
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        Student student=new Student();
        student.setId(rs.getInt(1));
        student.setName(rs.getString(2));
        student.setCity(rs.getString(3));
        return student;
    } //if you will not pass any object,it will take object class
}
