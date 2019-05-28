package lesson20_exception;

public class CompareScore {
    public static void main(String[] args) {
        Score s1 = new Score("score.txt");
        Score s2 = new Score("score.csv");
        System.out.println(s1.getSum() > s2.getSum() ? s1 : s2);
    }
}
