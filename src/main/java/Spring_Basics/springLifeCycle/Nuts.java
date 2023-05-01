package Spring_Basics.springLifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//Implementing Bean LifeCycle methods(init, destroy)(we can use another name as well)
//using Annotations @PostConstruct and @PreDestroy

//need context.registerShutdownHook();

//you don't need to make object in Test class for calling "init" and "destroy" methods
//just need bean of that class in xml file
public class Nuts {
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        System.out.println("Setting price for nuts");
        this.price = price;
    }
//    public Nuts() {
//        super();
//    }

    @Override
    public String toString() {
        return "Nuts{" +
                "price=" + price +
                '}';
    }
     @PostConstruct
    public void start(){
        System.out.println("starting/init method");
    }
    @PreDestroy
    public void end(){
        System.out.println("ending/destroy method");
    }
}
