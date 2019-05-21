package lesson18;

// 外部類別
public class Manger {
    private int cash = 5000;
    private static final String DEPT_NAME = "IT";
    
    public void job() {
        System.out.println("進度追蹤");
    }
    
    public void print() {
        // 方法內部類別
        class Report {
            void show() {
                int y = 2019;
                System.out.println(y + "年報告");
            }
        }
        Report report = new Report();
        report.show();
    }
    
    // 一般內部類別
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
