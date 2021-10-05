import java.util.Scanner;

public class Trivia {
    private int alocated_points;
    private int deducted_points;

    public Trivia(int alocated_points,int deducted_points) {
        if (alocated_points < 0 || deducted_points < 0) {
            System.out.println("Error with points deduction!");
        }
        else {
            this.alocated_points = alocated_points;
            this.deducted_points = deducted_points;
        }
    }

    public void question(int q_randomizer,int c_randomizer,Player player){
        Scanner sc=new Scanner(System.in);
        String scan;
        String a="a",b="b",c="c",d="d";
        switch(q_randomizer) {
            case 0:
                System.out.println("History: ");
                switch (c_randomizer) {
                    case 0:System.out.println("In what year was King Mihai I born?a)1920 b)1915 \nc)1919 d)Year 1921");
                        scan=sc.next();
                        if(d.equalsIgnoreCase(scan)){
                            player.scoreIncrease(this.alocated_points);
                            System.out.println("Plus "+this.alocated_points+" points!");
                        }
                        else{
                            player.scoreDecrease(this.deducted_points);
                            System.out.println("The answer is wrong!Minus "+this.deducted_points+" points!");
                        }
                    break;
                    case 1:System.out.println("What is the degree of kinship between Charles II and Ferdinand I?\na)Ferdinand I is the father of Charles II  b)Ferdinand is the nephew of CharlesII\nc)CharlesII is the father d)They are brothers");
                        scan=sc.next();
                        if(a.equalsIgnoreCase(scan)){
                            player.scoreIncrease(this.alocated_points);
                            System.out.println("Plus "+this.alocated_points+" points!");
                        }
                        else{
                            player.scoreDecrease(this.deducted_points);
                            System.out.println("The answer is wrong!Minus "+this.deducted_points+" points!");
                        }
                        break;
                    case 2:System.out.println("In what country was Adolf Hitler born?a)Switzerland b)Germany\nc)Austria d)Poland");
                        scan=sc.next();
                        if(c.equalsIgnoreCase(scan)){
                            player.scoreIncrease(this.alocated_points);
                            System.out.println("Plus "+this.alocated_points+" points!");
                        }
                        else{
                            player.scoreDecrease(this.deducted_points);
                            System.out.println("The answer is wrong!Minus "+this.deducted_points+" points!");
                        }
                        break;
                    case 3:System.out.println("In which city were the Ceausescus executed?a)Bucuresti b)Târgoviste\nc)Iasi d)Constanta");
                        scan=sc.next();
                        if(b.equalsIgnoreCase(scan)){
                            player.scoreIncrease(this.alocated_points);
                            System.out.println("Plus "+this.alocated_points+" points!");
                        }
                        else{
                            player.scoreDecrease(this.deducted_points);
                            System.out.println("The answer is wrong!Minus "+this.deducted_points+" points!");
                        }
                        break;
                    case 4:System.out.println("In what year did Michael the Brave succeed in uniting the three great medieval countries?\na)1700 b)1600\nc)1500 d)1550");
                        scan=sc.next();
                        if(b.equalsIgnoreCase(scan)){
                            player.scoreIncrease(this.alocated_points);
                            System.out.println("Plus "+this.alocated_points+" points!");
                        }
                        else{
                            player.scoreDecrease(this.deducted_points);
                            System.out.println("The answer is wrong!Minus "+this.deducted_points+" points!");
                        }
                        break;
                    case 5:System.out.println("When did the First World War start?\na)1914 b)1919\nc)1920 d)1915");
                        scan=sc.next();
                        if(a.equalsIgnoreCase(scan)){
                            player.scoreIncrease(this.alocated_points);
                            System.out.println("Plus "+this.alocated_points+" points!");
                        }
                        else{
                            player.scoreDecrease(this.deducted_points);
                            System.out.println("The answer is wrong!Minus "+this.deducted_points+" points!");
                        }
                        break;
                    case 6:System.out.println("In what year did Romania join the European Union?\na)2000 b)2005\nc)2010 d)2007");
                        scan=sc.next();
                        if(d.equalsIgnoreCase(scan)){
                            player.scoreIncrease(this.alocated_points);
                            System.out.println("Plus "+this.alocated_points+" points!");
                        }
                        else{
                            player.scoreDecrease(this.deducted_points);
                            System.out.println("The answer is wrong!Minus "+this.deducted_points+" points!");
                        }
                        break;
                    case 7:System.out.println("In what year did Princess Diana die?\na)1995 b)1990\nc)1997 d)1999");
                        scan=sc.next();
                        if(c.equalsIgnoreCase(scan)){
                            player.scoreIncrease(this.alocated_points);
                            System.out.println("Plus "+this.alocated_points+" points!");
                        }
                        else{
                            player.scoreDecrease(this.deducted_points);
                            System.out.println("The answer is wrong!Minus "+this.deducted_points+" points!");
                        }
                        break;
                    case 8:System.out.println("What is the nationality of Pope Francis I?\na)Argentine b)Italian\nc)Spanish d)French");
                        scan=sc.next();
                        if(a.equalsIgnoreCase(scan)){
                            player.scoreIncrease(this.alocated_points);
                            System.out.println("Plus "+this.alocated_points+" points!");
                        }
                        else{
                            player.scoreDecrease(this.deducted_points);
                            System.out.println("The answer is wrong!Minus "+this.deducted_points+" points!");
                        }
                        break;
                    case 9:System.out.println("In what year was Romania's state independence proclaimed?\na)1877 b)1900\nc)1890 d)1870");
                        scan=sc.next();
                        if(a.equalsIgnoreCase(scan)){
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
                System.out.println("General knowledge: ");
                switch (c_randomizer) {
                    case 0:System.out.println("Who threw a hammer and a feather on the moon to prove that without air they fall at the same rate?\na)Buzz Aldrin b)Neil Armstrong\nc)David R. Scott d)Nikola Tesla");
                    scan=sc.next();
                    if(c.equalsIgnoreCase(scan)){
                        player.scoreIncrease(this.alocated_points);
                        System.out.println("Plus "+this.alocated_points+" points!");
                    }
                    else{
                        player.scoreDecrease(this.deducted_points);
                        System.out.println("The answer is wrong!Minus "+this.deducted_points+" points!");
                    }
                        break;
                    case 1:System.out.println("If the Earth were made in a black hole, what would be the diameter of its event horizon?\na)5mm b)20mm \nc) 1cm d)20m");
                        scan=sc.next();
                    if(b.equalsIgnoreCase(scan)){
                            player.scoreIncrease(this.alocated_points);
                            System.out.println("Plus "+this.alocated_points+" points!");
                        }
                        else{
                            player.scoreDecrease(this.deducted_points);
                            System.out.println("The answer is wrong!Minus "+this.deducted_points+" points!");
                        }
                        break;

                        case 2:
                            System.out.println("If you fell on a hole without air, without friction, which crosses the Earth, how long should it fall on the other side? (Until the next minute.)\na)42 minutes b)2min\nc)1hour d)2hours");
                            scan=sc.next();
                            if(a.equalsIgnoreCase(scan)){
                                player.scoreIncrease(this.alocated_points);
                                System.out.println("Plus "+this.alocated_points+" points!");
                            }
                            else{
                                player.scoreDecrease(this.deducted_points);
                                System.out.println("The answer is wrong!Minus "+this.deducted_points+" points!");
                            }
                        break;
                    case 3:System.out.println("How many hearts does an octopus have?\na)5 b)3\nc)10 d)1");
                        scan=sc.next();
                    if(b.equalsIgnoreCase(scan)){
                            player.scoreIncrease(this.alocated_points);
                            System.out.println("Plus "+this.alocated_points+" points!");
                        }
                        else{
                            player.scoreDecrease(this.deducted_points);
                            System.out.println("The answer is wrong!Minus "+this.deducted_points+" points!");
                        }
                        break;
                    case 4:System.out.println("In what year was WD40 invented by chemist Norm Larsen?\na)1953 b)1960\nc)1950 d)1957");
                        scan=sc.next();
                        if(a.equalsIgnoreCase(scan)){
                            player.scoreIncrease(this.alocated_points);
                            System.out.println("Plus "+this.alocated_points+" points!");
                        }
                        else{
                            player.scoreDecrease(this.deducted_points);
                            System.out.println("The answer is wrong!Minus "+this.deducted_points+" points!");
                        }
                    break;
                    case 5:System.out.println("If you took one step per second in seven-league boots, what would be your speed in miles per hour?\na)75,600 miles per hour b)1mile per hour\nc)20mile per hour d)50miles per hour ");
                        scan=sc.next();
                    if(a.equalsIgnoreCase(scan)){
                            player.scoreIncrease(this.alocated_points);
                            System.out.println("Plus "+this.alocated_points+" points!");
                        }
                        else{
                            player.scoreDecrease(this.deducted_points);
                            System.out.println("The answer is wrong!Minus "+this.deducted_points+" points!");
                        }
                    break;
                    case 6:System.out.println("What is the farthest you can see with the naked eye?\na)2.5 million light-years b)100 miles\nc)300 thousands miles  d)8 light years");
                        scan=sc.next();
                    if(a.equalsIgnoreCase(scan)){
                            player.scoreIncrease(this.alocated_points);
                            System.out.println("Plus "+this.alocated_points+" points!");
                        }
                        else{
                            player.scoreDecrease(this.deducted_points);
                            System.out.println("The answer is wrong!Minus "+this.deducted_points+" points!");
                        }
                    break;
                    case 7:System.out.println("How many hairs are on a typical human head?\na)1milion b)10 milion\nc)100thousands d)10,000 hair");
                        scan=sc.next();
                        if(d.equalsIgnoreCase(scan){
                            player.scoreIncrease(this.alocated_points);
                            System.out.println("Plus "+this.alocated_points+" points!");
                        }
                        else{
                            player.scoreDecrease(this.deducted_points);
                            System.out.println("The answer is wrong!Minus "+this.deducted_points+" points!");
                        }
                        break;
                    case 8:System.out.println("Who Invented the Phonograph?\na)Emile Berliner b)Thomas Edison\nc)Nikola Tesla d)Albert Einstein");
                        scan=sc.next();
                        if(b.equalsIgnoreCase(scan)){
                            player.scoreIncrease(this.alocated_points);
                            System.out.println("Plus "+this.alocated_points+" points!");
                        }
                        else{
                            player.scoreDecrease(this.deducted_points);
                            System.out.println("The answer is wrong!Minus "+this.deducted_points+" points!");
                        }
                        break;
                    case 9:System.out.println("How long will it take a spacecraft launched from Earth to reach the planet Pluto?\na)9 and a half years b)5 years\nc)10horus  d)1 year");
                        scan=sc.next();
                        if(a.equalsIgnoreCase(scan)){
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

        }
    }

    public boolean checker(String input_chr,String output_chr){
        if (input_chr==output_chr){
            return true;
        }
        else{
            return false;
        }
    }

}
