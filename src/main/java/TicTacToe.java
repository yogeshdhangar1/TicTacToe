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
    static void makeMove(int position, char currentPlayerLetter, char[] board) {

        switch (position) {
            case 1:
                if (board[1] == ' ')
                    board[1] = currentPlayerLetter;
                break;
            case 2:
                if (board[2] == ' ')
                    board[2] = currentPlayerLetter;
                break;
            case 3:
                if (board[3] == ' ')
                    board[3] = currentPlayerLetter;
                break;
            case 4:
                if (board[4] == ' ')
                    board[4] = currentPlayerLetter;
                break;
            case 5:
                if (board[5] == ' ')
                    board[5] = currentPlayerLetter;
                break;
            case 6:
                if (board[6] == ' ')
                    board[6] = currentPlayerLetter;
                break;
            case 7:
                if (board[7] == ' ')
                    board[7] = currentPlayerLetter;
                break;
            case 8:
                if (board[8] == ' ')
                    board[8] = currentPlayerLetter;
                break;
            case 9:
                if (board[9] == ' ')
                    board[9] = currentPlayerLetter;
                break;
            default:
                break;
        }
    }

    static void playerMove() {
        System.out.println("Enter the position(1-9)");
        int  position = sc.nextInt();
        while (board[position] != ' ') {
            System.out.println("Invalid option!! Please Try Again");
            position = sc.nextInt();
        }
        makeMove(position, playerLetter, board);
        System.out.println("Player moved to"+position);
        isGameOver(board,playerLetter);
    }
    static Player toss() {
        if((int)(Math.random()*10)%2==1){
            System.out.println("\nPlayer Won The Toss! Player Starts");
            return Player.PLAYER;
        }
        else{
            System.out.println("\nComputer Won The Toss! Computer Starts");
            return Player.COMPUTER;
        }
    }
    public static boolean isGameOver(char[] board, char letter) {

        boolean option1 = (board[1] == letter && board[2] == letter && board[3] == letter);
        boolean option2 = (board[4] == letter && board[5] == letter && board[6] == letter);
        boolean option3 = (board[7] == letter && board[8] == letter && board[9] == letter);
        boolean option4 = (board[1] == letter && board[4] == letter && board[7] == letter);
        boolean option5 = (board[2] == letter && board[5] == letter && board[8] == letter);
        boolean option6 = (board[3] == letter && board[6] == letter && board[9] == letter);
        boolean option7 = (board[1] == letter && board[5] == letter && board[9] == letter);
        boolean option8 = (board[3] == letter && board[5] == letter && board[7] == letter);
        if (option1 || option2 || option3 || option4 || option5 || option6 || option7 || option8) {

            System.out.println("Player wins!!!");

            return true;
        }
        if (board[1] != ' ' && board[2] != ' ' && board[3] != ' ' && board[4] != ' ' && board[5] != ' '
                && board[6] != ' ' && board[7] != ' ' && board[8] != ' ' && board[9] != ' ') {
            System.out.println("Tie!!");
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        System.out.println("Welcome To Tic Tac Toe Game");
        createBoard(board);
        getLetter();
        showBoard();
        playerMove();
        toss();
    }
}
