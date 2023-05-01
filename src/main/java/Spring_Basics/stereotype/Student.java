package Spring_Basics.stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("ob") //passing value for changing name "student" to "ob" while passing in getBean() in Test class
@Scope("prototype")
public class Student {
    @Value("Maneesha Chandel")
    private String studentName;
    @Value("NOIDA")
    private String city;

    @Value("#{temp}")  //mentioned in xml file i.e. standalone list's id
    private List<String> address;

    public List<String> getAddress() {
        return address;
    }

    public void setAddress(List<String> address) {
        this.address = address;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
