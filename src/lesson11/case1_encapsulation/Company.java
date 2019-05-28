package lesson11.case1_encapsulation;

public class Company {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Manager manager = new Manager();
        Director director = new Director();
        
        employee.setSalary(30000);
        manager.setSalary(50000);
        director.setSalary(1);
        
        System.out.println(employee.getSalary());
        
        System.out.println(manager.getSalary());
        manager.budget();
        
        System.out.println(director.getSalary());
        director.budget();
        director.stockOptions();
        
    }
}
