package lesson09;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;
import lesson07.HasSet_Demo;

public class HashMap_Demo {
    public static void main(String[] args) {
        LinkedHashMap<String, Double> map = new LinkedHashMap<>();
        map.put("身高", 175.5);
        map.put("體重", 65.5);
        System.out.println(map);
        System.out.println(map.get("身高"));
        
        Set<String> keys          = map.keySet(); // 抓取所有的 key
        System.out.println(keys);
        Collection<Double> values = map.values(); // 抓取所有的 value
        System.out.println(values);
        
        for(String key : keys) { // 走訪每一個 key 元素
            System.out.println(map.get(key)); // 根據 key 來取 value
        }
        
        HashSet<String> keys2 = new HashSet<>(map.keySet()); // 抓取所有的 key
        ArrayList<Double> values2 = new ArrayList<>(map.values()); // 抓取所有的 value
        System.out.println(keys2); 
        System.out.println(values2); 
        
    }
}
