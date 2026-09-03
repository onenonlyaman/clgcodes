perception = input("Enter Perception (obstacle / clear / destination): ").lower()

if perception == "obstacle":
    decision = "Stop and Turn"
elif perception == "clear":
    decision = "Move Forward"
elif perception == "destination":
    decision = "Stop Vehicle"
else:
    decision = "Wait"

action = decision
print("Action Executed:", action)
