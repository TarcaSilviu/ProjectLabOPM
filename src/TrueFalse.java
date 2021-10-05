import java.util.Scanner;
public class TrueFalse {
    private int alocated_points;
    private int deducted_points;

    public TrueFalse(int alocated_points,int deducted_points) {
        if (alocated_points < 0 || deducted_points < 0) {
            System.out.println("Error with points deduction!");
        }
        else {
            this.alocated_points = alocated_points;
            this.deducted_points = deducted_points;
        }
    }

    public void trueOrFalse(int q_randomizer,int c_randomizer,Player player){
        Scanner sc=new Scanner(System.in);
        String scan;
        String false_="false",true_="true";
        switch(q_randomizer) {
            case 0:
                switch (c_randomizer) {
                    case 0:System.out.println("True or false?\nIn 1930, Albert Einstein and a colleague received a U.S. patent for refigerator.");
                        scan=sc.next();
                        if(true_.equalsIgnoreCase(scan)){
                            player.scoreIncrease(this.alocated_points);
                            System.out.println("Plus "+this.alocated_points+" points!");
                        }
                        else{
                            player.scoreDecrease(this.deducted_points);
                            System.out.println("The answer is wrong!Minus "+this.deducted_points+" points!");
                        }
                        break;
                    case 1:System.out.println("True or false?\nThe largest molecule in the human body is the chromosone.");
                        scan=sc.next();
                        if(true_.equalsIgnoreCase(scan)){
                            player.scoreIncrease(this.alocated_points);
                            System.out.println("Plus "+this.alocated_points+" points!");
                        }
                        else{
                            player.scoreDecrease(this.deducted_points);
                            System.out.println("The answer is wrong!Minus "+this.deducted_points+" points!");
                        }
                        break;
                    case 2:System.out.println("True or false?\nIn Rutherford Appleton Laboratory was the first computer animations produced.");
                        scan=sc.next();
                        if(true_.equalsIgnoreCase(scan)){
                            player.scoreIncrease(this.alocated_points);
                            System.out.println("Plus "+this.alocated_points+" points!");
                        }
                        else{
                            player.scoreDecrease(this.deducted_points);
                            System.out.println("The answer is wrong!Minus "+this.deducted_points+" points!");
                        }
                        break;
                    case 3:System.out.println("True or false?\nThe human vocal cords are located in the tongue");
                        scan=sc.next();
                        if(false_.equalsIgnoreCase(scan)){
                            player.scoreIncrease(this.alocated_points);
                            System.out.println("Plus "+this.alocated_points+" points!");
                        }
                        else{
                            player.scoreDecrease(this.deducted_points);
                            System.out.println("The answer is wrong!Minus "+this.deducted_points+" points!");
                        }
                        break;
                    case 4:System.out.println("True or false?\nThe titanic sunk in 1914.");
                        scan=sc.next();
                        if(false_.equalsIgnoreCase(scan)){
                            player.scoreIncrease(this.alocated_points);
                            System.out.println("Plus "+this.alocated_points+" points!");
                        }
                        else{
                            player.scoreDecrease(this.deducted_points);
                            System.out.println("The answer is wrong!Minus "+this.deducted_points+" points!");
                        }
                        break;
                    case 5:System.out.println("True or false?\nThe Amazon is the largest rainforest in the world.");
                        scan=sc.next();
                        if(true_.equalsIgnoreCase(scan)){
                            player.scoreIncrease(this.alocated_points);
                            System.out.println("Plus "+this.alocated_points+" points!");
                        }
                        else{
                            player.scoreDecrease(this.deducted_points);
                            System.out.println("The answer is wrong!Minus "+this.deducted_points+" points!");
                        }
                        break;
                    case 6:System.out.println("True or false?\nThe ladybug arachnid is a reptile.");
                        scan=sc.next();
                        if(false_.equalsIgnoreCase(scan)){
                            player.scoreIncrease(this.alocated_points);
                            System.out.println("Plus "+this.alocated_points+" points!");
                        }
                        else{
                            player.scoreDecrease(this.deducted_points);
                            System.out.println("The answer is wrong!Minus "+this.deducted_points+" points!");
                        }
                        break;
                    case 7:System.out.println("True or false?\nPitagora was the one who screamed\"Evrika!\" ");
                        scan=sc.next();
                        if(false_.equalsIgnoreCase(scan)){
                            player.scoreIncrease(this.alocated_points);
                            System.out.println("Plus "+this.alocated_points+" points!");
                        }
                        else{
                            player.scoreDecrease(this.deducted_points);
                            System.out.println("The answer is wrong!Minus "+this.deducted_points+" points!");
                        }
                        break;
                    case 8:System.out.println("True or false?\nAn hexagon has 6 sides.");
                        scan=sc.next();
                        if(true_.equalsIgnoreCase(scan)){
                            player.scoreIncrease(this.alocated_points);
                            System.out.println("Plus "+this.alocated_points+" points!");
                        }
                        else{
                            player.scoreDecrease(this.deducted_points);
                            System.out.println("The answer is wrong!Minus "+this.deducted_points+" points!");
                        }
                    break;
                    case 9:System.out.println("True or false?\nThe highest mountain on the globe is mount Everest.");
                        scan=sc.next();
                        if(true_.equalsIgnoreCase(scan)){
                            player.scoreIncrease(this.alocated_points);
                            System.out.println("Plus "+this.alocated_points+" points!");
                        }
                        else{
                            player.scoreDecrease(this.deducted_points);
                            System.out.println("The answer is wrong!Minus "+this.deducted_points+" points!");
                        }
                    break;
                }
                break;
            case 1:
                switch (c_randomizer) {
                    case 0:System.out.println("True or false?\nthe Danube springs from Austria.");
                        scan=sc.next();
                        if(false_.equalsIgnoreCase(scan)){
                            player.scoreIncrease(this.alocated_points);
                            System.out.println("Plus "+this.alocated_points+" points!");
                        }
                        else{
                            player.scoreDecrease(this.deducted_points);
                            System.out.println("The answer is wrong!Minus "+this.deducted_points+" points!");
                        }break;
                    case 1:System.out.println("True or false?\nLake Lezer is a glacial lake.");
                        scan=sc.next();
                        if(true_.equalsIgnoreCase(scan)){
                            player.scoreIncrease(this.alocated_points);
                            System.out.println("Plus "+this.alocated_points+" points!");
                        }
                        else{
                            player.scoreDecrease(this.deducted_points);
                            System.out.println("The answer is wrong!Minus "+this.deducted_points+" points!");
                        }break;
                    case 2:System.out.println("True or false?\nReykjavik is the capital of Iceland.");
                        scan=sc.next();
                        if(true_.equalsIgnoreCase(scan)){
                            player.scoreIncrease(this.alocated_points);
                            System.out.println("Plus "+this.alocated_points+" points!");
                        }
                        else{
                            player.scoreDecrease(this.deducted_points);
                            System.out.println("The answer is wrong!Minus "+this.deducted_points+" points!");
                        }break;
                    case 3:System.out.println("True or false?\nAn isoscel triangle has 3 equal sides.");
                        scan=sc.next();
                        if(true_.equalsIgnoreCase(scan)){
                            player.scoreIncrease(this.alocated_points);
                            System.out.println("Plus "+this.alocated_points+" points!");
                        }
                        else{
                            player.scoreDecrease(this.deducted_points);
                            System.out.println("The answer is wrong!Minus "+this.deducted_points+" points!");
                        }break;
                    case 4:System.out.println("True or false?\nThe chemical formula of water is H3O.");
                        scan=sc.next();
                        if(false_.equalsIgnoreCase(scan)){
                            player.scoreIncrease(this.alocated_points);
                            System.out.println("Plus "+this.alocated_points+" points!");
                        }
                        else{
                            player.scoreDecrease(this.deducted_points);
                            System.out.println("The answer is wrong!Minus "+this.deducted_points+" points!");
                        }break;
                    case 5:System.out.println("True or false?\nThomas Edison is the invetor of the light bulb.");
                        scan=sc.next();
                        if(true_.equalsIgnoreCase(scan)){
                            player.scoreIncrease(this.alocated_points);
                            System.out.println("Plus "+this.alocated_points+" points!");
                        }
                        else{
                            player.scoreDecrease(this.deducted_points);
                            System.out.println("The answer is wrong!Minus "+this.deducted_points+" points!");
                        }break;
                    case 6:System.out.println("True or false?\nSpaghetto is the singular word for a piece of spaghetti.");
                        scan=sc.next();
                        if(true_.equalsIgnoreCase(scan)){
                            player.scoreIncrease(this.alocated_points);
                            System.out.println("Plus "+this.alocated_points+" points!");
                        }
                        else{
                            player.scoreDecrease(this.deducted_points);
                            System.out.println("The answer is wrong!Minus "+this.deducted_points+" points!");
                        }break;
                    case 7:System.out.println("True or false?\nM&M stands for Mars and Moordale.");
                        scan=sc.next();
                        if(false_.equalsIgnoreCase(scan)){
                            player.scoreIncrease(this.alocated_points);
                            System.out.println("Plus "+this.alocated_points+" points!");
                        }
                        else{
                            player.scoreDecrease(this.deducted_points);
                            System.out.println("The answer is wrong!M&M stands for M&M stands for Mars and Murrie.Minus "+this.deducted_points+" points!");
                        }break;
                    case 8:System.out.println("True or false?\nGin is typically included in a Long Island Iced Tea.");
                        scan=sc.next();
                        if(true_.equalsIgnoreCase(scan)){
                            player.scoreIncrease(this.alocated_points);
                            System.out.println("Plus "+this.alocated_points+" points!");
                        }
                        else{
                            player.scoreDecrease(this.deducted_points);
                            System.out.println("The answer is wrong!Minus "+this.deducted_points+" points!");
                        }break;
                    case 9:System.out.println("True or false?\nThe unicorn is the national animal of Scotland.");
                        scan=sc.next();
                        if(true_.equalsIgnoreCase(scan)){
                            player.scoreIncrease(this.alocated_points);
                            System.out.println("Plus "+this.alocated_points+" points!");
                        }
                        else{
                            player.scoreDecrease(this.deducted_points);
                            System.out.println("The answer is wrong!Minus "+this.deducted_points+" points!");
                        }break;
                }
                break;
        }
    }


}
