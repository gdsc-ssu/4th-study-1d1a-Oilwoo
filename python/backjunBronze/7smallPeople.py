heights = []
for i in range(9):
    heights.append(int(input()))

# heights = [int(input()) for _ in range(9)]

total_heigths = sum(heights)

found = False
for i in range(9):
    for j in range(i + 1, 9):
        if total_heigths - (heights[i] + heights[j]) == 100:
            heights.pop(j)
            heights.pop(i)
            found = True
            break
    if found:
        break

heights.sort()
for height in heights:
    print(height)