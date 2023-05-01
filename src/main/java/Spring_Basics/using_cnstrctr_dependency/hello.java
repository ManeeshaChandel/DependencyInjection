package Spring_Basics.using_cnstrctr_dependency;
class MyClass {
    private int myNumber; // instance variable
    private static int hello;
    public static void myStaticMethod() {
        // This method can only access static members of the class
        // It cannot access the instance variable myNumber
        System.out.println("This is a static method");
        //System.out.println("The value of myNumber is " + myNumber);
        System.out.println("The value of hello is " + hello);
    }

    public void myInstanceMethod() {
        // This method can access both static and instance members of the class
        System.out.println("This is an instance method");
        System.out.println("The value of myNumber is " + myNumber);
        System.out.println("The value of hello is " + hello);

    }
}
public class hello {
    public static void main(String[] args) {
//        MyClass Mycl=new MyClass();
//        Mycl.myStaticMethod();
//        Mycl.myInstanceMethod();
        int[][] dp=new int[4][4];
       for(int i=0;i<4;i++){
           for(int j=0;j<4;j++){
               System.out.print(dp[i][j]);
           }
       }

    }

}
