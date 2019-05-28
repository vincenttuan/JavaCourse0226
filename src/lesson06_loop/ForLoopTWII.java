package lesson06_loop;

import java.util.stream.Stream;

public class ForLoopTWII {
    public static void main(String[] args) {
        String[][] data = TWII.getData();
        System.out.println(data.length + " 筆");
        // "證券代號","證券名稱","殖利率(%)","股利年度","本益比","股價淨值比","財報年/季"
        for(int i=0;i<data.length;i++) {
            if(data[i][4].contains("-")) {
                continue;
            }
            double r = Double.parseDouble(data[i][2]);
            double pe = Double.parseDouble(data[i][4].replace(",", ""));
            double pb = Double.parseDouble(data[i][5].replace(",", ""));
            if(r >= 7 && pe <= 10 && pb < 1) {
                System.out.println(data[i][0] + " " + data[i][1] + " " + r + " " + pe + " " + pb);
            }
        }
    }
}
