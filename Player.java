package RockPaperScissors;
import java.util.Scanner;

public class Player {
    String name, moveName;
    int score;
    static Scanner input = new Scanner(System.in);


    public void setPlayer(String name) {
        this.name = name;
    }

    public void getName() {
        System.out.println(this.name);
    }

    public int makeMove() {
        int move = 0;

        System.out.println("\n\n1 - Rock\n2 - Paper\n3 - Scissors\n");
        System.out.print(this.name + "'s move: ");
        move = input.nextInt();

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
