package ManeeshaChandel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        //ApplicationContext is an interface

//      Student /*--taking as an object--*/ obj1=/*--needs typecasting--*/(Student) context.getBean("student1");
        Student obj1=(Student) context.getBean("student1");
        Student obj2=(Student) context.getBean("student2");
        Student obj3=(Student) context.getBean("student3");
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);

    }
}
