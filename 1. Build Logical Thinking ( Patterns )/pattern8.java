import java.util.Scanner;

public class pattern8 {
    static void pattern(int n) {
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < i ; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < (2 * n - 2*i - 1); j++) {

                System.out.print("*");
            }

            for (int j = 0; j < i ; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        pattern(num);
        sc.close();
    }
}
