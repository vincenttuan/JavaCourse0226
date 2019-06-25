package lesson39_io;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadNews {
    public static void main(String[] args) throws Exception {
        try(FileReader fr = new FileReader("src/lesson39_io/news.txt");
            BufferedReader br = new BufferedReader(fr);) {
            
            String data;
            while ((data = br.readLine()) != null) {
                System.out.println(data);
            }
            
        }
        
    }
}
