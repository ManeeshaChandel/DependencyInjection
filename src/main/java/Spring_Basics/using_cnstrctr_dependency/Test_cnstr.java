package Spring_Basics.using_cnstrctr_dependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_cnstr {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("SpringBasics_Config/constrctr_config.xml");
        Person obj1=(Person)context.getBean("pson");
        System.out.println(obj1);
    }
}
