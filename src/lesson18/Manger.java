package lesson18;

// 外部類別
public class Manger {
    private int cash = 5000;
    private static final String DEPT_NAME = "IT";
    
    public void job() {
        System.out.println("進度追蹤");
    }
    
    public void print() {
        int y3 = 2017;
        // 方法內部類別
        class Report {
            int y2 = 2018;
            void show() {
                int y = 2019;
                System.out.println(y + "年報告");
                System.out.println(this.y2 + "年報告");
                System.out.println(y3 + "年報告");
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
