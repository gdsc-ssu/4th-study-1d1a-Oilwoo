N = int(input())

pan = [N-1][N-1]

for i in range(N+1):
    row = list(map(str, input().split()))
    pan[i] = row

print(pan)