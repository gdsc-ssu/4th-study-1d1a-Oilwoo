for test_case in range(1, 11):
    buildingsSize = int(input())
    total = 0
    buildings = list(map(int, input().split()))
    for i in range(2, buildingsSize - 2):
        #nearBuildings = buildings[i - 2:i + 3]
        #nearBuildings.remove(buildings[i])
        nearMax = max(buildings[i - 2], buildings[i - 1], buildings[i + 1], buildings[i + 2])
        if nearMax < buildings[i]:
            total += buildings[i] - nearMax

    print(f"#{test_case}", total)
