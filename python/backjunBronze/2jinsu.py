T = int(input())

for test_case in range(1, T + 1):
    n = int(input())
    positions = []
    position = 0
    while n > 0:
        if n & 1:
            positions.append(position)
        n >>= 1
        position += 1
    print(positions)