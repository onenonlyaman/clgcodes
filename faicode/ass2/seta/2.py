board = []
for i in range(9):
    board.append(" ")

player = "X"

for turn in range(9):
    print(board[0:3], "\n", board[3:6], "\n", board[6:9])
    move = int(input("Enter position (0-8): "))
    board[move] = player

    wins = [(0,1,2), (3,4,5), (6,7,8), (0,3,6), (1,4,7), (2,5,8), (0,4,8), (2,4,6)]

    win_found = False
    for a, b, c in wins:
        if board[a] == player and board[b] == player and board[c] == player:
            win_found = True
            break

    if win_found:
        print("Player", player, "wins!")
        break

    if player == "X":
        player = "O"
    else:
        player = "X"