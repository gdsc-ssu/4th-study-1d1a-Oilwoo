numbers = [1, 1, 1, 1, 1]
target = 3


def solution(self):
    self.answer = 0
    self.dfs(0, 0, numbers, target)
    return self.answer


def dfs(self, n, current_sum, numbers, target):
    if n == len(numbers):
        if current_sum == target:
            self.answer += 1
        return

    self.dfs(n + 1, current_sum + numbers[n], numbers, target)
    self.dfs(n + 1, current_sum - numbers[n], numbers, target)


dfs(0, 0)
