def dfs(m, c, b, path):
    if m == 0 and c == 0 and b == 0:
        return path

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
                    res = dfs(nm, nc, nb, new_path)
                    if res is not None:
                        return res
    return None

path = dfs(3, 3, 1, [(3, 3, 1)])
for step in path:
    print(step)