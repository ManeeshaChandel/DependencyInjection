package Spring_Basics.AutoWiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("SpringBasics_Config/AutoWiringConfig.xml");
        Employee emp1=context.getBean("emp1", Employee.class);//Employee.class done for autowiring,we don't need to cast explicitly
        System.out.println(emp1);
    }
}
