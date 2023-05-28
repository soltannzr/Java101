import java.util.Scanner;
public class FibonacciSequuence {
    public static void main(String[] args) {
         Scanner inp = new Scanner(System.in);
         int n,first=0,second=1, sum;
        System.out.print("Enter Number: ");
        n=inp.nextInt();

        System.out.print(first + " " + second + " ");
        for(int i=2;i<=n;i++){
            sum = first + second;
            first=second;
            second = sum;
            System.out.print(sum + " ");
        }
    }
}
