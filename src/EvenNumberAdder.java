import java.util.Scanner;
public class EvenNumberAdder {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int a,sum = 0;

         do{
             System.out.println("Enter a number: ");
             a=inp.nextInt();
             if (a%4 == 0) {
                 sum += a;
             }

         } while(a%2 == 0);
        System.out.println("Sum is:" + sum);
    }
}
