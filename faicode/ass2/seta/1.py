j1, j2 = 3, 4
print(j1, j2)

while j1 != 2:
    if j1 == 0:
        j1 = 4
    elif j2 == 3:
        j2 = 0
    else:
        transfer = min(j1, 3 - j2)
        j1 -= transfer
        j2 += transfer
    print(j1, j2)