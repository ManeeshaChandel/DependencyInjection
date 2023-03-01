package using_cnstrctr_dependency;
// I have made this class ,
//- by passing parameter in constructor of Person class
// click on the type "Certi" (in parameter)
// use ctrl+1  // click on red bulb
//click on create new class Certi
public class Certi {
    String name;

    public Certi(String name) {
        super();
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
