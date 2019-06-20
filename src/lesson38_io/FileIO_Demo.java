package lesson38_io;

import java.io.FileReader;
import java.io.FileWriter;

public class FileIO_Demo {
    static String path = "src/lesson38_io/demo.txt";
    public static void main(String[] args) {
        //writer("Hello Java");
        System.out.println(reader());
    }
    
    public static void writer(String data) {
        try(FileWriter fw = new FileWriter(path)) {
            fw.write(data);
            System.out.println("寫入成功");
        } catch (Exception e) {
            System.out.println("寫入失敗, " + e);        
        }
    }
    
    public static String reader() {
        StringBuilder sb = new StringBuilder();
        try(FileReader fr = new FileReader(path)) {
            int x = 0;
            while((x = fr.read()) != -1) {
                sb.append((char)x + "");
            }
        } catch (Exception e) {
        }
        
        return sb.toString();
    }
}
