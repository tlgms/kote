import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int w = sc.nextInt();
        int h = sc.nextInt();

        int min = x;

        if (y < min) {
            min = y;
        }

        if (w - x < min) {
            min = w - x;
        }

        if (h - y < min) {
            min = h - y;
        }

        System.out.println(min);
    }
}