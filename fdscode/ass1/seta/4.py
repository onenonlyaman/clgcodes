n = int(input("Enter a number: "))
a = 0
b = 1

print(a)
print(b)

for i in range(n - 2):
    nex = a + b
    print(nex)
    a = b
    b = nex