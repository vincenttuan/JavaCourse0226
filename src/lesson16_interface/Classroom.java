package lesson16_interface;

public class Classroom {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        Student2 s2 = new Student2();
        System.out.println(s1.getSum());
        System.out.println(s1.getSum2());
        System.out.println(s1.getSum3());
        System.out.println(s2.getSum());
        System.out.println(s2.getSum2());
        System.out.println(s2.getSum3());
        s1.copyRight();
        s2.copyRight();
        System.out.println(s1.getSD());
        System.out.println(s2.getSD());
        System.out.println(s1.getSD2());
        System.out.println(s2.getSD2());
    }
}
