package lesson15_interface;

public class School {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student2 s2 = new Student2();
        System.out.println(s1.getBMI());
        System.out.println(s2.getBMI());
        System.out.println();
        System.out.println(s1.getScoreSD());
        System.out.println(s2.getScoreSD());
    }
}
