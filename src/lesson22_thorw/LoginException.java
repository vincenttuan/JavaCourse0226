package lesson22_thorw;

public class LoginException extends Exception {

    public LoginException(String message) {
        super(message);
    }
    
    public void 然後呢() {
        System.out.println("請重新登入");
    }
}
