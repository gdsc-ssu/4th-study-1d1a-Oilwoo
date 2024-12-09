from collections import deque

n, m, v = map(int, input().split())

graph = [[False] * (n + 1) for _ in range(n + 1)]
visited = [False] * (n + 1)

#그래프에 표시
for i in range(m):
    a, b = map(int, input().split())
    graph[a][b] = True
    graph[b][a] = True

def dfs(i):
    global visited
    visited[i] = True
    print(i, end=' ')
    for next in range(1, n+1):
        if not visited[next] and graph[i][next]:
            dfs(next)

def bfs(v):
    global visited
    q = deque([v])
    while q:
        cur = q.popleft()
        visited[cur] = True
        print(cur, end=" ")
        for next in range(1, n+1):
            if not visited[next] and graph[cur][next]:
                visited[next] = True
                q.append(next)

dfs(v)
print()

visited = [False] * (n + 1)

bfs(v)

