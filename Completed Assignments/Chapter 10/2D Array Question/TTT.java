import java.util.Scanner;

public class TTT {

    Scanner input = new Scanner(System.in);
    char[][] board = new char[3][3];
    char placeMark;
    char playerMark = 'X';
    int count = 0;

    public void ticTacToe() {
        initializeBoard();
    }

    public char getCurrentPlayerMark() {
        return playerMark;
    }

    public void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    public void displayBoard() {
        System.out.println("--------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("--------------");
        }
    }

    public void checkTurn() {
        if (count % 2 == 0) {
            playerMark = 'X';
        } else {
            playerMark = 'O';
        }
    }

    public void placeMark() {
        System.out.println("Please enter a placement (1-9): ");
        int place = input.nextInt();
        int x = place / 3;
        x = (int) Math.floor(x);
        int y = (place + 2) / 3;
        y = (int) Math.floor(y);
        x = place - 3 * y + 3;
        if (board[y - 1][x - 1] == '-') {
            board[y - 1][x - 1] = playerMark;
            count++;
            checkTurn();
            displayBoard();
        } else {
            System.out.println("Please choose a different place!");
        }
    }

    public boolean boardFull() {
        boolean full = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    full = false;
                }
            }
        }
        return full;
    }

    public boolean verctical() {
        boolean verti = false;
        if (board[0][0] == board[0][1] && board[0][1] == board[0][2]
                && board[0][0] != '-') {
            verti = true;
        }
        if (board[1][0] == board[1][1] && board[1][1] == board[1][2]
                && board[1][0] != '-') {
            verti = true;
        }
        if (board[2][0] == board[2][1] && board[2][1] == board[2][2]
                && board[2][0] != '-') {
            verti = true;
        }
        return verti;
    }

    public boolean horizontal() {
        boolean hori = false;
        if (board[0][0] == board[1][0] && board[1][0] == board[2][0]
                && board[0][0] != '-') {
            hori = true;
        }
        if (board[0][1] == board[1][1] && board[1][1] == board[2][1]
                && board[0][1] != '-') {
            hori = true;
        }
        if (board[0][2] == board[1][2] && board[2][1] == board[2][2]
                && board[0][2] != '-') {
            hori = true;
        }
        return hori;
    }

    public boolean diagonal() {
        boolean diag = false;
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2]
                && board[0][0] != '-') {
            diag = true;
        }
        if (board[0][2] == board[1][1] && board[1][1] == board[2][0]
                && board[0][2] != '-') {
            diag = true;
        }
        return diag;
    }
}
