import java.util.Scanner;
public class DikUcgen {
    public static void main(String[] args) {

        double a,b,c,u,s;
        Scanner input = new Scanner(System.in);

        System.out.print("Birinci kenarı dahil et: ");
        a = input.nextDouble();

        System.out.print("İkinci kenarı dahil et: ");
        b = input.nextDouble();

        c = Math.sqrt(a*a + b*b);
        System.out.println("Hipotenüs: " + c);

        u=(a+b+c)/2;
        s = u * (u - a)* (u - b) * (u - c);

        System.out.println("Alan: " + s);
    }

}
