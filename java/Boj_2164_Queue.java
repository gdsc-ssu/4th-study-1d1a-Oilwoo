import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Boj_2164_Queue {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        Queue<Integer> numbers = new LinkedList<>();

        for(int i = 1; i <= n; i++) {
            numbers.add(i);
        }

        while (numbers.size() != 1) {
            numbers.poll();
            int front = numbers.poll();
            numbers.add(front);
        }

        System.out.println(numbers.poll());
    }
}
