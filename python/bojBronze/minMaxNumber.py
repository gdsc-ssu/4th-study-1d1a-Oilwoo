# 최대공약수(GCD)를 계산하는 유클리드 호제법
def compute_gcd(a, b):
    while b != 0:  # 나머지가 0이 될 때까지 반복
        a, b = b, a % b
    return a

# 최소공배수(LCM) 계산
def compute_lcm(a, b, gcd):
    return (a * b) // gcd

# 입력 받기
a, b = map(int, input().split())

# 최대공약수 계산
gcd = compute_gcd(a, b)

# 최소공배수 계산
lcm = compute_lcm(a, b, gcd)

# 결과 출력
print(gcd)  # 최대공약수 출력
print(lcm)  # 최소공배수 출력