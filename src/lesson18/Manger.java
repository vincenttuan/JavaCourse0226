package lesson18;

public class Manger {
    private int cash = 5000;
    private static final String DEPT_NAME = "IT";
    
    public void job() {
        System.out.println("進度追蹤");
    }
    
    public class Memner {
        private int cash = 500;
        public void job() {
            int cash = 50;
            System.out.println(Manger.DEPT_NAME);
            System.out.println("寫程式 " + cash);
            System.out.println("寫程式 " + this.cash);
            System.out.println("寫程式 " + Manger.this.cash);
        }    
    }
    
}
