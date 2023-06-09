package Spring_Basics.springcore;
import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.Properties;
public class Emp {
    private String name;
    private List<String> phones;
    private Set<String> address;
    private Map<String,String> courses;

    private Properties propert;

    public Properties getPropert() {
        return propert;
    }

    public void setPropert(Properties propert) {
        this.propert = propert;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPhones() {
        return phones;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }

    public Set<String> getAddress() {
        return address;
    }

    public void setAddress(Set<String> address) {
        this.address = address;
    }

    public Map<String, String> getCourses() {
        return courses;
    }

    public void setCourses(Map<String, String> courses) {
        this.courses = courses;
    }

    public Emp(String name, List<String> phones, Set<String> address, Map<String, String> courses,Properties propert) {
        super();
        this.name = name;
        this.phones = phones;
        this.address = address;
        this.courses = courses;
        this.propert = propert;
    }

    public Emp(){
       super();
    }

}
