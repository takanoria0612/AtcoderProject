package YokanParty;

import java.util.Scanner;

public class Java {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int L = scanner.nextInt();
        int K = scanner.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        int left = 1;
        int right = L;
        int result = 0;

        while (left <= right) {
            int middle = (left + right) / 2;
            int count = 0;
            int lastCut = 0;

            for (int i = 0; i < N; i++) {
                if (A[i] - lastCut >= middle && L - A[i] >= middle) {
                    count++;
                    lastCut = A[i];

                    if (count == K) {
                        break;
                    }
                }
            }

            if (count == K) {
                result = middle;
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        System.out.println(result);
    }
}

