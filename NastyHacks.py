times = int(input())
for i in range (times):
    r, e, c = map(int, (input().split()))
    if(r > e-c):
        print("do not advertise")
    elif(r < e-c):
        print("advertise")
    else:
        print("does not matter")