package lesson20_exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Score {
    private String fname;
    private int sum;

    public Score(String fname) {
        this.fname = fname;
        this.sum = calc(fname);
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "Score{" + "fname=" + fname + ", sum=" + sum + '}';
    }
    
    //-----------------------------------------------------------------
    
    public static int calc(String fileName) {
        File file = new File("src/lesson20_exception/" + fileName);
        int sum = 0;
        try(Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextInt()) {
                int x = scanner.nextInt();
                sum += x;
            }
        } catch (FileNotFoundException ex) {
            System.out.println("檔案找不到");
        }
        return sum;
    }
}
