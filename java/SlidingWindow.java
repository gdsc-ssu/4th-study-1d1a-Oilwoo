import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SlidingWindow {
    public static void slidingWindowng() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");
        int S = Integer.valueOf(input[0]);
        int P = Integer.valueOf(input[1]);
        String[] dna = reader.readLine().split("");
        // A, C, G, T 순
        int[] arrayCounts = Arrays.stream(reader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        Map<String, Integer> passwordRule = new HashMap<>();
        passwordRule.put("A", arrayCounts[0]);
        passwordRule.put("C", arrayCounts[1]);
        passwordRule.put("G", arrayCounts[2]);
        passwordRule.put("T", arrayCounts[3]);

        Map<String, Integer> newPassword = new HashMap<>();
        //초기셋팅 0~P
        for (int i = 0; i < P; i++) {
            newPassword.put(dna[i], newPassword.getOrDefault(dna[i], 0) + 1);
        }

        int answer = 0;

        int point;
        for (int i = P; i < S; i++){
            point = i - P;
            newPassword.put(dna[i], newPassword.getOrDefault(dna[i], 0) + 1);
            newPassword.put(dna[point], newPassword.get(dna[point]) - 1);

            if (checkCount(passwordRule, newPassword)) {
                answer++; // 조건확인후 비밀번호 개수를 증가시켜준다.
            }
        }

        System.out.println(answer);

    }

    private static boolean checkCount(Map<String, Integer> rule, Map<String, Integer> password){
        if (rule.getOrDefault("A", 0) <= password.getOrDefault("A", 0) &&
            rule.getOrDefault("C", 0) <= password.getOrDefault("C", 0) &&
            rule.getOrDefault("G", 0) <= password.getOrDefault("G", 0) &&
            rule.getOrDefault("T", 0) <= password.getOrDefault("T", 0)
        ) return true;
        else return false;
    }
}
