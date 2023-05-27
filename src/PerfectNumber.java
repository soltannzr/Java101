import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int num,sum=0;
        System.out.print("Enter number: ");
        num = inp.nextInt();

        for(int i=1;i<num;i++){
            if (num%i==0){
                sum +=i;
            }
        }
        if(sum==num) {
            System.out.println(num + " is perfect number.");
        }
        else
            System.out.println(num + " is not perfect number.");
    }
}
