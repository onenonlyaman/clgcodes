def hanoi(n, a, c, b):
    if n > 0:
        hanoi(n - 1, a, b, c)
        print("Move disk", n, "from", a, "to", c)
        hanoi(n - 1, b, c, a)

n = int(input("Enter number of disks: "))
hanoi(n, 'A', 'C', 'B')