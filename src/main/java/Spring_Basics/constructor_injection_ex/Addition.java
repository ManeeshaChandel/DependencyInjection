package Spring_Basics.constructor_injection_ex;

public class Addition {
    private double a;
    private double b;
    public Addition(int a,int b){
        this.a=a;
        this.b=b;
        System.out.println("Constructor : int , int");
    }
    public Addition(double a,double b){
        this.a=a;
        this.b=b;
        System.out.println("Constructor : int , int");
    }
    public void doSum(){
        System.out.println("Sum us="+(this.a+this.b));
    }
}
