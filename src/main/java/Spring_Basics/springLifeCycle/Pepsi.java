package Spring_Basics.springLifeCycle;
//Implementing Bean LifeCycle methods(init, destroy)(we can use another name as well)
//using interfaces InitialisingBean and DisposableBean

//need context.registerShutdownHook();

//you don't need to make object in Test class for calling "init" and "destroy" methods
//just need bean of that class in xml file

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean {
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        System.out.println("Setting price for pepsi");
        this.price = price;
    }

    @Override
    public String toString() {
        return "Pepsi{" +
                "price=" + price +
                '}';
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Taking pepsi: init");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Going to put bottle back to shop: destroy");
    }
}