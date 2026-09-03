graph = {
    'A': ['B', 'C'],
    'B': ['D', 'E'],
    'C': ['F'],
    'D': [],
    'E': [],
    'F': []
}

def bfs(start, goal):
    q = [start]
    count = 0
    while len(q) > 0:
        count = count + 1
        curr = q.pop(0)
        if curr == goal:
            return count
        for neighbor in graph[curr]:
            q.append(neighbor)

def dfs(start, goal):
    s = [start]
    count = 0
    while len(s) > 0:
        count = count + 1
        curr = s.pop()
        if curr == goal:
            return count
        for neighbor in graph[curr]:
            s.append(neighbor)

print("BFS visited nodes:", bfs('A', 'F'))
print("DFS visited nodes:", dfs('A', 'F'))