monkey = "door"
box = "window"
height = "low"
has_banana = False

print("Initial State:", monkey, box, height, has_banana)

while not has_banana:
    if monkey != box:
        print("Action: Monkey moves to", box)
        monkey = box
    elif box != "middle":
        print("Action: Monkey pushes box to middle")
        box = "middle"
        monkey = "middle"
    elif height != "high":
        print("Action: Monkey climbs onto the box")
        height = "high"
    else:
        print("Action: Monkey grabs the banana")
        has_banana = True

print("Final State:", monkey, box, height, has_banana)