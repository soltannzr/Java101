import java.util.Scanner;
public class Taksimetre {
    public static void main(String[] args) {

        double mesafe, tutar, ucret=2.2, acilis=10;
        Scanner input = new Scanner(System.in);

        System.out.println("Gidilen mesafe: ");
        mesafe = input.nextDouble();

        tutar = acilis + (ucret * mesafe);
        tutar = (tutar>20) ? tutar : 20;

        System.out.println("Toplam tutar: " + tutar);

    }
}
