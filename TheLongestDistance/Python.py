import math

n = int(input())
x = []
y = []
for i in range(n):
    xi, yi = map(int, input().split())
    x.append(xi)
    y.append(yi)

max_length = 0
for i in range(n):
    for j in range(i+1, n):
        d = math.sqrt((x[i]-x[j])**2 + (y[i]-y[j])**2)
        if d > max_length:
            max_length = d

print(max_length)
