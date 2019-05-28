package lesson20_exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadScore {

    public static void main(String[] args) {
        read2();
    }
    
    // try-catch-finally
    public static void read() {
        Scanner input = new Scanner(System.in);
        System.out.println("請輸入檔名 : ");
        String fileName = input.nextLine();
        File file = new File("src/lesson20_exception/" + fileName);
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
            int sum = 0;
            while (scanner.hasNextInt()) {
                int x = scanner.nextInt();
                sum += x;
            }
            System.out.println(sum);
        } catch (FileNotFoundException ex) {
            System.out.println("檔案找不到");
            read();
        } finally {
            if(scanner != null) {
                System.out.println("檔案關閉");
                scanner.close();
            }
        }
    }
    
    // try-with-resource
    public static void read2() {
        Scanner input = new Scanner(System.in);
        System.out.println("請輸入檔名 : ");
        String fileName = input.nextLine();
        File file = new File("src/lesson20_exception/" + fileName);
        
        try(Scanner scanner = new Scanner(file)) {
            int sum = 0;
            while (scanner.hasNextInt()) {
                int x = scanner.nextInt();
                sum += x;
            }
            System.out.println(sum);
        } catch (FileNotFoundException ex) {
            System.out.println("檔案找不到");
            read();
        }
    }
}
