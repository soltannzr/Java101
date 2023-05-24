import java.util.Scanner;
public class ATMProgram {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String uName, password, validName = "soli", validPassword = "123";
        boolean isBlocked = false, continueLoop = true;;
        short choice, tries = 3;
        int balance = 1000,price;


        for (int i = tries; i > 0; i--) {
            System.out.print("Enter username: ");
            uName = inp.nextLine();
            System.out.print("Enter password: ");
            password = inp.nextLine();

            if (password.equals(validPassword) && uName.equals(validName)) {
                System.out.println("Entered successfully");
                break;
            }
            tries--;
            if (tries == 0) {
                System.out.println("Too many unsuccessful attempts. " +
                        "\nCard blocked. Please contact your bank");
                isBlocked = true;
            }
            else {
                System.out.println("\nIncorrect login credentials. Please try again." +
                        "\nRemaining attempts: " + tries +"\n");
            }
        }


        if (!(isBlocked)) {
            do {
                System.out.println("\nPlease choose the operation you want to perform: " +
                        "\n1-Deposit money" +
                        "\n2-Withdrawal" +
                        "\n3-Check Balance" +
                        "\n4-Exit");

                choice = inp.nextShort();
                switch (choice) {
                    case 1:
                        System.out.print("Enter the amount : ");
                        price = inp.nextInt();
                        balance += price;
                        break;
                    case 2:
                        System.out.print("Enter the amount : ");
                        price = inp.nextInt();
                        if (price > balance) {
                            System.out.println("Insufficient balance\n");
                        } else {
                            balance -= price;
                        }
                        break;

                    case 3:
                        System.out.println("Your balance : " + balance +"\n");
                        break;

                    case 4:
                        break;

                    default: System.out.println("Enter valid choice\n");
                }
                if (continueLoop && choice != 4) {
                    System.out.print("\nDo you want to perform another operation? (Y/N): ");
                    String answer = inp.next();
                    continueLoop = (answer.equals("Y") || answer.equals("y"));
                }
            }

            while (choice != 4 && continueLoop);

            System.out.println("Thanks");
        }
    }
}


