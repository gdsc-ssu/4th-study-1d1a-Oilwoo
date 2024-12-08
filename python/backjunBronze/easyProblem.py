n1, n2 = map(int, input().split())

numbers = []

for i in range(1, 1001):
    for j in range(1, i+1):
        numbers.append(i)

print(sum(numbers[n1-1:n2]))
