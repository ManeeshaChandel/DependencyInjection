package Spring_Basics.springLifeCycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args){
        //AbstractApplicationContext will provide register method to register hook
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("SpringBasics_Config/LifeCycle.xml");
        //Samosa samosa1=(Samosa)context.getBean("samosa1");
        //System.out.println(samosa1);

         context.registerShutdownHook();

//        In Java, the registerShutdownHook() method is a built-in method defined
//        in the Runtime class that registers a new virtual machine shutdown hook.
//        A shutdown hook is a Java thread that gets executed when the Java virtual machine (JVM) is about to shut down.
//
//       When the JVM is shutting down, it will start all registered shutdown hooks in separate threads
//       and wait for them to finish before terminating the process.
//       This provides an opportunity for applications to perform some final cleanup tasks before the JVM exits.
//        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
//        Pepsi p1=(Pepsi)context.getBean("pepsi1");
//        System.out.println(p1);


        Nuts n1=(Nuts)context.getBean("nuts1");
        System.out.println(n1);
    }
}
