import java.util.Scanner;
public class EvenNumbersFinder {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a, num = 0, sum = 0, average;

        System.out.print("Enter a number: ");
        a = inp.nextInt();

        for (int i=1; i<=a; i++){
            if (i%3 ==0 && i%4 ==0){
                num ++;
                sum += i;
            }
        }

        average = sum / num;
        System.out.println("Average of numbers that can be divided by 3 and 4: " + average);
    }
}
