states = [(0,0), (4,0), (1,3), (1,0), (0,1), (4,1), (2,3)]

for i in range(len(states) - 1):
    current_state = states[i]
    next_state = states[i + 1]
    print(current_state, "to", next_state)