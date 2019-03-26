package lesson01;

public class Dog {
    // 定義屬性
    String kind; // 品種
    int age; // 年齡
    String color = "黑"; // 毛色
    
    // 定義方法
    void skill() { // 特殊技巧
        System.out.println("會叫");
    }
    
    void eat(Food food) { // 生存技巧
        System.out.printf("%s喜歡吃%s\n", kind, food.name);
    }
    
    int calc(int x, int y) {
        int sum = x + y;
        return sum;
    }
    
}
