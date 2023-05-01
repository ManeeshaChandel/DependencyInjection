package Spring_Basics.StandaloneCollections;

import com.sun.source.tree.Tree;

import java.util.List;
import java.util.Properties;
import java.util.TreeMap;

public class Person {
    private List<String> friends;
    private TreeMap<String,Integer> feesStructure;
    private Properties properties;

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public TreeMap<String, Integer> getFeesStructure() {
        return feesStructure;
    }

    public void setFeesStructure(TreeMap<String, Integer> feesStructure) {
        this.feesStructure = feesStructure;
    }

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    @Override
    public String toString() {
        return "Person{" +
                "friends=" + friends +
                ", feesStructure=" + feesStructure +
                '}';
    }
}
