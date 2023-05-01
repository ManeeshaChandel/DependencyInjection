package Spring_Basics.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("SpringBasics_Config/refconfig.xml");
        A obj1=(A)context.getBean("aref");
        System.out.println(obj1.getX());
        System.out.println(obj1.getOb().getY());
    }
}
