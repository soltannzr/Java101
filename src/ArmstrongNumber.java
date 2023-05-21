import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
         int num, counter=0, digit, powDigits =1, result = 0;
        System.out.print("Enter number: ");
        num = inp.nextInt();

        int tempNum=num;

        while (tempNum !=0){
            tempNum/=10;
            counter++;
        }

        tempNum = num;
        while (tempNum!=0) {
            digit = tempNum % 10;

            powDigits = 1;
            for (int i =1;i<=counter;i++){
                powDigits *=digit;
            }
            result +=powDigits;
            tempNum/=10;
        }

        if(num == result){
            System.out.println(num + " is Armstrong number.");
        }
        else
            System.out.println(num+" isn't Armstrong number.");
    }
}

