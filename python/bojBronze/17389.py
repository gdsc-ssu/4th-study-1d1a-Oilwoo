N = int(input())
S = list(input())

bonus = 0
total = 0
for i in range(1, N + 1):
    if S[i - 1] == 'O':
        total += i + bonus
        bonus += 1
    elif S[i - 1] == 'X':
        bonus = 0

print(total)