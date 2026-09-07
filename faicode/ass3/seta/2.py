tree = {
    'A': ['B', 'C'],
    'B': ['D', 'E'],
    'C': ['F', 'G'],
    'D': ['H', 'I'],
    'E': ['J', 'K'],
    'F': ['L', 'M'],
    'G': ['N', 'O']
}

def heuristic(node):
    scores = {
        'A': 0, 'B': 2, 'C': 4,
        'D': 3, 'E': 5, 'F': 6, 'G': 9,
        'H': 1, 'I': 4, 'J': 5, 'K': 2,
        'L': 7, 'M': 6, 'N': 8, 'O': 10
    }
    return scores.get(node, 0)

def alphabeta(node, depth, limit, alpha, beta, is_max):
    if depth == limit or node not in tree or len(tree[node]) == 0:
        return heuristic(node)

    if is_max:
        best = -999
        for child in tree[node]:
            val = alphabeta(child, depth + 1, limit, alpha, beta, False)
            best = max(best, val)
            alpha = max(alpha, best)
            if beta <= alpha:
                break
        return best
    else:
        best = 999
        for child in tree[node]:
            val = alphabeta(child, depth + 1, limit, alpha, beta, True)
            best = min(best, val)
            beta = min(beta, best)
            if beta <= alpha:
                break
        return best

limit = int(input("Enter depth limit: "))
result = alphabeta('A', 0, limit, -999, 999, True)
print("Optimal value with depth limit", limit, ":", result)
