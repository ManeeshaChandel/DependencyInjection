package Spring_Basics.stereotype;
//Here we are using @Component AND @Value annotation for injection and providing value respectively
//instead of using "bean" tag
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("SpringBasics_Config/stereotype.xml");
        Student student=context.getBean("ob", Student.class); //you need to pass name of the class
                                                                    // in camel case inside getBean()---very imp
        System.out.println(student.hashCode());
//        System.out.println(student.getAddress());
//        System.out.println(student.getAddress().getClass());
        Student student2=context.getBean("ob",Student.class);
        System.out.println(student2.hashCode());

        //By default singleton pattern follows i.e. container will give the same object reference
        // even if we create another object of same class

        UnderstandingScope teacher1=context.getBean("teacher",UnderstandingScope.class);
        UnderstandingScope teacher2=context.getBean("teacher",UnderstandingScope.class);

        System.out.println(teacher1.hashCode());
        System.out.println(teacher2.hashCode());

        //this is the example of prototype

    }
}
