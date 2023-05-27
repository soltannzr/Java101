import java.util.Scanner;
public class ReversedTriangle {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n;
        n=inp.nextInt();

        for(int i=n; i>0;i--){
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int j=(2*i-1);j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
