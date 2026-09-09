# Cloud Computing Code Collection

## Assignment 3: Introduction to Google Cloud Console & Cloud Shell Editor

### Set A

#### 1. Fibonacci series up to n terms (`ass3/seta/1.py`)
```python
n = int(input("Enter number of terms: "))
a = 0
b = 1

for i in range(n):
    print(a)
    c = a + b
    a = b
    b = c
```

#### 2. Multiplication table (1 to 10) using nested loops (`ass3/seta/2.py`)
```python
for i in range(1, 11):
    for j in range(1, 11):
        print(i * j, end="\t")
    print()
```

#### 3. Arithmetic operations using if-elif-else (`ass3/seta/3.py`)
```python
num1 = float(input("Enter first number: "))
num2 = float(input("Enter second number: "))
op = input("Enter operator (+, -, *, /): ")

if op == "+":
    print("Result:", num1 + num2)
elif op == "-":
    print("Result:", num1 - num2)
elif op == "*":
    print("Result:", num1 * num2)
elif op == "/":
    print("Result:", num1 / num2)
else:
    print("Invalid Operator")
```

#### 4. Palindrome number check (`ass3/seta/4.py`)
```python
num = int(input("Enter a number: "))
temp = num
rev = 0

while temp > 0:
    rev = rev * 10 + (temp % 10)
    temp //= 10

if num == rev:
    print("Palindrome")
else:
    print("Not Palindrome")
```

---

### Set B

#### 1. Add two complex numbers (`ass3/setb/1.py`)
```python
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
```

#### 2. Sum of series (1) + (1+2) + ... + (1+2+...+n) (`ass3/setb/2.py`)
```python
n = int(input("Enter value of n: "))

total_sum = 0
current_sum = 0

for i in range(1, n + 1):
    current_sum += i
    total_sum += current_sum

print("Sum of the series:", total_sum)
```

#### 3. Decimal to hexadecimal without built-in functions (`ass3/setb/3.py`)
```python
num = int(input("Enter decimal number: "))

if num == 0:
    print("Hexadecimal: 0")
else:
    hex_chars = "0123456789ABCDEF"
    hex_val = ""
    temp = num
    while temp > 0:
        rem = temp % 16
        hex_val = hex_chars[rem] + hex_val
        temp //= 16
    print("Hexadecimal:", hex_val)
```

---

### Set C

#### 1. Diamond star pattern (`ass3/setc/1.py`)
```python
n = 3

for i in range(1, n + 1):
    for j in range(i):
        print("*", end=" ")
    print()

for i in range(n - 1, 0, -1):
    for j in range(i):
        print("*", end=" ")
    print()
```
