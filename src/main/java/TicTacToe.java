import java.util.Scanner;

public class TicTacToe {
    static char[] board = new char[10];
    static Scanner sc = new Scanner(System.in);
    static char playerLetter ;
    static char computerLetter;
    static void createBoard(char[] board){
        for(int i =0;i<10;i++){
            board[i] =' ';
        }
    }
    static void getLetter(){
        System.out.println("Pick Any Letter From(X or O)");
        playerLetter = sc.next().toUpperCase().charAt(0);
     computerLetter = (playerLetter=='X')?'0':'X';
        System.out.println("Your Letter is :"+playerLetter);
        System.out.println("Your Letter is :"+computerLetter);
    }
    static void showBoard(){
        System.out.println(" "+ board[1]+"__|"+board[2]+"___|__"+board[3]);
        System.out.println(" "+ board[4]+"__|"+board[5]+"___|__"+board[6]);
        System.out.println(" "+ board[7]+"  |"+board[8]+"   |"+board[9]);
    }
    public static void main(String[] args) {
        System.out.println("Welcome To Tic Tac Toe Game");
        createBoard(board);
        getLetter();
        showBoard();
    }
}
