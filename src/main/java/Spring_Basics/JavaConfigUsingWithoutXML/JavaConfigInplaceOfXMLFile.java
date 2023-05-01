package Spring_Basics.JavaConfigUsingWithoutXML;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration           //using these two annotation in place of xml file
//@ComponentScan(basePackages = "JavaConfigUsingWithoutXML")//use only when we use @Component annotation in Student file
public class JavaConfigInplaceOfXMLFile {
    @Bean
    public Samosa getSamosa(){
        return new Samosa();
    }
    @Bean(name = {"student","temp","con"}) //for changing name inplace of "getStudent name inside getBean()"
                                       //we can call from any mentioned name in list

    public Student getStudent(){  //need to use this getStudent name inside getBean() function inplace of passing value
                                  //inside @Component annotation in Student java fil
        //creating a new object inplace of adding @Component annotation in Student java file
        Student student=new Student(getSamosa());
        return student;
    }
}
