package lesson05;

import javax.swing.JOptionPane;

public class WrapperTest4 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("What's your name ?");
        System.out.println("My name is " + name);
        String age = JOptionPane.showInputDialog("How old are you ?");
        System.out.println("I'm " + age + " year old");
    }
}
