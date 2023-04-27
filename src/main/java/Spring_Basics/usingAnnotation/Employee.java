package Spring_Basics.usingAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
    @Autowired
    @Qualifier("add2") //for telling that which object in xml file are we referencing
                               // (when we have more than one bean of same type)
    private Address address;

    public Address getAddress() {
        return address;
    }

//    @Autowired   (above setter method)
    public void setAddress(Address address) {
        this.address = address;
    }
    public Employee() {
        super();
    }

   // @Autowired (above constructor)
    public Employee(Address address) {
        super();
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "address=" + address +
                '}';
    }
}
