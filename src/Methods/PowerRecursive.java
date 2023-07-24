package Methods;

import java.util.Scanner;

public class PowerRecursive {

    static int calcPower (int base, int pow) {
        if (pow == 0){
            return 1;
        }
        else if (pow==1) {
            return base;
        }
        else
            return calcPower(base, pow-1) * base;
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter base: ");
        int base=inp.nextInt();
        System.out.println("Enter power: ");
        int pow=inp.nextInt();

        System.out.println(calcPower(base, pow));

    }
}
