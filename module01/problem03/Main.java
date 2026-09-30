package module01.problem03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int startingNum = input.nextInt();

        do {
            if (startingNum % 2 == 0) {
                startingNum += 1;
                continue;
            }

            System.out.print(startingNum);
            startingNum += 2;

            if (n > 1) {
                System.out.print(", ");
            }

            n--;
        } while (n > 0);
    }
}