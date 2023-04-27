package Spring_Basics.SpringExpressionLanguage_spEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component  //for creating an object without using <bean> tag in xml
public class Demo {
    @Value("#{22+11}")
    private int x;
    @Value("#{2+5+56+34}")
    private int y;

    @Value("#{T(java.lang.Math).sqrt(25)}") //T(class).method(param)    --convention to invoke static method
    private double z;

    @Value("#{T(java.lang.Math).PI}")     //T(class).method(param)    --convention to invoke static variable
    private double e;

    @Value("#{new java.lang.String('Durgesh Tiwari')}") //new object(value)  //we are using single quote for value
                                                                              ///as we are double quote outside
    private String name;

    @Value("#{8>3}")            // by default isActive is false
    private boolean isActive;

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getE() {
        return e;
    }

    public void setE(double e) {
        this.e = e;
    }

    @Override
    public String toString() {
        return "Demo{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", e=" + e +
                ", name='" + name + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}
