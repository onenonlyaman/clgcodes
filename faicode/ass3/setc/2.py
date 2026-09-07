import random

p1_score = 0
p2_score = 0

print("Stochastic Game Simulation")

for r in range(1, 4):
    p1_move = input("Round " + str(r) + " - Choose strategy (C/D): ").upper()
    p2_move = random.choice(["C", "D"])
    print("Player 2 chooses:", p2_move)

    chance = random.random()

    if p1_move == "C" and p2_move == "C":
        if chance < 0.8:
            p1_gain, p2_gain = 3, 3
        else:
            p1_gain, p2_gain = 1, 1
    elif p1_move == "C" and p2_move == "D":
        if chance < 0.5:
            p1_gain, p2_gain = 0, 5
        else:
            p1_gain, p2_gain = 0, 3
    elif p1_move == "D" and p2_move == "C":
        if chance < 0.5:
            p1_gain, p2_gain = 5, 0
        else:
            p1_gain, p2_gain = 3, 0
    else:
        p1_gain, p2_gain = 1, 1

    p1_score += p1_gain
    p2_score += p2_gain
    print("Round Payoff: Player 1 =", p1_gain, ", Player 2 =", p2_gain)

print("\nFinal Score:")
print("Player 1:", p1_score)
print("Player 2:", p2_score)

if p1_score > p2_score:
    print("Player 1 Wins")
elif p2_score > p1_score:
    print("Player 2 Wins")
else:
    print("Game Tied")
