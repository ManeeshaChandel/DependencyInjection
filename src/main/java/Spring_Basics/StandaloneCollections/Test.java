package Spring_Basics.StandaloneCollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("SpringBasics_Config/StandaloneConfig.xml");
        Person person1=context.getBean("friendsList", Person.class);
        System.out.println(person1);
        System.out.println("_______________________________");
        System.out.println(person1.getFeesStructure());
        System.out.println(person1.getFeesStructure().getClass().getName());
        System.out.println("_______________________________");
        System.out.println(person1.getProperties());
    }
}
