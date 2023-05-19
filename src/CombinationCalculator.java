import java.util.Scanner;
public class CombinationCalculator {
    public static void main(String[] args) {
        Scanner inp = new Scanner (System.in);
        int n,r,nFac =1 , rFac = 1, nrFac = 1, combineson;

        System.out.println("Enter the numbers you want to calculate the combination according to C(n,r)" );
        System.out.print("Enter n: ");
        n = inp.nextInt();


        System.out.print("Enter r: ");
        r = inp.nextInt();

        for (int i = 1;i<=n;i++){
            nFac *= i;
        }
        for (int j = 1;j<=r;j++){
            rFac *= j;
        }
        for (int k = 1;k <=(n-r);k++){
            nrFac *= k;
        }
        combineson = nFac/(rFac * nrFac);
        System.out.println("C(" + n + "," + r +") : " + combineson);
    }
}
