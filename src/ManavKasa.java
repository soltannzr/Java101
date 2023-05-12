import java.util.Scanner;
public class ManavKasa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pear = 2.14, apple = 3.67, banana = 0.95, aubergine = 5.00, tomato = 1.11, total;

        System.out.print("Armut Kaç Kilo ? : ");
        Double pkg = input.nextDouble();
        pear *= pkg;

        System.out.print("Elma Kaç Kilo ? : ");
        Double akg = input.nextDouble();
        apple*=akg;

        System.out.print("Domates Kaç Kilo ? : ");
        Double tkg = input.nextDouble();
        tomato *= tkg;

        System.out.print("Muz Kaç Kilo ? : ");
        Double bkg = input.nextDouble();
        banana *= bkg;

        System.out.print("Patlıcan Kaç Kilo ? : ");
        Double aukg = input.nextDouble();
        aubergine *= aukg;

        total = banana + aubergine + tomato + apple + pear;
        System.out.println("Toplam Tutar : " + total);
    }
}
