N, K = map(int, input().split())

yaksus = []
for i in range(1, N + 1, 1):
    if N % i == 0:
        yaksus.append(i)

if len(yaksus) < K:
    print(0)
else:
    print(yaksus[K-1])
