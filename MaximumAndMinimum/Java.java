package MaximumAndMinimum;

import java.util.Scanner;

public class Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] d = new long[N];
        long sum = 0;
        long v = 0;
        for (int i = 0; i < N; i++) {
            d[i] = sc.nextLong();
            sum += d[i];
            v = Math.max(v, d[i]);
        }
        sum -= v;
        System.out.println(sum + v);
        System.out.println((v <= sum) ? 0 : v - sum);
        sc.close();
    }
}
