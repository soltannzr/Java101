import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        double phy, math, mus, chem, hist, lang, av;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notu: ");
        math = input.nextDouble();

        System.out.print("Fizik notu:");
        phy = input.nextDouble();

        System.out.print("Türkçe notu:");
        lang = input.nextDouble();

        System.out.print("Müzik notu:");
        mus = input.nextDouble();

        System.out.print("Kimya notu:");
        chem = input.nextDouble();

        System.out.print("Tarih notu:");
        hist = input.nextDouble();

        av = (hist+mus+math+chem+lang+phy)/6;
        System.out.println("Ortalamanız: "+av);

        String pass = (av>60)? "Geçti":"Kaldı";
        System.out.print(pass);
    }
}