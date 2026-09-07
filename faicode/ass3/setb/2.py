def is_safe(board, row, col, n):
    for i in range(row):
        if board[i] == col or abs(board[i] - col) == abs(i - row):
            return False
    return True

def solve_nqueens(board, row, n):
    if row == n:
        for r in range(n):
            line = ""
            for c in range(n):
                if board[r] == c:
                    line += "Q "
                else:
                    line += ". "
            print(line)
        print()
        return True

    for col in range(n):
        if is_safe(board, row, col, n):
            board[row] = col
            if solve_nqueens(board, row + 1, n):
                return True
    return False

n = int(input("Enter number of queens: "))
board = [-1] * n
if not solve_nqueens(board, 0, n):
    print("No solution exists")
