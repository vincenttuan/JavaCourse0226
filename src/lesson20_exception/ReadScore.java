package lesson20_exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReadScore {
    public static void main(String[] args) {
        
        File file = new File("src/lesson20_exception/score.txt");
        try {
            Scanner scanner = new Scanner(file);
            int sum = 0;
            while(scanner.hasNextInt()) {
                int x = scanner.nextInt();
                sum += x;
            }
            System.out.println(sum);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReadScore.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
