times = int(input())
for i in range(times):
    x = int(input())
    sum = 1 
    for y in range(1, x + 1):
        sum *= y  
    print(sum%10)