import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BowlingGameTest {
    public void should_return_0_when_No_knockout(){
        BowlingGame bowlingGame = new BowlingGame();

        String knockout_num = "0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0";
        String result = bowlingGame.scoring_rules(knockout_num);
        assertEquals("0",result);
    }
}
