initial = ["A", "B", "C"]
goal = []

print("Initial:", initial)

while len(initial) > 0:
    block = initial.pop()
    goal.append(block)
    print("Move", block, "to Goal:", goal)