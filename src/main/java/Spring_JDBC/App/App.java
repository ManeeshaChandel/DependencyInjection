package Spring_JDBC.App;

import Spring_JDBC.Dao.StudentDao;
import Spring_JDBC.StudentSQL.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class App {
    public static void main(String[] args) {
        System.out.println("My program started");
        //spring jdbc  => JdbcTemplate
//        ApplicationContext con=new ClassPathXmlApplicationContext("SpringJDBC_Config/StudentSQL_Config.xml");
        ApplicationContext con=new AnnotationConfigApplicationContext(JDBC_Config.class);
        StudentDao studentDao=con.getBean("StudentDaoImpl", StudentDao.class);

        //INSERT
        //Student student =new Student();
//        student.setId(666);
//        student.setName("John");
//        student.setCity("Lucknow");
//
//        int result=studentDao.insert(student);
//        System.out.println("student added-"+result);

        //UPDATE
        //Student student =new Student();
//        student.setId(467);
//        student.setName("Maneesh Kumar");
//        student.setCity("Udaipur");
//        int result=studentDao.change(student);
//        System.out.println("student added-"+result);

       //DELETE
        //Student student =new Student();
//        int result=studentDao.delete(467);
//        System.out.println("student added-"+result);

      //FETCH DATA
//        Student student=studentDao.getStudent(666);
//        System.out.println(student);

      //Fetch All DATA
        List<Student> students=studentDao.getAllStudent();
        for(Student s:students){
            System.out.println(s);
        }







//         jdbcTemplate template=con.getBean("jdbcTemplate", JdbcTemplate.class);
//        //insert query
//        String query="insert into student(id,name,city) values(?,?,?)";
//        //fire the query
//        int result = template.update(query,467,"Maneesha Kumar","Udaypur"); //bcz it will give no. of rows affected
//        System.out.println("number of record inserted - "+result);


    }
}
