package App.MiniGames;

import App.Player.Player;

import java.util.Random;

public class TriviaGames{
    private int type;
    private int number_of_players;
    public int[][] repeatcheck=new int[3][11];

    public void repeatCheckerInit(){
        for(int i=0;i<3;++i){
            for(int j=0;j<11;++j){
                this.repeatcheck[i][j]=0;
            }
        }
    }
    public TriviaGames(int type,int number_of_players){
    this.type=type;
    this.number_of_players=number_of_players;
    repeatCheckerInit();
    }
    public int typeget(int type){
        type=this.type;
        return type;
 }

    public void triviaInit(Trivia trivia){
        trivia=new Trivia(10,5);
    }
    public void trueFalseInit (TrueFalse truefalse){
        truefalse=new TrueFalse(10,5);
    }
    //starts the trivia game:
    public void triviaStarter(Player player1, Trivia trivia){
        Random q_randomizer=new Random();
        Random c_randomizer=new Random();

        int rand_value=c_randomizer.nextInt(2);
        int rand_value2= q_randomizer.nextInt(10);
        if(this.repeatcheck[rand_value][rand_value2]==1) {
            for (int i = 0; i < 2; ++i) {
                for (int j = 0; j < 10; ++j) {
                    if (this.repeatcheck[i][j] == 0) {
                        trivia.question(i, j, player1);
                        this.repeatcheck[i][j]=1;
                        break;
                    }
                }
            }
        }
        else {
            trivia.question(rand_value, rand_value2, player1);
            this.repeatcheck[rand_value][rand_value2] = 1;
        }
    }

    public void trueOrFalseStarter(Player player1, TrueFalse truefalse){

        Random q_randomizer=new Random();
        Random c_randomizer=new Random();

        int rand_value=c_randomizer.nextInt(2);
        int rand_value2= q_randomizer.nextInt(10);
        if(this.repeatcheck[rand_value][rand_value2]==1) {
            for (int i = 0; i <= 2; ++i) {
                for (int j = 0; j <= 10; ++j) {
                    if (this.repeatcheck[i][j] == 0) {
                        truefalse.trueOrFalse(i, j, player1);
                        this.repeatcheck[i][j]=1;
                        break;
                    }
                }
            }
        }
        else{
            truefalse.trueOrFalse(rand_value,rand_value2,player1);
            this.repeatcheck[rand_value][rand_value2]=1;}
    }
    public void repeater(Player player1, Trivia trivia) {
        for (int i = 0; i<5; ++i) {
            triviaStarter(player1, trivia);
        }
    }
    public void repeater2(Player player1, TrueFalse truefalse){
        for(int i=0;i<5;++i) {
            trueOrFalseStarter(player1,truefalse);
        }
    }
    //alege ce minigame va incepe
    public void gameTypeStarter(Player player1, Trivia trivia, TrueFalse truefalse){
        //triviaInit(trivia);
        //trueFalseInit(truefalse);
        switch(this.number_of_players){
            case 1:switch(this.type) {
                case 1:
                    repeater(player1,trivia);
                    break;
                case 2:
                    repeater2(player1,truefalse);
                    break;
            }
            break;
            case 2:switch(this.type) {
                case 1:
                    repeater(player1,trivia);
                    break;
                case 2:
                    repeater2(player1,truefalse);
                    break;
            }
            break;
            case 3:switch(this.type) {
                case 1:
                    repeater(player1,trivia);
                    break;
                case 2:
                    repeater2(player1,truefalse);
                    break;
            }
            break;
            case 4:switch(this.type) {
                case 1:

                    repeater(player1,trivia);
                    break;
                case 2:

                    repeater2(player1,truefalse);
                    break;
            }
            break;
        }
    }

}
