import java.io.IOException;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Boj_11286 {
    public static void main(String[] args) throws IOException {
        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> {
            // 큐는 기본적으로 작은 숫자가 우선적으로 나감
            int absA = Math.abs(a);
            int absB = Math.abs(b);
            if (absA != absB) {
                return absA - absB; // 절대값 기준 작은거 먼저
            } else {
                return a - b; // 절대값이 같을 경우 작은거 먼저
            }
        });

        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        for (int i = 0; i < X; i++) {
            int n = scanner.nextInt();
            if (n == 0) {
                if (queue.isEmpty()) {
                    System.out.println(0);
                } else {
                    System.out.println(queue.poll());
                }
            } else {
                queue.add(n);
            }
        }
    }
}
