public class BowlingGame {
public int scoring_rules(String knockout_num ){

    int score_num =0;

    String[] knockoutArr = knockout_num.split(",");
    for(int i=0 ;i<19;){
        int single_num =0;
        if(knockoutArr[i].equals("X")){
            single_num = isstrike(knockoutArr[i])+isstrike(knockoutArr[i+1])+isstrike(knockoutArr[i+2]);
           score_num +=single_num;
           i++;
        }
        else if(knockoutArr[i+1].equals("/")){
            single_num = isstrike(knockoutArr[i+1])+isstrike(knockoutArr[i+2]);
            score_num +=single_num;
            i=i+2;
        }else{
            single_num = isstrike(knockoutArr[i+1])+isstrike(knockoutArr[i+2]);
            score_num +=single_num;
            i=i+2;
        }
    }

    return score_num;
}

public int isstrike(String single_num){
    if(single_num.equals("X")){
        return 10;
    }else if(single_num.equals("/")){
        return 10;
    }else{
        return Integer.parseInt(single_num);
    }
}
}
