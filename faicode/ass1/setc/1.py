memory = {"Room A": "Clean", "Room B": "Dirty"}

room = input("Enter Room (Room A/Room B): ")
perception = input("Enter Current Perception (Clean/Dirty): ")

if perception == "Dirty":
    action = "Clean the Room"
    memory[room] = "Clean"
elif memory[room] == "Clean":
    action = "Move to Next Room"
else:
    action = "Do Nothing"

print("Action Executed:", action)
print("Updated Memory State:", memory)
