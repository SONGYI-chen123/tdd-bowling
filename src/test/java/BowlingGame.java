public class BowlingGame {
public int scoring_rules(String knockout_num ){

    int score_num =0;

    String[] knockoutArr = knockout_num.split(",");
    for(int i=0 ;i<knockoutArr.length-2;){
        int single_num =0;
        if(knockoutArr[i].equals("X")){
            single_num = isstrike(knockoutArr[i])+isstrike(knockoutArr[i+1])+isstrike(knockoutArr[i+2]);
           score_num +=single_num;
           i++;
        }

    }

    return score_num;
}

public int isstrike(String single_num){
    if(single_num.equals("X")){
        return 10;
    }else if(!(single_num.equals("X") || single_num.equals("/"))){
        return Integer.parseInt(single_num);
    }
    return 0;
}
}
