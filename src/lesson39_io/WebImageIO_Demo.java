package lesson39_io;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

public class WebImageIO_Demo {
    public static void main(String[] args) throws Exception {
        System.setProperty("http.agent", "隨便打");
        String path = "https://home-prod-craft-cms-assets-volume-ioeiz1.s3.amazonaws.com/amazon/_bloglistitem/9448/Mazda_Blog_header2.jpg";
        //String path = "https://cdn.carnews.com/thumb/1236x989/article/195f53f0-f2f7-11e8-b3f3-42010af00004/AKkE5c5ibWzE.png";
        URL url = new URL(path);
        System.out.println("Wait...");
        try(InputStream is = url.openStream();
            FileOutputStream fos = new FileOutputStream("src/lesson39_io/car.jpg");) {
            int x;
            while((x = is.read()) != -1) {
                fos.write(x);
            }
            System.out.println("Finish...");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
    }
}
