package com.springcore;

import com.springcore.Emp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext cto=new ClassPathXmlApplicationContext("collectionconfig.xml");
        Emp obj1=(Emp)cto.getBean("Emp1");
        System.out.println(obj1.getName());
        System.out.println(obj1.getPhones());
        System.out.println(obj1.getAddress());
        System.out.println(obj1.getCourses());
        System.out.println(obj1.getPropert());
    }
}
