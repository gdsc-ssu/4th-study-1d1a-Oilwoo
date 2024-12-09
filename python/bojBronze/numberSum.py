S = int(input())

N = 0
total = 0

while total + (N + 1) <= S:
    N += 1
    total += N

print(N)