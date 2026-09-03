num = int(input("Enter a number: "))
num1 = num
rev = 0
while(num > 0):
    digit = num % 10
    rev = rev * 10 + digit
    num = num // 10

if num1 == rev:
    print("Palindrome")
else:
    print("Not Palindrome")