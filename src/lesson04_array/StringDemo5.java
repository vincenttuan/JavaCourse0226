package lesson04_array;

public class StringDemo5 {
    public static void main(String[] args) {
        String s1 = new String("Java");
        String s2 = new String("Java");
        String s3 = "Java";
        String s4 = "Java";
        String s5 = "jAVA";
        System.out.println(s1 == s2);
        System.out.println(s3 == s4);
        System.out.println(s1.equals(s2));
        System.out.println(s3.equals(s4));
        System.out.println(s3.equals(s1));
        System.out.println(s4.equals(s5));
        System.out.println(s4.toUpperCase().equals(s5.toUpperCase()));
        //System.out.println(s4.toUpperCase());
        System.out.println(s4.equalsIgnoreCase(s5));
    }
}

