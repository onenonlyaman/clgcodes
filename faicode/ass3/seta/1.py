board = [" "] * 9

def print_board():
    for i in range(0, 9, 3):
        print(board[i], "|", board[i+1], "|", board[i+2])

def check_win(b, p):
    wins = [(0,1,2), (3,4,5), (6,7,8), (0,3,6), (1,4,7), (2,5,8), (0,4,8), (2,4,6)]
    for x, y, z in wins:
        if b[x] == b[y] == b[z] == p:
            return True
    return False

def minimax(b, is_max):
    if check_win(b, "O"):
        return 1
    if check_win(b, "X"):
        return -1
    if " " not in b:
        return 0

    if is_max:
        best = -100
        for i in range(9):
            if b[i] == " ":
                b[i] = "O"
                score = minimax(b, False)
                b[i] = " "
                best = max(best, score)
        return best
    else:
        best = 100
        for i in range(9):
            if b[i] == " ":
                b[i] = "X"
                score = minimax(b, True)
                b[i] = " "
                best = min(best, score)
        return best

def best_move():
    best_score = -100
    move = -1
    for i in range(9):
        if board[i] == " ":
            board[i] = "O"
            score = minimax(board, False)
            board[i] = " "
            if score > best_score:
                best_score = score
                move = i
    return move

for turn in range(9):
    print_board()
    if turn % 2 == 0:
        pos = int(input("Enter position (0-8): "))
        board[pos] = "X"
        if check_win(board, "X"):
            print_board()
            print("Player X wins!")
            break
    else:
        pos = best_move()
        board[pos] = "O"
        print("AI plays:", pos)
        if check_win(board, "O"):
            print_board()
            print("AI O wins!")
            break
    if " " not in board:
        print_board()
        print("It's a draw!")
        break
