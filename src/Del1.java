import java.util.Scanner;
public class Del1 {
    private static int terningSum;

    public static void main (String [] args){


       // Terninger terningObject = new Terninger(terningSum);



        //Boolean værdier
        boolean playing =true;
        boolean player2 = false;

        Scanner scanner = new Scanner(System.in);
        int points1=0, points2=0;

        while(playing) {

            //player 1
            System.out.println("Player 1 spiller nu");
            System.out.println("Tryk enter for at spille");
            String p1 = scanner.nextLine();

            int terning1 = (int) (Math.random()*6+1);
            int terning2 = (int) (Math.random()*6+1);
            System.out.print("Player 1, har kastet:"+ terning1+" og "+terning2);
            int sum = terning1+terning2;
            points1+= sum;
            System.out.println("  " + points1);


            //player 2
            System.out.println("Player 2 spiller nu");
            System.out.println("Tryk enter for at spille");
            String p2 = scanner.nextLine();

            System.out.print("Player 2, har kastet: ");
            int terning3 = (int) (Math.random()*6+1);
            int terning4 = (int) (Math.random()*6+1);
            System.out.print("Player 2, har kastet: "+terning3+" "+terning4);
            int num = terning3+terning4;
            points2+= num;

            System.out.println(" "+points2);
        }
}

}
