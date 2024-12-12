N = int(input())

numbers = list(map(int, input().split()))

sosuCount = 0

for n in numbers:
    if n > 2:
        devideCount = 0
        for i in range(1, n + 1):
            if n % i == 0:
                devideCount += 1
        if devideCount == 2:
            sosuCount += 1

print(sosuCount)


N = int(input())
numbers = list(map(int, input().split()))

sosuCount = 0

for n in numbers:
    if n < 2:  # 소수는 2 이상이어야 함
        continue
    is_prime = True
    for i in range(2, int(n**0.5) + 1):  # √n까지 검사
        if n % i == 0:  # 나누어 떨어지면 소수가 아님
            is_prime = False
            break
    if is_prime:
        sosuCount += 1

print(sosuCount)