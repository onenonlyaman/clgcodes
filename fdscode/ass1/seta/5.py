num = int(input("Enter a number: "))
num1 = num
power = len(str(num))
arm = 0
while(num > 0):
    digit = num % 10
    arm = arm + (digit ** power)
    num = num // 10

if num1 == arm:
    print("Armstrong")
else:
    print("Not Armstrong")