T = int(input())
for test_case in range(1, T + 1):
    N = map(int, input())
    prices = list(map(int, input().split()))

    profit = 0
    maxPrice = 0
    for price in list(reversed(prices)):
        if price > maxPrice:
            maxPrice = price
        else:
            profit += maxPrice - price

    print(f"#{T} {profit}")
