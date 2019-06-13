package lesson30_wait_notify;

public class Master extends Thread {
    private Cookies cookies;
    
    public Master(Cookies cookies) {
        this.cookies = cookies;
    }
    
    @Override
    public void run() {
        try {
            for(int i=1;i<=cookies.getNums();i++) {
                cookies.put(i);
            }
        } catch (Exception e) {
        }
        
    }
    
}
