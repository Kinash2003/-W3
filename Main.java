package com.company;

import java.io.*;

public class Main{


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print(" n: ");
        String sn = reader.readLine();
        int n = Integer.parseInt(sn);

        int digits_n = digitsNumber(n);
        System.out.println("Find out if the number 3 is included in the number record ?");
        isThree(n);
        System.out.println("Сhange the order of the digits of the number n to the reverse: " + reverseN(n));
        System.out.println("Rearrange the first and last digits of the number n: " + swapDigits(n, digits_n));
        System.out.println("Prescribe one at the beginning and at the end : " + addOnes(n, digits_n));
    }

    static void isThree(int n) {
        boolean k = false;
        int square;
        square = n * n;

        while (square > 0)
        {
            if (square % 10 == 3)
            {
                k = true;
            }
            square = square / 10;
        }

        if (k) { System.out.println("Not");}
        else{ System.out.println("Yes");}
    }

    static int reverseN(int n) {
        int rev_n = 0;
        while (n!=0)
        {
            int temp = n % 10;
            rev_n = rev_n * 10 + temp;
            n = n / 10;
        }
        return rev_n;
    }

    static int swapDigits(int n, int digits_n) {
        int power = (int)(Math.pow(10, digits_n - 1));

        int lastDigit = n % 10;
        int firstDigit = n / power;

        n = n % power + lastDigit * power;

        n = n / 10;

        n = n * 10 + firstDigit;

        return n;
    }

    static int addOnes(int n, int digits_n){

        int power = (int)(Math.pow(10, digits_n - 1));


        n = n % power + 1 * power;

        n = n / 10;

        n = n * 10 + 1;

        return n;
    }

    static int digitsNumber(int n){
        int digits_n = 0;
        int temp_n = n;
        while (temp_n > 0)
        {
            temp_n = temp_n / 10;
            digits_n ++;
        }
        return digits_n;
    }
}