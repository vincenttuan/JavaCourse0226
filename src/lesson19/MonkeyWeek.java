package lesson19;

public class MonkeyWeek {
    public static void main(String[] args) {
        job(4);
        job(Week.THUR);
        job(-4);
        
        job2(Week2.WED);
        //job2(3);
    }
    
    public static void job(int week) {
        switch(week) {
            case Week.MON:
                System.out.println("猴子穿新衣");
                break;
            case Week.TUES:
                System.out.println("猴子去烤肉");
                break; 
            case Week.WED:
                System.out.println("猴子去爬山");
                break; 
            case Week.THUR:
                System.out.println("猴子去考試");
                break;     
        }
    }
    
    public static void job2(Week2 week2) {
        switch(week2) {
            case MON:
                System.out.println("猴子穿新衣");
                break;
            case TUES:
                System.out.println("猴子去烤肉");
                break; 
            case WED:
                System.out.println("猴子去爬山");
                break; 
            case THUR:
                System.out.println("猴子去考試");
                break;     
        }
    }
}
