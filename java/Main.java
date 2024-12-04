import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        SlidingWindow.slidingWindowng();
    }

    private static int func2(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    return 1;
                }
            }
        }
        return 0;
    }

    private static int func3(int n) {
        if (Math.sqrt(n) * Math.sqrt(n) == n) {
            return 1;
        }
        return 0;
    }

    private static int func4(int n) {
        int v = 1;
        while (2 * v <= n) {
            v *= 2;
        }
        return v;
    }

    public static void hap() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[] sums = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            sums[i] = sums[i - 1] + scanner.nextInt();
        }

        while (M > 0) {
            M -= 1;
            int i = scanner.nextInt();
            int j = scanner.nextInt();

            System.out.println(sums[j] - sums[i - 1]);
        }
    }

    public static int twoPointer() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int count = 1; // 자기자신 포함
        int start_index = 1;
        int end_index = 1;
        int sum = 1;
        while (end_index != N) {
            if (sum == N) {
                count += 1;
                end_index += 1;
                sum += end_index;
            } else if (sum < N) {
                end_index += 1;
                sum += end_index;
            } else if (sum > N) {
                sum -= start_index;
                start_index += 1;
            }
        }
        return count;
    }
}