import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Boj_11724_DFS {
    static boolean[] visited;
    static ArrayList<Integer>[] A;

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");
        int n = Integer.valueOf(input[0]);
        int m = Integer.valueOf(input[1]);

        visited = new boolean[n + 1];

        for (int i = 1; i <= n; i++) {
            A[i] = new ArrayList<Integer>();
        }

        for (int i = 1; i <= m; i++) {
            String[] link = reader.readLine().split(" ");
            int s = Integer.parseInt(link[0]);
            int e = Integer.parseInt(link[1]);

            A[s].add(e);
            A[e].add(s);
        }

        int count = 0;
        for (int i = 1; i <= n;i++) {
            if(!visited[i]){
                count += 1;
                DFS(i);
            }
        }
        System.out.println(count);
    }

    private static void DFS(int v) {
        if(visited[v]){//방문 헀는지 체크
            return;//방문했으면 바로 리턴
        }
        visited[v] = true;//방문 안했으니까 방문한 처리
        for(int i : A[v]){//인접 노드 체크
            if(!visited[i] == false){//인접 노드중에 방문하지 않은 수가 있으면
                DFS(i);//DFS를 호출해 다시 더 깊이 탐색
            }
        }
    }
}
