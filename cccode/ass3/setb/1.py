r1 = float(input("Enter real part of first complex number: "))
i1 = float(input("Enter imaginary part of first complex number: "))
r2 = float(input("Enter real part of second complex number: "))
i2 = float(input("Enter imaginary part of second complex number: "))

c1 = complex(r1, i1)
c2 = complex(r2, i2)
ans = c1 + c2

print("First complex number:", c1)
print("Second complex number:", c2)
print("Sum:", ans)
