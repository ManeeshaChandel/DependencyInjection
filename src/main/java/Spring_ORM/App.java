package Spring_ORM;

import Spring_ORM.dao.StudentDao;
import Spring_ORM.entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("SpringORM_Config/SpringORM_Config.xml");
        StudentDao studentDao=context.getBean("studentDao",StudentDao.class);
        Student student=new Student(2324,"Durgesh Tiwari","Gurgaon");
        int r=studentDao.insert(student);
        System.out.println("done "+r);
    }


}
