package lab;

public class ForLoopNinetable {

    public static void main(String[] args) {

        for (int x = 1; x <= 9; x++) {
            for (int y = 1; y <= 9; y++) {
                System.out.printf("%d x %d = %d\t", x, y, (x * y));
            }
            System.out.println();
        }

    }
}
