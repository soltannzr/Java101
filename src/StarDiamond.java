import java.util.Scanner;
public class StarDiamond {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n;

        System.out.print("Enter number: ");
        n = inp.nextInt();

        for (int i=1;i<=n;i++){
            for(int j=n-i;j>0;j--){
                System.out.print(" ");
            }

            for(int k=1;k<=(i*2-1);k++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int t = n-1; t >0; t--){
            for(int j = 1; j<=(n- t); j++){
                System.out.print(" ");
            }

            for(int k = 1; k<=(2* t -1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
