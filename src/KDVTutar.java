import java.util.Scanner;
public class KDVTutar {
    public static void main(String[] args) {

            double kdvsiz, kdvli, kdvtutar, kdvoran = 0.18;

            Scanner input = new Scanner(System.in);
            System.out.print("KDV'siz değeri giriniz: ");

            kdvsiz = input.nextDouble();
            kdvli = kdvsiz + kdvsiz * kdvoran;
            kdvtutar = kdvli - kdvsiz;

            System.out.println("KDV'siz Fiyat: " + kdvsiz);
            System.out.println("KDV'li Fiyat: " + kdvli);
            System.out.println("KDV tutarı: " + kdvtutar);

        }
    }
