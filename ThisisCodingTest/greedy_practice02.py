n, m, k = map(int, input().split())
array = list(map(int, input().split()))

array.sort()
biggest = array[n-1]
secondBig = array[n-2]

total = 0
while True:
    for i in range(k):
        if m==0:
            break
        total += biggest
        m-=1
    if m ==0:
        break
    total+=secondBig
    m-=1
print(total)
