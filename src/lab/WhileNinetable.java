package lab;

public class WhileNinetable {

    public static void main(String[] args) {
        int x = 1;
        while (x <= 9) {
            int y = 1;
            while (y <= 9) {
                System.out.printf("%d x %d = %d\t", x, y, (x * y));
                y++;
            }
            x++;
            System.out.println();
        }
    }
}
