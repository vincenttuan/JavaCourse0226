package lesson06;

public class ForLoopDemo2 {
    public static void main(String[] args) {
        //"證券代號","證券名稱","殖利率(%)","股利年度","本益比","股價淨值比","財報年/季"
        String[] row = {"1101", "台泥", "9.51", "107", "10.54", "1.23", "107/4"};
        
        for(int i=0;i<row.length;i++) {
            System.out.println(row[i]);
        }
        
        for(String d : row) {
            System.out.println(d);
        }
        
    }
}
