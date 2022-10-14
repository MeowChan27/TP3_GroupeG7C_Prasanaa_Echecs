import java.util.Scanner;

public class Chess {
    private Cell [][] board;
    private Player[][] players;
    private Player currentPlayer;

    public void play(){

    }

    private void createPlayers(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nom du player 1 : ");
        String name1 = scanner.nextLine();
        System.out.println("Color du player 1 : ");
        int color1 = scanner.nextInt();
        Player player1 = new Player(name1,color1);
        // -------------------------------------------
        System.out.println("Nom du player 1 : ");
        String name2 = scanner.nextLine();
        System.out.println("Color du player 1 : ");
        int color2 = scanner.nextInt();
        Player player2 = new Player(name2,color2);
    }

    private void initialiseBoard(){
        //
    }

    private void printBoard(){
        //
    }
    private String askMove(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir la piece a deplacer : ");
        String pieceADeplacer = scanner.nextLine();
        System.out.println("Saisir l'emplacement suite au coup : ");
        String emplacementSuiteAuCoup = scanner.nextLine();
        return pieceADeplacer + emplacementSuiteAuCoup;
    }

    private boolean isCheckMate(){
        //
    }

    private boolean isValidMove(String move){
        char piece = Chess.askmove().charAt(0);
        if (piece == 'K'){

        }
    }
}




