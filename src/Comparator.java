import java.util.Scanner;
public class Comparator {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n,x,max,min;
        int count=1;

        System.out.print("How many numbers will you enter? : ");
        n=inp.nextInt();

        System.out.print(count + ". number: ");
        x = inp.nextInt();
        max = x;
        min = x;
        count++;

        for(int i=2;i<=n;i++){
            System.out.print(count + ". number: ");
            x=inp.nextInt();
            if (x>max){
                max=x;
            }
            if (x<min){
                min=x;
            }
            count++;
        }
        System.out.println("\nMinimum: "+min);
        System.out.println("Maximum: "+max);
    }
}