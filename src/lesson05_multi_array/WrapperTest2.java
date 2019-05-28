package lesson05_multi_array;

public class WrapperTest2 {
    public static void main(String[] args) {
        // int max ?
        int x = Integer.MAX_VALUE;
        System.out.println(x);
        
        String chinese = "40";
        String math = "20";
        // String 轉 int
        // case 1
        int int_chinese = Integer.parseInt(chinese); // Integer.valueOf(chinese);
        int int_math    = Integer.parseInt(math); // Integer.valueOf(math);
        System.out.println(int_chinese + int_math);
        // case 2
        System.out.println(Integer.parseInt(chinese) + Integer.valueOf(math));
        
        
    }
}
