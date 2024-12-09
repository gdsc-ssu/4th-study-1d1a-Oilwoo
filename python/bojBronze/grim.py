from collections import deque

n, m = map(int, input().split())

paper = [list(map(int, input().split())) for _ in range(n)]

dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

visited = [[False] * m for _ in range(n)]


def bfs(x, y):
    queue = deque([(x, y)])
    visited[x][y] = True
    area = 1

    while queue:
        cx, cy = queue.popleft()
        for i in range(4): #상하 좌우 방문
            nx, ny = cx + dx[i], cy + dy[i]
            if 0 <= nx < n and 0 <= ny < m:
                if not visited[nx][ny] and paper[nx][ny] == 1:
                    visited[nx][ny] = True
                    queue.append((nx, ny)) #새로운 건 큐에 넣음
                    area += 1
    return area


num_pictures = 0
max_area = 0
for i in range(n):
    for j in range(m):
        if paper[i][j] == 1 and not visited[i][j]: #1인 칸이고, 방문한칸인지 아닌지 체크
            num_pictures += 1
            max_area = max(max_area, bfs(i, j))

print(num_pictures)
print(max_area)
