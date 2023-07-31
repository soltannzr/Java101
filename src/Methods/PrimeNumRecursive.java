package Methods;

import java.util.Scanner;

public class PrimeNumRecursive {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = inp.nextInt();

        if (isPrime(num, 2)) {
            System.out.println(num+ " is a prime");
        }
        else
            System.out.println(num + " is not a prime");
    }

    public static boolean isPrime(int num, int divisor){
        if (num<2)
            return false;
        if (num==2)
            return true;
        if (num%divisor==0) {
            return divisor == num; //these 2 lines mean that if num%divisor==0 and divisor == num, it returns true
                                   //and it means number is prime. But if divisor != num, it returns false,
                                   //and it means number is not prime.
        }

        return isPrime(num, divisor + 1);

    }
}
