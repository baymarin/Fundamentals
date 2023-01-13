package Fundamentals;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(new Date());
        String text = "";

        for (int i = 0; i < 1000000 ; i++) {
            text += 'a';
        }
        System.out.println(new Date());
    }
}

