/** Rock Paper Scissors! written in java to play around with OOP
    basically just reused my logic from my python version **/

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static int game_logic(int player_one_choice, int player_two_choice) {
        int player_next_index;

        if (player_one_choice == player_two_choice) {
            return 0;
        }
        player_next_index = (player_one_choice + 1) % 3;
        if (player_next_index == player_two_choice) {
            return 2;
        }
        else {
            return 1;
        }
    }

    public static String make_choice(){
        Scanner scnr = new Scanner(System.in);
        String choice;

        System.out.println("rock, paper, or scissors! Make your choice:");
        choice = scnr.next();

        return choice;
    }

    public static int the_game() {
        Random rand = new Random();
        String player_one = "";
        String player_two = "";
        int winner = 0;
        List<String> choices_list = Arrays.asList("rock", "paper", "scissors");
        String random_choice = choices_list.get(rand.nextInt(choices_list.size()));

        player_one = make_choice();
        player_two = random_choice;
        winner = game_logic(choices_list.indexOf(player_one), choices_list.indexOf(player_two));

        System.out.println("You picked " + player_one + " and the computer picked " + player_two);
        if (winner == 0) {
            System.out.println("The game is a tie!");
        }
        else if (winner == 1) {
            System.out.println("You win!");
        }
        else {
            System.out.println("The computer wins!");
        }
        return winner;
    }

    public static void main(String[] args) {
        int player = 0;
        int computer = 0;
        int winner = 0;

        System.out.println("Lets play a game!");
        System.out.println("Best two out of three");

        for (int i = 0; i < 3; i++) {
            winner = the_game();
            if (winner == 1) {
                player++;
            }
            else if (winner == 2) {
                computer++;
            }
            if ((player == 2) || (computer == 2)) {
                break;
            }
        }
        System.out.println("Player: " + player);
        System.out.println("Computer: " + computer);
        if (player > computer) {
            System.out.println("You win the game!");
        }
        else if (computer > player) {
            System.out.println("The computer won!");
        }
        else {
            System.out.println("My programming does not allow for a tiebreaker");
        }
    }
}