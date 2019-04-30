package lesson09;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeMap;

public class TreeMap_Demo {
    public static void main(String[] args) {
        ArrayList<TreeMap<String, String>> list = new ArrayList<>();
        for(int i=1;i<=3;i++) {
            list.add(createCode(i));
        }
        System.out.println(list);
        
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入金額 = ");
        double cash = sc.nextDouble();
        System.out.println("請輸入折扣碼 = ");
        String code = sc.next();
        
        // 有沒有此折扣碼 ?
        Optional opt = list.stream()
                .filter(n -> n.get("折扣碼").equals(code))
                .findAny();
        
        if(opt.isPresent()) {
            TreeMap<String, String> map = (TreeMap<String, String>)opt.get();
            System.out.println(map.get("折扣") + " 折");
            cash *= Integer.parseInt(map.get("折扣"))/10.0;
            // 刪除已用過的折扣碼
            list.remove(map);
            System.out.println(list);
        } else {
            System.out.println("無折扣");
        }
        System.out.println("本次消費 : " + cash);
    }
    
    public static TreeMap<String, String> createCode(int no) {
        TreeMap<String, String> map = new TreeMap<>();
        int code_len = new Random().nextInt(8) + 4;
        String code = getCode(code_len);
        map.put("序號", String.valueOf(no));
        map.put("折扣碼", code);
        map.put("折扣", String.valueOf(new Random().nextInt(8) + 1));
        return map;
    }
    
    public static String getCode(int len) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<len;i++) {
            int n = new Random().nextInt(58) + 65;
            sb.append((char)n);
        }
        return sb.toString();
    }
    
}
