package lesson10_constructor;

import java.util.HashSet;
import java.util.Set;

public class Dept {
    String name;
    Set<Emp> emps;

    public Dept(String name) {
        this.name = name;
        emps = new HashSet<>();
    }

    @Override
    public String toString() {
        return "Dept{" + "name=" + name + '}';
    }
    
    
}
