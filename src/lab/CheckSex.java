package lab;

public class CheckSex {
    public static void main(String[] args) {
        String id = "A167839467";
        char sex = id.charAt(1);
        System.out.println(sex);
        
        switch(sex) {
            case '1':
                System.out.println("男生");
                break;
            case '2':
                System.out.println("女生");  
                break;
            default:
                System.out.println("錯誤");    
        }
        
    }
}
