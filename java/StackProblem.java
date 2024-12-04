import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class StackProblem {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            numbers.add(scanner.nextInt());
        }

        Stack<Integer> stack = new Stack<>();

        StringBuilder sb = new StringBuilder();
        int num = 1;

        boolean result = true;
        for (int target : numbers) {
            if (num <= target) {
                while (num <= target) {
                    stack.push(num);
                    sb.append("+\n");
                    num += 1;
                }
                stack.pop();
                sb.append("-\n");
            } else {
                int popNumber = stack.pop();
                if (popNumber > target) {
                    result = false;
                    break;
                } else {
                    sb.append("-\n");
                }
            }
        }

        if (result) {
            System.out.println(sb.toString());
        } else {
            System.out.println("NO");
        }
    }
}
