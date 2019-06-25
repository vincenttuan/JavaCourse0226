package lesson40_serializable;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class WriteSalary {
    public static void main(String[] args) {
        Salary salary = new Salary();
        salary.setName("John");
        salary.setMoney(80000);
        
        try(FileOutputStream fos = new FileOutputStream("src/lesson40_serializable/serial.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);) {
            
            oos.writeObject(salary);
            
        } catch (Exception e) {
        }
        
    }
}
