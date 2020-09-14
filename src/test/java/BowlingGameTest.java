import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BowlingGameTest {
    public void should_return_0_when_No_knockout(){
        BowlingGame bowlingGame = new BowlingGame();

        String knockout_num = "0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0";
        int result = bowlingGame.scoring_rules(knockout_num);
        assertEquals(0,result);
    }

    public void should_return_330_when_all_strike(){
        BowlingGame bowlingGame = new BowlingGame();

        String knockout_num = "X，X，X，X，X，X，X，X，X，X,10,10";
        int result = bowlingGame.scoring_rules(knockout_num);
        assertEquals(300,result);
    }
}
