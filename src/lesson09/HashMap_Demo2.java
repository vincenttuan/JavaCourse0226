package lesson09;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class HashMap_Demo2 {
    public static void main(String[] args) {
        
        LinkedHashMap<String, Double> map1 = new LinkedHashMap<>();
        map1.put("座號", 1.0);
        map1.put("身高", 175.5);
        map1.put("體重", 65.5);
        
        LinkedHashMap<String, Double> map2 = new LinkedHashMap<>();
        map2.put("座號", 2.0);
        map2.put("身高", 155.5);
        map2.put("體重", 45.0);
        
        LinkedHashMap<String, Double> map3 = new LinkedHashMap<>();
        map3.put("座號", 3.0);
        map3.put("身高", 183.5);
        map3.put("體重", 72.3);
        
        ArrayList<LinkedHashMap<String, Double>> list = new ArrayList<>();
        list.add(map1);
        list.add(map2);
        list.add(map3);
        System.out.println(list);
        
        for(LinkedHashMap<String, Double> map : list) {
            double bmi = map.get("體重") / Math.pow(map.get("身高")/100, 2);
            map.put("BMI", bmi);
        }
        System.out.println(list);
        System.out.println(list.get(0).get("BMI"));
        
        // Max
        /*
        [{座號=1.0, 身高=175.5, 體重=65.5, BMI=21.26606115210104}, {座號=2.0, 身高=155.5, 體重=45.0, BMI=18.61022942277272}, {座號=3.0, 身高=183.5, 體重=72.3, BMI=21.47168662622783}]
        [21.26606115210104, 18.61022942277272, 21.47168662622783]
        21.47168662622783
        */
        
        double max = list.stream()
                                .mapToDouble(e -> e.get("BMI"))
                                .max().getAsDouble();
        System.out.println(max);
        
    }
}
