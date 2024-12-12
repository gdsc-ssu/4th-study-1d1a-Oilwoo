from collections import deque

m, n = map(int, input().split())

tomatoes = []
for _ in range(n):
    tomatoes.append(list(map(int, input().split())))

dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

queue = deque([])

for i in range(n):
    for j in range(m):
        if tomatoes[i][j] == 1:
            queue.append([i, j])


def bfs():
    while queue:
        x, y = queue.popleft()
        for i in range(4):
            nx, ny = x + dx[i], y + dy[i]
            if 0 <= nx < n and 0 <= ny < m and tomatoes[nx][ny] == 0:
                tomatoes[nx][ny] = tomatoes[x][n] + 1
                queue.append([nx, ny])

bfs()

res = 0
for i in tomatoes:
    for j in i:
        if j == 0:
            print(-1)
            exit(0)
    res = max(res, max(i))

print(res - 1)
