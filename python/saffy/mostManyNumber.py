from collections import Counter

T = int(input())
# 여러개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
for test_case in range(1, T + 1):
    scores = list(map(int, input().split()))

    counts = Counter(scores)
    max_freq = max(counts.values())

    modes = []
    for score, freq in counts.items():
        if freq == max_freq:
            modes.append(score)

    mode = max(modes)

    print(f"#{T} {mode}")
