a, b = map(int, input().split())

cnt = 0
for i in range(a, b+1):
    num1 = i//10
    num2 = i%10
    if (num1==3 or num1==6 or num1==9) or (num2==3or num2==6or num2==9) or i%3==0:
        cnt+=1
# Write your code here!

print(cnt)