package lesson39_io;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.zip.ZipInputStream;

public class ReadNews_UnZip {

    public static void main(String[] args) throws Exception {
        try (FileInputStream fr = new FileInputStream("src/lesson39_io/news.zip");
             ZipInputStream zip = new ZipInputStream(fr); // Unzip
             Reader r = new InputStreamReader(zip, "UTF-8");) {

            // 取得被壓縮檔名 
            System.out.println(zip.getNextEntry().getName());
            int c;
            // 讀取檔案內容
            while ((c = r.read()) != -1) {
                System.out.print((char)c);
            }
            System.out.println();
        } catch (Exception e) {

        }

    }
}
