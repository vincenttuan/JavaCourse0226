package lesson22_thorw;

public class Login {
    public static void main(String[] args) {
        try {
            boolean pass = checkID("A1234567891");
            System.out.println(pass);
        } catch (Exception ex) {
            System.out.println(ex);
            System.out.println(ex.getMessage());
        }
    }
    
    public static boolean checkID(String id) throws Exception {
        if(id.length() == 10) {
            return true;
        } else {
            // 自行建立例外物件
            Exception e = new Exception("ID錯誤");
            // 拋出例外物件
            throw e;
        }
    }
}
