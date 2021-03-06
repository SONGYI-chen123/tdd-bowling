import java.lang.IllegalArgumentException;
import java.lang.String;

public class BowlingGame {
    public String scoring_rules(String knockout_num) {

        int score = 0;
        String[] knockoutArr = knockout_num.split(",");
        if (knockoutArr.length < 11 || knockoutArr.length > 21) {
            throw new IllegalArgumentException("parameter error");
        }
        for (int j = 0; j < knockoutArr.length; j++) {
            if (Integer.parseInt(knockoutArr[j]) < 0 || Integer.parseInt(knockoutArr[j]) > 10) {
                throw new IllegalArgumentException("parameter error");
            }
        }
        int thrownum = 19;
        for (int i = 0; i < thrownum; ) {
            int single_num = 0;

            if (knockoutArr[i].equals("X")) {
                single_num = processInput(knockoutArr[i]) +processInput(knockoutArr[i + 1]) + processInput(knockoutArr[i + 2]);
                score += single_num;
                thrownum = thrownum - 1;
                i++;
            } else if (knockoutArr[i + 1].equals("/")) {
                single_num = processInput(knockoutArr[i + 1]) + processInput(knockoutArr[i + 2]);
                score += single_num;
                i = i + 2;
            } else {
                single_num = processInput(knockoutArr[i]) + processInput(knockoutArr[i + 1]);
                if (single_num > 10) {
                    throw new IllegalArgumentException("parameter error");
                }
                score += single_num;
                i = i + 2;
            }
        }


        String scoreString = String.valueOf(score);
        return scoreString;
    }

    public int processInput(String single_num) {
        if (single_num.equals("X")) {
            return 10;
        } else if (single_num.equals("/")) {
            return 10;
        } else {
            return Integer.parseInt(single_num);
        }
    }
}
