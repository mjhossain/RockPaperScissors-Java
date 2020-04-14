/*
Dev Name: Mohammed
Dev GHub: @mjhossain (github)
Dev Email: mjhossainnyc@gmail.com
Description: Classic Rock-Paper-Scissors Game
 */

// FIXME :
//  1. Make Winning Statement more clear
//  2. Show Player Points after every duel
//  3. Handle Wrong Inputs
//  4. Give Option to Restart Game or Start New Game
//  5. Player vs CPU

package RockPaperScissors;
import java.util.Random;
import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);
    static Random rand = new Random();

    public static void main(String[] args) {
        Player player1 = new Player(false);
        Player cpuPlayer = new Player(true);
        boolean gamePoint = false;


        String name1, name2;
        System.out.println("\t\t\tRock Paper Scissors\n\n");

        System.out.print("Enter Player Name: ");
        name1 = input.nextLine();

        player1.setPlayer(name1);
        cpuPlayer.setPlayer("CPU");


        System.out.println("\n****\tGame Started\t****\n\n");
        //testGame(player1, cpuPlayer);
        //System.out.println("\n\nPlayer: " + pPoint + "\t\tCPU: " + cPoint);
        System.out.println("\n1 - Rock\t2 - Paper\t3 - Scissors\t");



        while(gamePoint == false) {
            System.out.println("\n\nPlayer: " + player1.score + "\t\tCPU: " + cpuPlayer.score +"\n");

            int move1, move2;
            String move1Name, move2Name;
            move1 = player1.makeMove();
            move2 = cpuPlayer.makeMove();


            if(move1 == 1 && move2 == 1) {
                System.out.println("Duel Draw: \t\t" +
                            player1.name + "'s move: " + player1.moveName +
                            "\t" + cpuPlayer.name + "'s move: " + cpuPlayer.moveName
                        );

            } else if (move1 == 1 && move2 == 2) {
                System.out.println( cpuPlayer.name + " Won: \t\t" +
                        player1.name + "'s move: " + player1.moveName +
                        "\t" + cpuPlayer.name + "'s move: " + cpuPlayer.moveName
                );
                cpuPlayer.duelWon();
            } else if (move1 == 1 && move2 == 3) {
                System.out.println( player1.name + " Won: \t\t" +
                        player1.name + "'s move: " + player1.moveName +
                        "\t" + cpuPlayer.name + "'s move: " + cpuPlayer.moveName
                );
                player1.duelWon();
            } else if (move1 == 2 && move2 == 1) {
                System.out.println( player1.name + " Won: \t\t" +
                        player1.name + "'s move: " + player1.moveName +
                        "\t" + cpuPlayer.name + "'s move: " + cpuPlayer.moveName
                );
                player1.duelWon();
            } else if (move1 == 2 && move2 == 2) {
                System.out.println("Duel Draw: \t\t" +
                        player1.name + "'s move: " + player1.moveName +
                        "\t" + cpuPlayer.name + "'s move: " + cpuPlayer.moveName
                );
            } else if (move1 == 2 && move2 == 3) {
                System.out.println( cpuPlayer.name + " Won: \t\t" +
                        player1.name + "'s move: " + player1.moveName +
                        "\t" + cpuPlayer.name + "'s move: " + cpuPlayer.moveName
                );
                cpuPlayer.duelWon();
            } else if (move1 == 3 && move2 == 1) {
                System.out.println( cpuPlayer.name + " Won: \t\t" +
                        player1.name + "'s move: " + player1.moveName +
                        "\t" + cpuPlayer.name + "'s move: " + cpuPlayer.moveName
                );
                cpuPlayer.duelWon();
            } else if (move1 == 3 && move2 == 2) {
                System.out.println( player1.name + " Won: \t\t" +
                        player1.name + "'s move: " + player1.moveName +
                        "\t" + cpuPlayer.name + "'s move: " + cpuPlayer.moveName
                );
                player1.duelWon();
            } else if (move1 == 3 && move2 == 3) {
                System.out.println("Duel Draw: \t\t" +
                        player1.name + "'s move: " + player1.moveName +
                        "\t" + cpuPlayer.name + "'s move: " + cpuPlayer.moveName
                );
                System.out.println("Duel Draw");
            }

            if(player1.score == 3) {
                System.out.println("Congratulations! You Won!");
                System.out.println("\n\nPlayer: " + player1.score + "\t\tCPU: " + cpuPlayer.score +"\n");
            } else if (cpuPlayer.score == 3) {
                System.out.println("Awwh! You Lost :(");
                System.out.println("\n\nPlayer: " + player1.score + "\t\tCPU: " + cpuPlayer.score +"\n");
            }

        }
    }



    public static void testGame(Player p1, Player p2) {
        p1.getName();
        p2.getName();
    }

    public static void gameCheck(Player p) {

        System.out.println("Congratulations! " + p.name + " You have won the game!");

        System.exit(0);
    }

}


