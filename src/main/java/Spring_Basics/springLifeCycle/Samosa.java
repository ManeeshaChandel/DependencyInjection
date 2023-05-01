package Spring_Basics.springLifeCycle;
//Implementing LifeCycle methods(init, destroy)(we can use another name as well) of Spring bean using xml

//need context.registerShutdownHook();

//you don't need to make object in Test class for calling "init" and "destroy" methods
//just need bean of that class in xml file

 public class Samosa {
    private double price;

    public double getPrice() {
       System.out.println("Getting Price for samosa");
        return price;
    }

    public void setPrice(double price) {
        System.out.println("Setting Price for samosa");
        this.price = price;
    }

//    public Samosa() {
//        super();
//    }

    @Override
    public String toString() {
        return "Samosa{" +
                "price=" + price +
                '}';
    }
    public void hey(){
        System.out.println("Samosa Inside init method: hey! how are you ?");
    }
    public void bye() {
        System.out.println("Samosa Inside destroy method: bye bye I am going to die");
    }


 }
