package Methods;

import java.util.Scanner;

public class PatternRecursive {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = scanner.nextInt();
        scanner.close();

        String series = generateNumberSeries(input);
        System.out.println("Output: " + series);
    }

    public static String generateNumberSeries(int num) {
        if (num <= 0) {
            return num+ " ";
        } else {
            return num + " " + generateNumberSeries(num - 5) + num + " ";
        }
    }
}