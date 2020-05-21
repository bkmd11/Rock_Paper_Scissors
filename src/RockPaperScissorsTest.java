import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class RockPaperScissorsTest {
    @Test
    void test_game_logic_tie_rock() {
        final int expected = 0;
        final int actual = RockPaperScissors.game_logic(0, 0);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    void test_game_logic_tie_paper() {
        final int expected = 0;
        final int actual = RockPaperScissors.game_logic(1, 1);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    void test_game_logic_tie_scissors() {
        final int expected = 0;
        final int actual = RockPaperScissors.game_logic(2,2);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    void test_game_logic_rock_beats_scissors() {
        final int expected = 1;
        final int actual = RockPaperScissors.game_logic(0, 2);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    void test_game_logic_paper_beats_rock() {
        final int expected = 1;
        final int actual = RockPaperScissors.game_logic(1, 0);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    void test_game_logic_scissors_beats_paper() {
        final int expected = 1;
        final int actual = RockPaperScissors.game_logic(2, 1);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    void test_game_logic_computer_wins_with_rock_over_scissors() {
        final int expected = 2;
        final int actual = RockPaperScissors.game_logic(2, 0);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    void test_game_logic_computer_wins_paper_over_rock() {
        final int expected = 2;
        final int actual = RockPaperScissors.game_logic(0, 1);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    void test_game_logic_computer_wins_scissors_over_paper() {
        final int expected = 2;
        final int actual = RockPaperScissors.game_logic(1, 2);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    void test_fail() {
        Assertions.assertTrue(false);
    }
}