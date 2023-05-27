import java.util.Scanner;
public class GCMandLCM {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int num1,num2,max = 0,gcd =1,lcm =1;

        System.out.print("Enter number 1: ");
        num1 = inp.nextInt();
        System.out.print("Enter number 2: ");
        num2 = inp.nextInt();

        if (num1>=num2){
            max = num1;
        }
        if(num2>=num1){
            max = num2;
        }

        int i=max,k=1;
        while(i>0){
            if(num1%i == 0 && num2%i==0){
                gcd=i;
                break;
            }
            i--;
        }
        while (k<=num1*num2){
            if(k%num2 == 0 && k%num1 ==0 ) {
                lcm = k;
                break;
            }
            k++;
        }
        System.out.println("Greatest Common Divisor: "+ gcd);
        System.out.print("Least Common Multiple: " + lcm);

    }
}
