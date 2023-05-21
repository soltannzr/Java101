import java.util.Scanner;
public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double num,component, result =0;

        System.out.print("Enter number: ");
        num = inp.nextDouble();

        for(double i=1;i<=num;i++){
            component = 1/i;
            result += component;
        }

        System.out.print("Result: "+result);
    }
}
