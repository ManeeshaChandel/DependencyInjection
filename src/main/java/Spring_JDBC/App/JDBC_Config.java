//we Are using this cong file instead of StudentSQL_Config.xml
package Spring_JDBC.App;

import Spring_JDBC.Dao.StudentDao;
import Spring_JDBC.Dao.StudentDaoImplement;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = {"Spring_JDBC.Dao"})
public class JDBC_Config {
    @Bean("ds")  //or if you want to give so many name then @Bean(name={"ds"})
    public DataSource getDataSource(){  //we are returning parent class object i.e. DataSource instead of DriverManagerDataSource
        DriverManagerDataSource ds=new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/springjdbc?useSSL=false");
        ds.setUsername("root");
        ds.setPassword("Manisha@27");
        return ds;
    }
    @Bean("jdbcTemplate")
    public JdbcTemplate getTemplate(){
        JdbcTemplate jdbcTemplate=new JdbcTemplate();
        jdbcTemplate.setDataSource(getDataSource());
        return jdbcTemplate;
    }

//    @Bean("StudentDaoImpl")
//    public StudentDao getStudentDao(){
//        StudentDaoImplement studentDao=new StudentDaoImplement();
//        studentDao.setJdbcTemplate(getTemplate());
//        return studentDao;
//    }

    //for Autowiring I have commented out above bean
    //for Autowiring we need to go to StudentDaoImplement class and use @Component
    //also you need to add @ComponentScan in this file(i.e. JDBC_Config) only for adding the package of StudentDaoImplement here
    //also for injecting dependencies inside the class StudentDaoImplement, we need to use @Autowired annotation
}
