package lesson10;

public class Emp {
    String name;
    int salary;
    Dept dept;

    public Emp(String name, int salary, Dept dept) {
        this.name = name;
        this.salary = salary;
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Emp{" + "name=" + name + ", salary=" + salary + ", dept=" + dept + '}';
    }

    public int getSalary() {
        return salary;
    }

    public Dept getDept() {
        return dept;
    }
    
    
    
}
