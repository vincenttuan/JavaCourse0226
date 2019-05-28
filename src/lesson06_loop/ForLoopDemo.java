package lesson06_loop;

public class ForLoopDemo {
    public static void main(String[] args) {
        //"證券代號","證券名稱","殖利率(%)","股利年度","本益比","股價淨值比","財報年/季"
        String[] row = {"1101", "台泥", "9.51", "107", "10.54", "1.23", "107/4"};
        for(int i=0;i<row.length;i++) {
            //System.out.println(row[i]);
            if( i == 1 ) { // 證券名稱
                System.out.print(row[i] + " ");
            }else if( i == 2 ) { // 殖利率(%)
                double r = Double.parseDouble(row[i]);
                System.out.print(r < 7 ? " 利率低 " : " 利率高 ");
                System.out.print("(" + r + ") ");
            } else if( i == 4 ) { // 本益比
                double pe = Double.parseDouble(row[i]);
                System.out.print(pe <= 10 ? " 本益比低 " : " 本益比高 ");
                System.out.print("(" + pe + ") ");
            }
            if( i == 5 ) { // 股價淨值比
                double pb = Double.parseDouble(row[i]);
                System.out.print(pb >= 1 ? " Sell " : " Buy ");
                System.out.println("(" + pb + ") ");
            }
        }
        
    }
}
