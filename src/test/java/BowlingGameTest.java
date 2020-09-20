import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BowlingGameTest {
    @Test
    public void should_return_0_when_No_knockout() {
        BowlingGame bowlingGame = new BowlingGame();

        String knockout_num = "0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0";
        int result = bowlingGame.scoring_rules(knockout_num);
        assertEquals(0, result);
    }

    @Test
    public void should_return_300_when_all_strike() {
        BowlingGame bowlingGame = new BowlingGame();

        String knockout_num = "X,X,X,X,X,X,X,X,X,X,10,10";
        int result = bowlingGame.scoring_rules(knockout_num);
        assertEquals(300, result);
    }

    @Test
    public void should_return_score_num_when_not_all_strike_nor_no_knockout() {
        BowlingGame bowlingGame = new BowlingGame();

        String knockout_num = "3,2,5,/,9,/,1,6,X,0,5,6,2,3,4,5,3,7,/,4";
        int result = bowlingGame.scoring_rules(knockout_num);
        assertEquals(99, result);
    }

    @Test
    public void should_return_score_num_when_no_strike(){
        BowlingGame bowlingGame = new BowlingGame();

        String knockout_num = "0,9,0,9,0,9,0,9,0,9,0,9,0,9,0,9,0,9,0,9";
        int result = bowlingGame.scoring_rules(knockout_num);
        assertEquals(90, result);
    }

    

}
