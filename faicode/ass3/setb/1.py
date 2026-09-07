def minimax(depth, node_index, is_max, scores, h):
    if depth == h:
        return scores[node_index]

    if is_max:
        left = minimax(depth + 1, node_index * 2, False, scores, h)
        right = minimax(depth + 1, node_index * 2 + 1, False, scores, h)
        return max(left, right)
    else:
        left = minimax(depth + 1, node_index * 2, True, scores, h)
        right = minimax(depth + 1, node_index * 2 + 1, True, scores, h)
        return min(left, right)

scores = [3, 5, 2, 9, 12, 5, 23, 23]
h = 3

print("Leaf scores:", scores)
result = minimax(0, 0, True, scores, h)
print("Optimal value:", result)
