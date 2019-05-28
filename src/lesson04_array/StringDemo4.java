package lesson04_array;

import java.util.Base64;

public class StringDemo4 {
    public static void main(String[] args) {
        // 解碼 Decoder
        byte[] bytes = Base64.getUrlDecoder().decode("5oiR5Lit5LqGMTAwMOiQrA==");
        String data_dec = new String(bytes);
        System.out.println(data_dec);
    }
}
