package lesson39_io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class SetOut {
    public static void main(String[] args) {
        System.out.println("數學計算");
        System.out.println("正確答案在 answer.txt");
        try(FileOutputStream fos = new FileOutputStream("src/lesson39_io/answer.txt", true);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            PrintStream out = new PrintStream(bos);) {
            
            System.setOut(out);
            System.out.println(10/2);
            System.out.println("Happy");
            
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
