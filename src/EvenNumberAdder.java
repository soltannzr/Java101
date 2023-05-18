import java.util.Scanner;
public class EvenNumberAdder {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int a,sum = 0;
        System.out.println("This program adds up the even numbers divisible by 4 from the numbers you provide");
         do{
             System.out.print("Enter a number: ");
             a=inp.nextInt();
             if (a%4 == 0) {
                 sum += a;
             }

         } while(a%2 == 0);
        System.out.println("Sum is:" + sum);
    }
}
