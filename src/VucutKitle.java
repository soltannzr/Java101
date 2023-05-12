import java.util.Scanner;
public class VucutKitle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double kg, metr, bmi;

        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        metr = input.nextDouble();

        System.out.println("Lütfen kilonuzu giriniz : ");
        kg = input.nextDouble();

        bmi = kg / (metr * metr);
        System.out.println("Vücut Kitle İndeksiniz : " + bmi);

    }
}
