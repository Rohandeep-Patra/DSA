import java.util.Scanner;

public class pattern4 {
    static void pattern(int n) {
        int i, j;
        for (i = 1; i < n+1; i++) {
            for (j = 1; j < i + 1; j++) {
                System.out.print(i);
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
