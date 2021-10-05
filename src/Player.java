public class Player {
    private String name;
    private int score;
    private boolean loser;

    public Player(String name,int score,boolean loser ){
        int length=name.length();
        if(length<8) {
        this.name = name;
        }
        this.score=score;
        this.loser=loser;
    }

    public void scoreIncrease(int score){
        this.score+=score;
    }

    public void scoreDecrease(int score){
        this.score-=score;
    }
    public int scoreGet(){
        return this.score;
    }
    public String nameGet(){
        return this.name;
    }

    public void scoreDisplay(){
        int pscore=this.score;
        System.out.println(this.name+" score's is: "+pscore);
    }
    public String toString(){
        return this.name+""+this.score;
    }
    public boolean loser(){
    if(score<0){
        return true;
    }
    else return false;
    }
}
