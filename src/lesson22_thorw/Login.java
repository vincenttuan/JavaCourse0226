package lesson22_thorw;

public class Login {
    public static void main(String[] args) {
        try {
            boolean pass = checkID("A1234567891");
            System.out.println(pass);
        } catch (LoginException ex) {
            System.out.println(ex);
            System.out.println(ex.getMessage());
            ex.然後呢();
        }
    }
    
    public static boolean checkID(String id) throws LoginException {
        if(id.length() == 10) {
            return true;
        } else {
            // 自行建立例外物件
            LoginException e = new LoginException("ID錯誤");
            // 拋出例外物件
            throw e;
        }
    }
}
