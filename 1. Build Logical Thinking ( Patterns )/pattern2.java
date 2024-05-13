import java.util.*;

public class pattern2 {
    static void pattern(int n) {
        int i, j;
        for (i = 0; i < n; i++) {
            for (j = 0; j < i + 1; j++) {
                System.out.print("*");
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
