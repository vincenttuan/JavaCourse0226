package lesson18;

import java.util.Arrays;

public class LambdaTest4 {
    
    public static void main(String[] args) {
        // { {'a','b'}, {'c','d'}, {'e','f'} } -> flatMap -> {'a','b','c','d','e','f'}
        String[][] data = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};
        Arrays.stream(data)
                .flatMap(x -> Arrays.stream(x))
                .forEach(System.out::println);
        
        //{{100, 90}, {80, 70}, {60, 50}} -> flatMap -> {100, 90, 80, 70, 60, 50}
        int[][] data2 = new int[][]{{100, 90}, {80, 70}, {60, 50}};
        Arrays.stream(data2)
                .flatMapToInt(x -> Arrays.stream(x))
                .map(x -> (int)(x >= 60 ? x*1.1 : x*0.9))
                .forEach(System.out::println);
    }
}
