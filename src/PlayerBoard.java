import java.util.Scanner;
import java.util.Arrays;
public class PlayerBoard {
    private int number_of_players;
    public Player[] players ;

    public PlayerBoard(int number_of_players) {
        if (number_of_players > 4) {
            System.out.println("Number of players exceeds the playable number!");
        } else {
            this.number_of_players = number_of_players;
        }
        players=new Player[number_of_players];
    }

    public void playersInit() {
        Scanner sc=new Scanner(System.in);
        String ustring;
            for(int i = 0; i < this.number_of_players; ++i) {
            System.out.println("Introduce your name: ");
            ustring=sc.next();
            this.players[i]=new Player(ustring,50,false);
        }
    }

    public void multiplePlayersGame(int type){
        playersInit();
        Trivia trivia=new Trivia(10,5);
        TrueFalse shadow=new TrueFalse(10,5);
        TriviaGames starter=new TriviaGames(type,this.number_of_players);
        String display;
        for(int i=0;i<this.number_of_players;++i){
            display=this.players[i].nameGet();
            System.out.println("\nIts "+display+"'s turn!");
            starter.repeatCheckerInit();
            starter.gameTypeStarter(this.players[i],trivia,shadow);
        }
        System.out.println("The final score is: ");
        for(int i=0;i<this.number_of_players;++i){
            display=this.players[i].toString();
            System.out.println(display);
        }
        Arrays.sort(players,0,number_of_players);

        System.out.println("\nThe final player score board is: ");
        for(int i=0;i<this.number_of_players;++i){
            display=this.players[i].toString();
            System.out.println(display);
        }
    }


}