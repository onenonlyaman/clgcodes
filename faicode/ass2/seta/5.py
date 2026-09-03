x = 0

while True:
    current_val = -(x - 3)**2
    next_val = -((x + 0.1) - 3)**2

    if next_val > current_val:
        x = x + 0.1
    else:
        break

print("Optimal x:", round(x, 2))