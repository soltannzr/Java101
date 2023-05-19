import java.util.Scanner;
public class PowerCalculator {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int num, pow,ans = 1;

        System.out.print("Enter number: ");
        pow = inp.nextInt();

        System.out.print("Enter power: ");
        num = inp.nextInt();

        for (int i = 1; i<=pow; i++){
            ans *=num;
        }
        System.out.println("Answer is: " + ans);
    }
}
