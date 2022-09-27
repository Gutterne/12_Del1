import java.util.Scanner;
public class Del1 {
    public static int terningSum;
    public static  int temp1playersum;
    public static int temp2playersum;

    public static void main (String [] args){

        //Method reference
        Terninger terninger = new Terninger(terningSum);


        //Boolean værdier
        boolean playing =true;


        Scanner scanner = new Scanner(System.in);

        while(playing) {

            //player 1
            System.out.println("Player 1 spiller nu");
            System.out.println("Tryk enter for at spille");
            String p1 = scanner.nextLine();
            terninger.rafelBaeger(terningSum);
            //System.out.println((temp1playersum));
            terninger.player1(temp1playersum);
            //player 2
            System.out.println("Player 2 spiller nu");
            System.out.println("Tryk enter for at spille");
            String p2 = scanner.nextLine();

            terninger.rafelBaeger(terningSum);
            terninger.player2(temp2playersum);


        }
}

}
