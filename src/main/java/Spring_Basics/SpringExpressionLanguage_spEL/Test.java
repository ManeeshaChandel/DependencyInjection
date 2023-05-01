package Spring_Basics.SpringExpressionLanguage_spEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext con=new ClassPathXmlApplicationContext("SpringBasics_Config/SpEL_Config.xml");
        Demo d1=con.getBean("demo",Demo.class);
        System.out.println(d1);

        //inplace of using @Value("#{22+33}") we can also use below lines
//        SpelExpressionParser temp=new SpelExpressionParser();
//        Expression expression=temp.parseExpression("22+44");
//        System.out.println(expression.getValue());
    }
}
