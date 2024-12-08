import math

def isPrime(num):
    if num < 2:
        return False
    for i in range(2, int(math.sqrt(num)) + 1):
        if num % i == 0:
            return False
    return True


M = int(input())
N = int(input())

sosuList = []

for i in range(2, 10001):
    if isPrime(i):
        sosuList.append(i)

filterlingList = []
for sosu in sosuList:
    if sosu >= M and sosu <= N:
        filterlingList.append(sosu)

if len(filterlingList) == 0:
    print(-1)
else:
    print(sum(filterlingList))
    print(min(filterlingList))
