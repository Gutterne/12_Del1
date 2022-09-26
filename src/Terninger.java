import java.util.Random;

//Class for terninger
public class Terninger {
    int terningSum;
    int sum;
    Terninger terninger;

    Terninger(int sum) {
this.sum = terningSum;
    }

    public void rafelBaeger(int terningSum) {

            sum = terningSum;
            Random rand = new Random(); //random method
            int border = 7; //Grænse for terningudkast, grunden til vi sætter den til 7, er så den aldrig blir 0,
            // da den starter på 0.

            int terning1 = rand.nextInt(border);
            int terning2 = rand.nextInt(border);
            sum= terning1 + terning2;
            System.out.println(sum);

        }
    }

