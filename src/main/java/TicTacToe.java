public class TicTacToe {
    static char [] board = new char[10];
    public static void createBoard(char[] board){
        for(int i = 0; i<10;i++){
            board[i] = ' ';
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome To Tic Tac Toe Game");
    }
}
