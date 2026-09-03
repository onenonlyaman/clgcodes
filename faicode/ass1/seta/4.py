players = ["Sahil", "Rahul"]
print("Initial:", players)

players.append("Priya")
print("After append:", players)

players.extend(["Neha", "Rohan"])
print("After extend:", players)

players.insert(1, "Suresh")
print("After insert:", players)

players.remove("Rahul")
print("After remove:", players)

del players[0]
print("After delete:", players)
