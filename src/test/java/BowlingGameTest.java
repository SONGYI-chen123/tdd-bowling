import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BowlingGameTest {
    @Test
    public void should_return_0_when_No_knockout() {
        BowlingGame bowlingGame = new BowlingGame();

        String knockout_num = "0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0";
        String result = bowlingGame.scoring_rules(knockout_num);
        assertEquals("0", result);
    }

    @Test
    public void should_return_300_when_all_strike() {
        BowlingGame bowlingGame = new BowlingGame();

        String knockout_num = "X,X,X,X,X,X,X,X,X,X,10,10";
        String result = bowlingGame.scoring_rules(knockout_num);
        assertEquals("300", result);
    }

    @Test
    public void should_return_score_num_when_not_all_strike_nor_no_knockout() {
        BowlingGame bowlingGame = new BowlingGame();

        String knockout_num = "3,2,5,/,9,/,1,6,X,0,5,6,2,3,4,5,3,7,/,4";
        String result = bowlingGame.scoring_rules(knockout_num);
        assertEquals("99", result);
    }

    @Test
    public void should_return_score_num_when_no_strike(){
        BowlingGame bowlingGame = new BowlingGame();

        String knockout_num = "0,9,0,9,0,9,0,9,0,9,0,9,0,9,0,9,0,9,0,9";
        String result = bowlingGame.scoring_rules(knockout_num);
        assertEquals("90", result);
    }

    @Test
    public void should_return_score_num_when_ten_time_no_spare(){
        BowlingGame bowlingGame = new BowlingGame();

        String knockout_num = "1,4,2,7,3,/,4,4,5,3,5,2,6,3,6,2,7,0,9,0";
        String result = bowlingGame.scoring_rules(knockout_num);
        assertEquals("84", result);
    }

    @Test
    public void should_return_score_num_when_ten_time_strike(){
        BowlingGame bowlingGame = new BowlingGame();

        String knockout_num = "1,4,2,7,3,/,4,4,5,3,5,2,6,3,6,2,7,0,X,5,4";
        String result = bowlingGame.scoring_rules(knockout_num);
        assertEquals("94", result);
    }

    @Test
    public void should_return_score_num_when_ten_time_spare(){
        BowlingGame bowlingGame = new BowlingGame();

        String knockout_num = "1,4,2,7,3,/,4,4,5,3,5,2,6,3,6,2,7,0,8,/,4";
        String result = bowlingGame.scoring_rules(knockout_num);
        assertEquals("89", result);
    }

    @Test
    public void should_throw_exception_when_given_number_is_negative(){
        BowlingGame bowlingGame = new BowlingGame();

        String knockout_num = "1,4,2,7,3,/,4,-1,5,3,5,2,6,3,6,2,7,0,8,/,4";

        assertThrows(IllegalArgumentException.class,() -> bowlingGame.scoring_rules(knockout_num));
    }

    @Test
    public void should_throw_exception_when_given_number_is_over_10(){
        BowlingGame bowlingGame = new BowlingGame();

        String knockout_num = "1,4,2,7,3,/,4,2,11,3,5,2,6,3,6,2,7,0,8,/,4";

        assertThrows(IllegalArgumentException.class,() -> bowlingGame.scoring_rules(knockout_num));
    }

    @Test
    public void should_throw_exception_when_given_array_length_less_than_11(){
        BowlingGame bowlingGame = new BowlingGame();

        String knockout_num = "1,4,2,7,3,/,4,2";

        assertThrows(IllegalArgumentException.class,() -> bowlingGame.scoring_rules(knockout_num));
    }

    

}
