package lesson10;

import java.util.ArrayList;
import java.util.OptionalDouble;
import java.util.Random;
import static java.util.stream.Collectors.averagingDouble;
import static java.util.stream.Collectors.groupingBy;

public class Company2 {
    public static void main(String[] args) {
        Random r = new Random();
        Dept it = new Dept("IT");
        Dept sales = new Dept("Sales");
        Dept account = new Dept("Account");
        Dept[] depts = {it, sales, account};
        
        Emp emp1 = new Emp("John", r.nextInt(100000), depts[r.nextInt(3)]);
        Emp emp2 = new Emp("Mary", r.nextInt(100000), depts[r.nextInt(3)]);
        Emp emp3 = new Emp("Joe", r.nextInt(100000), depts[r.nextInt(3)]);
        Emp emp4 = new Emp("Vincent", r.nextInt(100000), depts[r.nextInt(3)]);
        Emp emp5 = new Emp("Helen", r.nextInt(100000), depts[r.nextInt(3)]);
        Emp emp6 = new Emp("Anita", r.nextInt(100000), depts[r.nextInt(3)]);
        Emp emp7 = new Emp("Zu", r.nextInt(100000), depts[r.nextInt(3)]);
        
        ArrayList<Emp> empList = new ArrayList<>();
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        empList.add(emp4);
        empList.add(emp5);
        empList.add(emp6);
        empList.add(emp7);
        System.out.println(empList);
        
        //empList.stream().collect(groupingBy(Emp::getDept, averagingInt(Emp::getSalary)))
        System.out.println(
           empList.stream().collect(groupingBy(Emp::getDept, averagingDouble(Emp::getSalary)))
        );
        
    }
}
