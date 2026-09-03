queue = [[(3, 3, 1)]]

while len(queue) > 0:
    path = queue.pop(0)
    last_state = path[-1]
    m = last_state[0]
    c = last_state[1]
    b = last_state[2]

    if m == 0 and c == 0 and b == 0:
        for step in path:
            print(step)
        break

    moves = [(1, 0), (2, 0), (0, 1), (0, 2), (1, 1)]
    for dm, dc in moves:
        if b == 1:
            nm = m - dm
            nc = c - dc
        else:
            nm = m + dm
            nc = c + dc

        nb = 1 - b

        if 0 <= nm <= 3 and 0 <= nc <= 3:
            if (nm == 0 or nm >= nc) and (3 - nm == 0 or (3 - nm) >= (3 - nc)):
                if (nm, nc, nb) not in path:
                    new_path = list(path)
                    new_path.append((nm, nc, nb))
                    queue.append(new_path)