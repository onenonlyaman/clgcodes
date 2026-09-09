n = int(input("Enter value of n: "))

total_sum = 0
current_sum = 0

for i in range(1, n + 1):
    current_sum += i
    total_sum += current_sum

print("Sum of the series:", total_sum)
