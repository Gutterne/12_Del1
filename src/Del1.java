import java.util.Scanner;
public class Del1 {
    private static int terningSum;

    public static void main (String [] args){


       // Terninger terningObject = new Terninger(terningSum);

        Terninger terninger = new Terninger(terningSum);

        //Boolean værdier
        boolean playing =true;
        boolean player2 = false;

        Scanner scanner = new Scanner(System.in);

        while(playing) {

            //player 1
            System.out.println("Player 1 spiller nu");
            System.out.println("Tryk enter for at spille");
            String p1 = scanner.nextLine();
            System.out.print("Player 1, har kastet: ");
            terninger.rafelBaeger(terningSum);
            System.out.println("");


            //player 2
            System.out.println("Player 2 spiller nu");
            System.out.println("Tryk enter for at spille");
            String p2 = scanner.nextLine();

            System.out.print("Player 2, har kastet: ");
            terninger.rafelBaeger(terningSum);
            System.out.println("");
        }
}

}
