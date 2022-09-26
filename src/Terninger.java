import java.util.Random;

//Class for terninger
public class Terninger {
    public void rafelBaeger(){
        Random rand = new Random(); //random method
        int border = 7; //Grænse for terningudkast, grunden til vi sætter den til 7, er så den aldrig blir 0,
        // da den starter på 0.

        int terning1 = rand.nextInt(border);
        int terning2 = rand.nextInt(border);
        int terningSum = terning1 + terning2;
    }
}
