// На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга.

public class task4 {
    static int N = 8;
    static int numberQueens = N;
    static int chessBoard [][] = new int [N][N];
    public static void main(String[] args) {
        SetQueen();
        ShowChessboard(); // показать доску

    }

    // показать доску
    public static void ShowChessboard() {
        for (int i = 0; i < N; ++i)
            {
                for (int j = 0; j < N; ++j)
                {
                    System.out.print((chessBoard[i][j]==1) ? "* " : ". ");
                }
                System.out.print('\n');
            }
    }
    // установить ферзя
    public static void SetQueen() {
       int a = 0;
        for (int j = 0; j < N; j++) {
                if (CheckQueen(a, j)){
                    chessBoard[a][j] = 1;
                    a++;
                }
        }
    }
    // проверить ферзя
    public static boolean CheckQueen(int row, int column) {
        for (int i = 0; i < row; ++i)
            if (chessBoard[i][column]==1)
                return false;
 
        for (int i = 1; i <= row && column - i >= 0; ++i)
            if (chessBoard[row - i][column - i]==1)
                return false;
 
        for (int i = 1; i <= row && column + i < N; i++)
            if (chessBoard[row - i][column + i]==1)
                return false;
 
        return true;
    }
}
