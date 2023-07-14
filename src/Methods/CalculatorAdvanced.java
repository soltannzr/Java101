package Methods;

import java.util.Scanner;

public class CalculatorAdvanced {

    static void summation() {
        Scanner inp =new Scanner(System.in);
        int  result=0, i=0;
        while (true) {
            System.out.print(++i + ". number: ");
            int number = inp.nextInt();
            result += number;
            if(number==0)
                break;
        }
        System.out.print("result is: "+result);
    }

    static void subtraction(){
        Scanner inp = new Scanner(System.in);
        int result=0, number, i=0;

        do {
            System.out.print(++i + ". number: ");
            number = inp.nextInt();
            if (i == 1) {
                result += number;
            } else {
                result -= number;
            }
        } while (number != 0);
        System.out.println("Result is: "+result);
    }

    static void multiplication(){
        Scanner inp=new Scanner(System.in);
        int number, result=1, i=0;
        while(true){
            System.out.print(++i+ ". number: ");
            number=inp.nextInt();
            if (number==0){
                result=0;
                break;
            }
           else result*=number;
        }
        System.out.println("Result is:" + result);
    }

    static void division(){
        Scanner inp = new Scanner(System.in);
        int number, i=0;
        double result=0;

        while (true){
            System.out.print(++i + ". number ");
            number=inp.nextInt();

            if (i!=1 && number==0){
                System.out.println("Can't divide by 0");
                break;
            }
            else if (i==1){
                result+=number;
            }
            else {
                result/=number;
            }
            if (number==1)
                break;
        }
        System.out.println("Result is: "+ result);
    }

    static void exponentiation(){
        Scanner inp=new Scanner(System.in);
        int base, power, result=1;
        System.out.print("Enter base: ");
        base = inp.nextInt();
        System.out.print("Enter power: ");
        power = inp.nextInt();

        for (int i=1;i<=power;++i){
            result*=base;
        }
        System.out.print("Result is: " + result);
    }

    static void modulo(){
        Scanner inp= new Scanner (System.in);
        int result,a,b;
        System.out.print("Enter first number: ");
        a=inp.nextInt();
        System.out.print("Enter second number: ");
        b=inp.nextInt();
        result=a%b;
        System.out.println("Result is: "+result);
    }
    static void RecArea(){
        Scanner inp=new Scanner(System.in);
        int a,b,area;
        System.out.print("Enter one side: ");
        a=inp.nextInt();
        System.out.print("Enter other side: ");
        b=inp.nextInt();
        area=a*b;
        System.out.print("Area is: "+area);
    }

    static void factorial(){
        Scanner inp = new Scanner (System.in);
        int number, result=1;
        System.out.print("Enter number: ");
        number=inp.nextInt();
        for (int i=1; i<=number; ++i){
            result*=i;
        }
        System.out.println("Result is: "+result);
    }

    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        String text = """
                Hi! Choose the operation:
                1 - Summation
                2 - Subtraction
                3 - Multiplication
                4 - Division
                5 - Exponentiation
                6 - Factorial
                7 - Modulo
                8 - Area of rectangular
                0 - Exit""";

        System.out.println(text);
        byte select= inp.nextByte();
        while (select!=0){
            switch (select){
                case 1: summation();
                    break;
                case 2: subtraction();
                    break;
                case 3: multiplication();
                    break;
                case 4: division();
                    break;
                case 5: exponentiation();
                    break;
                case 6: factorial();
                    break;
                case 7: modulo();
                    break;
                case 8: RecArea();
                    break;
                default:
                    System.out.println("Invalid choice, try again");
            }
            System.out.print("\nChoose the operation: ");
            select=inp.nextByte();
        }
        System.out.println("Thanks");
    }
}
