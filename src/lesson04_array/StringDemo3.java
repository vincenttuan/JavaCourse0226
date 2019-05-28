package lesson04_array;

import java.util.Base64;

public class StringDemo3 {
    public static void main(String[] args) {
        String data = "我中了1000萬";
        // 編碼 Encoder
        String data_dnc = Base64.getUrlEncoder().encodeToString(data.getBytes());
        System.out.println(data_dnc);
    }
}
