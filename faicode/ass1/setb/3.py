temp = float(input("Enter room temperature: "))

if temp > 35:
    action = "Turn Fan to High Speed"
elif temp > 25:
    action = "Turn Fan to Medium Speed"
elif temp > 18:
    action = "Turn Fan to Low Speed"
else:
    action = "Turn Fan OFF"

print("Action:", action)
