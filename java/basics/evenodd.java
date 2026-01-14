
//program to check if last digit of a number is even or odd

import java.util.Scanner;

class evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        checkLastDigitEvenOdd(number);
        sc.close();
    }

    static void checkLastDigitEvenOdd(int number) {
        int lastDigit = number % 10;
        if (lastDigit % 2 == 0) {
            System.out.println("Last digit of " + number + " is even.");
        } else {
            System.out.println("Last digit of " + number + " is odd.");
        }
    }
}