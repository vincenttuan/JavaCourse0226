package lesson08;

import java.util.Random;
import java.util.Stack;

public class Stack_Demo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        for(int i=1;i<=10;i++) {
            stack.push(new Random().nextInt(100));
        }
        System.out.println(stack);
        while (!stack.isEmpty()) {
            System.out.println("取出 : " + stack.pop());
        }
        System.out.println(stack);
        
    }
}
