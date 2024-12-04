import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.security.sasl.SaslClient;

public class TwoPointer {
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

    public static int Jumong() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        int M = Integer.parseInt(reader.readLine());

        int[] numbers = Arrays.stream(reader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        Arrays.sort(numbers);
        int count = 0;
        int i = 0;
        int j = N-1;

        while (i < j) {
            int sum = numbers[i] + numbers[j];
            if(sum > M){
                j -= 1;
            }else if(sum < M){
                i += 1;
            } else {
                i += 1;
                j -= 1;
                count += 1;
            }
        }

        return count;
    }
}
