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
    static void makeMove(){
        int playLocation;
        System.out.println("Enter The Location Make Move 1 To 9");
        playLocation = sc.nextInt();
        if(playLocation < 10 && playLocation>0){
            board[playLocation] = playerLetter;
        }else{
            System.out.println("Invalid Choice");
        }
    }
    static void playerMove() {
        System.out.println("Enter choice 1 to 9");
        int position = sc.nextInt();
        while (board[position] != ' ') {
            System.out.println("Invalid option!! Please Try Again");
            position = sc.nextInt();
        }
        makeMove();
        System.out.println("Player Moved  :"+position);
    }
    public static void main(String[] args) {
        System.out.println("Welcome To Tic Tac Toe Game");
        createBoard(board);
        getLetter();
        showBoard();
        makeMove();
        playerMove();
    }
}
