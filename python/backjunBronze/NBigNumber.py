T = int(input())

N = 3
for test_case in range(1, T + 1):
    numbers = list(map(int, input().split()))

    numbers.sort()
    numbers.reverse()
    print(numbers[N - 1])
