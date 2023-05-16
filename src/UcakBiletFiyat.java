import java.util.Scanner;
public class UcakBiletFiyat {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double km, costPerKm = 0.1 , total, discount = 0;
        byte type = 0;
        int age;
        boolean isError = false;

        System.out.print("Mesafeyi dahil ediniz : ");
        km = inp.nextDouble();

        System.out.print("Yaşınızı giriniz : ");
        age = inp.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        type = inp.nextByte();
        total = km * costPerKm;

        if (age<12){
            discount += total * 0.5;
        }
        else if (age>=12 && age<=24) {
            discount += total * 0.1;
        }
        else if (age>65) {
            discount += total * 0.1;
        }

        total -= discount;

        switch (type){
            case 2:
                discount = total * 0.2;
                total = (total - discount) * 2;
                break;
            case 1:
                discount = 0;
                break;
                default:
                isError = true;
        }

        if (!(km>=0)){
            isError = true;
        }

         if (isError == true){
            System.out.println("Hatalı Veri Girdiniz !");
        }
         else{
            System.out.println("Toplam Tutar: " + total + " TL");
        }
    }
}