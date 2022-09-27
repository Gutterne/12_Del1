//Class for terninger
public class Terninger {
    int terningSum;
    int sum;
    //Her laves en konstrukter og gør det object.
    Terninger(int sum) {
this.sum = terningSum;
    }

    public int rafelBaeger(int terningSum) {

            sum = terningSum;
            int size = 6; //Størrelsen af vores random interval, Indeholder 0-5, hermed 6 cifre, hvori der består 0.

            int terning1 = (int) (Math.random()*6+1); //(+1) afrykker vores interval et tal over, så det er fra 1-6
            int terning2 = (int) (Math.random()*6+1);
            sum= terning1 + terning2;
            System.out.println(sum);
        return size;
    }
    }

