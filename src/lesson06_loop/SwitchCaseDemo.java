package lesson06_loop;

public class SwitchCaseDemo {
    public static void main(String[] args) {
        
        char sex = "A145784730".charAt(1);
        System.out.println(sex);
        switch(sex) {
            case '1':
                System.out.println("男生");
                break;
            case '2':
                System.out.println("女生");
                break; 
            default:
                System.out.println("Error");
                break;     
        }
        
        switch(sex) {
            case '1':
                System.out.println("當兵");
            case '2':
                System.out.println("養家");
                break;    
            default:
                System.out.println("Error");
                break;         
        }
        
    }
}
