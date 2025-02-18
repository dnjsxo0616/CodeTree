a, b = map(int, input().split())

cnt = 0

def contains(n):
    while n>0:
        if n%10==3 or n%10==6 or n%10==9:
            return True
        n//10

    return False

def is_number(n):
    return contains(n) or (n%3==0)
# Write your code here!

cnt=0
for i in range(a, b+1):
    if is_number(i):
        cnt+=1

print(cnt)