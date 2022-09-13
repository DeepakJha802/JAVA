import java.util.Scanner;

public class N_Queens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] board = new int[n][n];
        Place_n_queens(board, 0, n);
    }

    static void Place_n_queens(int[][] board, int row_no, int n) {
        if (row_no == n) {
            for (int i = 0; i < n; ++i) {
                for (int j = 0; j < n; ++j) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        for (int j = 0; j < n; ++j) {
            if (Board_is_safe(board, row_no, j)) {
                board[row_no][j] = 1;
                Place_n_queens(board, row_no + 1, n);
                board[row_no][j] = 0;
            }
        }
    }

    static boolean Board_is_safe(int[][] board, int row_no, int col) {
        int n = board.length;
        for (int i = row_no - 1, j = col - 1; i >= 0 && j >= 0; --i, --j) {
            if (board[i][j] == 1) {
                return false;
            }
        }
        for (int i = row_no + 1, j = col + 1; i < n && j < n; ++i, ++j) {
            if (board[i][j] == 1) {
                return false;
            }
        }
        for (int i = row_no - 1, j = col + 1; i >= 0 && j < n; --i, ++j) {
            if (board[i][j] == 1) {
                return false;
            }
        }
        for (int i = row_no + 1, j = col - 1; i < n && j >= 0; ++i, --j) {
            if (board[i][j] == 1) {
                return false;
            }
        }
        for (int i = row_no - 1; i >= 0; --i) {
            if (board[i][col] == 1) {
                return false;
            }
        }
        for (int i = row_no + 1; i < n; ++i) {
            if (board[i][col] == 1) {
                return false;
            }
        }
        return true;
    }
}

// In this code we have to place n - queen in chess board at that way so no
// queen clash each other.
// And print the all posibile chess board.
