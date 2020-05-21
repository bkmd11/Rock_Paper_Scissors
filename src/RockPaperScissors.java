/** Rock Paper Scissors! written in java to play around with OOP
    basically just reused my logic from my python version **/

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    // The option list for the game. Global so it doesn't need to be passed as an arg
    public static List<String> choices_list = Arrays.asList("rock", "paper", "scissors");

    public static int game_logic(int player_one_choice, int player_two_choice) {
        // The game logic to determine which player wins
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
        // Where the player makes their choice
        Scanner scnr = new Scanner(System.in);
        String choice;

        System.out.println("rock, paper, or scissors! Make your choice:");
        choice = scnr.next();

        return choice;
    }

    public static int get_index(String choice) {
        // Gets the index from the option list to compare who wins
        int choice_index = -1;

        choice_index = choices_list.indexOf(choice);

        return choice_index;
    }

    public static String who_won_overall(int player_one, int player_two) {
        // Determines who won the 2 out of 3
        if (player_one > player_two) {
            return "You win the game!";
        }
        else if (player_one < player_two) {
            return "The computer won!";
        }
        else {
            return "My programming does not allow for a tiebreaker";
        }}

    public static int the_game() {
        Random rand = new Random();
        String player_one = "";
        String player_two = "";
        int player_choice_index = -1;
        int computer_choice_index = -1;
        int winner = -1;

        String random_choice = choices_list.get(rand.nextInt(choices_list.size()));

        player_one = make_choice();
        player_choice_index = get_index(player_one);

        if (player_choice_index == -1) {
            return winner;
        }
        player_two = random_choice;
        computer_choice_index = get_index(player_two);

        winner = game_logic(player_choice_index, computer_choice_index);

        System.out.println("You picked " + player_one + " and the computer picked " + player_two);

        switch (winner) {
            case 1:
                System.out.println("You win!");
                break;
            case 2:
                System.out.println("The computer wins!");
                break;
            default:
                System.out.println("The game is a tie!");
                break;
        }
        return winner;
    }

    public static void main(String[] args) {
        int player = 0;
        int computer = 0;
        int winner = 0;

        System.out.println("Lets play a game!");
        System.out.println("Best two out of three");

        do {
            winner = the_game();
            switch (winner) {
                case -1:
                    System.out.println("You entered an invalid choice you fool!");
                    break;
                case 1:
                    player++;
                    break;
                case 2:
                    computer++;
                    break;
                default:
                    break;
            }
        } while ((player != 2) && (computer != 2));

        System.out.println("Player: " + player);
        System.out.println("Computer: " + computer);
        System.out.println(who_won_overall(player, computer));
        }
    }
