package Fundamentals.ObjectAndClasses.BigFactorial;

import java.math.BigInteger;
import java.util.Scanner;

public class BigFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        BigInteger factorial = new BigInteger("1");
        for (int i = 2; i <= input; i++) {
            BigInteger multiplayer = new BigInteger("" + i);
            factorial = factorial.multiply(multiplayer);
        }
        System.out.println(factorial);
    }
}
