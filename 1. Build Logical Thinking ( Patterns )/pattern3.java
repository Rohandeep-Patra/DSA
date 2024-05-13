import java.util.*;;

public class pattern3 {
    static void pattern(int n) {
        int i, j;
        for (i = 1; i < n+1; i++) {
            for (j = 1; j <= i ; j++) {
                System.out.print(j);
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
