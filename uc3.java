import java.util.Scanner;

public class uc3 {
	static char[][] gameBoard = {
		      {'_','|','_','|','_'},
		      {'_','|','_','|','_'},
		      {' ','|',' ','|',' '}
		    };
    public static void main(String[] args) {
        char player1letter=' ';
        char player2letter=' ';

        System.out.println("Welcome to Tic Tac Toe Game");
        player1letter=chooseLetter();
        player2letter=(player1letter == 'O') ? 'X': 'O';

        System.out.println("player1letter = "+player1letter);
        System.out.println("player2letter = "+player2letter);

        showBoard();
    }

    static char chooseLetter(){
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("choose letter : O or X");
			return scanner.next().charAt(0);
		}
    }
    static void showBoard(){
        System.out.println("showing board :");
        for (int row = 0; row < gameBoard.length; row++) {
        	  for (int c = 0; c < gameBoard[0].length; c++) {
        	    System.out.print(gameBoard[row][c]);
        	  }
        	  System.out.println();
        	}
        
    }
}
	