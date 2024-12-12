def generate_snail(N):
    snail = [[0] * N for _ in range(N)]
    num = 1
    x, y = 0, 0
    dx, dy = 0, 1  # 초기 방향은 오른쪽

    for _ in range(N * N):
        snail[x][y] = num
        num += 1
        nx, ny = x + dx, y + dy

        if nx < 0 or nx >= N or ny < 0 or ny >= N or snail[nx][ny] != 0:
            # 방향 전환 (오른쪽 -> 아래 -> 왼쪽 -> 위)
            dx, dy = dy, -dx
            nx, ny = x + dx, y + dy

        x, y = nx, ny

    return snail

def main():
    T = int(input())
    for t in range(1, T + 1):
        N = int(input())
        snail = generate_snail(N)
        print(f"#{t}")
        for row in snail:
            print(" ".join(map(str, row)))

main()