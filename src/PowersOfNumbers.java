import java.util.Scanner;
public class PowersOfNumbers {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a,j,i;
        System.out.print("Enter number: ");
        a = inp.nextInt();
        System.out.print("Powers of 4: ");
        for ( i = 1;i<a; i*=4) {
            if (i * 4 >= a)
                System.out.println(i);
            else
                System.out.print(i + ",");
        }

        System.out.print("Powers of 5: ");
        for (j =1;j<a; j*=5){
            if (j*5>=a)
                System.out.println(j);
            else System.out.print(j+",");
        }

    }
}
