package RockPaperScissors;
import java.util.Random;
import java.util.Scanner;

public class Player {
    String name, moveName;
    int score;
    static Scanner input = new Scanner(System.in);
    static Random rand = new Random();
    boolean isCpu;

    Player(boolean cpu) {
        this.isCpu = cpu;
    }

    public void setPlayer(String name) {
        this.name = name;
    }

    public void getName() {
        System.out.println(this.name);
    }

    public int makeMove() {
        int move;

        if (!this.isCpu) {

            System.out.print(this.name + "'s move: ");
            move = input.nextInt();
            /*
            while(move < 1 || move > 3) {
                System.out.print("Invalid input enter again: ");
                move = input.nextInt();
            }
             */
        } else {
            move = rand.nextInt(4);
        }


        switch (move) {
            case 1:
                this.moveName = "Rock";
                break;
            case 2:
                this.moveName = "Paper";
                break;
            case 3:
                this.moveName = "Scissors";
                break;
        }

        return move;
    }

    public void duelWon() {
        this.score += 1;
    }


}
