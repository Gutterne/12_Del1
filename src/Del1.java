import java.util.Scanner;
public class Del1 {
    public static void main (String [] args){

        //Method reference
        Terninger terningObject = new Terninger();


        //terningObject.rafelBaeger();

        //Boolean værdier
        boolean playing =true;
        boolean player2 = false;

        Scanner scanner = new Scanner(System.in);

        while(playing) {

            //player 1
            System.out.println("Player 1 spiller nu");
            System.out.println("Tryk enter for at spille");
            String p1 = scanner.nextLine();

            //player 2
            System.out.println("Player 2 spiller nu");
            System.out.println("Tryk enter for at spille");
            String p2 = scanner.nextLine();



        }
}

}
