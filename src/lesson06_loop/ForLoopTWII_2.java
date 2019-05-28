package lesson06_loop;

import java.util.stream.Stream;

public class ForLoopTWII_2 {
    public static void main(String[] args) {
        String[][] data = TWII.getData();
        System.out.println(data.length + " 筆");
        // "證券代號","證券名稱","殖利率(%)","股利年度","本益比","股價淨值比","財報年/季"
        Stream.of(data)
                .filter(n -> Double.parseDouble(n[2]) >= 7)
                .filter(n -> !n[4].contains("-") && Double.parseDouble(n[4]) <= 10)
                .filter(n -> !n[5].contains("-") && Double.parseDouble(n[5]) < 1)
                .forEach(n -> System.out.println(n[0] + "\t" + n[1] + "\t" + n[2] + "\t" + n[4] + "\t" + n[5]));
        
    }
}
