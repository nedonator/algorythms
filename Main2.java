import java.util.Scanner;

//an another solution of 1st task. O(n) complexity and O(1) memory usage
public class Main2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = 0;
        for (int i = 0; i < n + 1; i++) {
            s += sc.nextInt();
        }
        int ans = n * (n + 1) / 2 - s;
        System.out.println(-ans);
    }
}
