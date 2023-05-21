import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int number, result = 0, digitValue;

        System.out.print("Enter a number: ");
        number = inp.nextInt();
        int tempNumber = number;

        while (tempNumber!=0){
            digitValue = tempNumber%10;
            result +=digitValue;
            tempNumber/=10;
        }
        System.out.println("Sum of digits: " + result);
    }
}
