package Com_Bridgelabz_Basic;
import java.util.Random;

public class Largest_no {
    public static void main(String[] args) {

        Random Number = new Random();
        int x = Number.nextInt(100) + 1;
        System.out.println(+x);
        int y = Number.nextInt(100) + 1;
        System.out.println(+y);
        int z = Number.nextInt(100) + 1;
        System.out.println(+z);

        if (x > y && x > z) {
            System.out.print(String.valueOf(x) + " " + " is largest num between 3 no");
        } else if (y > x && y > z) {
            System.out.print(String.valueOf(y) + " " + "is largest num between 3 no");
        } else {
            System.out.print(String.valueOf(z) + " " + "is largest bwtween 3 no");
        }
    }

}
