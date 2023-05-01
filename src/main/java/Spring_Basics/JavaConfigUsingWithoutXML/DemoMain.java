package Spring_Basics.JavaConfigUsingWithoutXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoMain {
    public static void main(String[] args) {
        ApplicationContext con=new AnnotationConfigApplicationContext(JavaConfigInplaceOfXMLFile.class);
        Student s1=con.getBean("temp",Student.class);
        System.out.println(s1);
        s1.study();
    }
}
