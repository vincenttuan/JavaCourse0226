package lesson07;

import java.util.HashSet;
import java.util.Iterator;

public class HasSet_Demo {
    public static void main(String[] args) {
        
        HashSet set = new HashSet(); // 無順序的陣列
        set.add("Mary"); // String
        set.add(Double.valueOf("3.14")); // Double
        set.add(2.76); // Double
        set.add("中文"); // String
        set.add(100); // Integer
        set.add(100); // Integer
        
        System.out.println(set);
        
        // for-loop 走訪 (可刪除元素)
        for(Object data : set) {
            System.out.println(data);
        }
        
        // Iterator 走訪 (可刪除元素)
        Iterator iter = set.iterator();
        while (iter.hasNext()) {
            Object data = iter.next();
            System.out.println(data + ":" +data.getClass());
//            if(data.getClass().toString().contains("String")) {
//                iter.remove();
//            }
            if(data instanceof String) {
                iter.remove();
            }
        }
        
        System.out.println(set);
    }
}
