a, b = map(int, input().split())

# Write your code here!
res = 0;

def cal(n):

    for i in range(2, n):
        if n%i==0:
            return False
    return True

for j in range(a, b+1):
    if cal(j) and j!=1:
        res += j
    

print(res)