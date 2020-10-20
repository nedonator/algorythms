import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n + 1; i++) {
            int num = sc.nextInt();
            if (a[num - 1]++ == 1) {
                System.out.println(num);
            }
        }
    }
}
