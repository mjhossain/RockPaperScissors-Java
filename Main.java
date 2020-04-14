package RockPaperScissors;
import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Player();
        boolean gamePoint = false;


        String name1, name2;
        System.out.println(
                "\n\n\n" +
                        "\t\t\tRock Paper Scissors\n\n"
        );

        System.out.print("Enter Player 1: ");
        name1 = input.nextLine();
        player1.setPlayer(name1);

        System.out.print("Enter Player 2: ");
        name2 = input.nextLine();
        player2.setPlayer(name2);

        System.out.println("\n\n****\tGame Started\t****\n\n");
        //testGame(player1, player2);

        while(gamePoint == false) {
            int move1, move2;
            String move1Name, move2Name;
            move1 = player1.makeMove();
            move2 = player2.makeMove();


            if(move1 == 1 && move2 == 1) {
                System.out.println("Duel Draw: " +
                            player1.name + "'s move: " + player1.moveName +
                            "\t" + player2.name + "'s move: " + player2.moveName
                        );

            } else if (move1 == 1 && move2 == 2) {
                System.out.println( player2.name + " Won: " +
                        player1.name + "'s move: " + player1.moveName +
                        "\t" + player2.name + "'s move: " + player2.moveName
                );
                player2.duelWon();
            } else if (move1 == 1 && move2 == 3) {
                System.out.println( player1.name + " Won: " +
                        player1.name + "'s move: " + player1.moveName +
                        "\t" + player2.name + "'s move: " + player2.moveName
                );
                player1.duelWon();
            } else if (move1 == 2 && move2 == 1) {
                System.out.println( player1.name + " Won: " +
                        player1.name + "'s move: " + player1.moveName +
                        "\t" + player2.name + "'s move: " + player2.moveName
                );
                player1.duelWon();
            } else if (move1 == 2 && move2 == 2) {
                System.out.println("Duel Draw: " +
                        player1.name + "'s move: " + player1.moveName +
                        "\t" + player2.name + "'s move: " + player2.moveName
                );
            } else if (move1 == 2 && move2 == 3) {
                System.out.println( player2.name + " Won: " +
                        player1.name + "'s move: " + player1.moveName +
                        "\t" + player2.name + "'s move: " + player2.moveName
                );
                player2.duelWon();
            } else if (move1 == 3 && move2 == 1) {
                System.out.println( player2.name + " Won: " +
                        player1.name + "'s move: " + player1.moveName +
                        "\t" + player2.name + "'s move: " + player2.moveName
                );
                player2.duelWon();
            } else if (move1 == 3 && move2 == 2) {
                System.out.println( player1.name + " Won: " +
                        player1.name + "'s move: " + player1.moveName +
                        "\t" + player2.name + "'s move: " + player2.moveName
                );
                player1.duelWon();
            } else if (move1 == 3 && move2 == 3) {
                System.out.println("Duel Draw: " +
                        player1.name + "'s move: " + player1.moveName +
                        "\t" + player2.name + "'s move: " + player2.moveName
                );
                System.out.println("Duel Draw");
            }

            if(player1.score == 2) {

                gameCheck(player1);

            } else if (player2.score == 2) {
                gameCheck(player2);

            }

        }
    }

    public static void testGame(Player p1, Player p2) {
        p1.getName();
        p2.getName();
    }

    public static void gameCheck(Player p) {

        System.out.printf("Congratulations! " + p.name + " You have won the game!");

        System.exit(0);
    }

}

// Things TODO

// 1. Make Winning Statement more clear
// 2. Show Player Points after every duel
// 3. Handle Wrong Inputs