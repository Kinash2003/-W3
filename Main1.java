package com.company;
import java.util.*;
import java.lang.*;

public class Main1 {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int x = in.nextInt();
        int y = in.nextInt();

        while ((a<=0)||(b<=0)||(c<=0)||(x<=0)||(y<=0)) {
            System.out.println("The brick will not pass");
            a = in.nextInt();
            b = in.nextInt();
            c = in.nextInt();
            x = in.nextInt();
            y = in.nextInt();
        }
        if ((x >= a && y >= b) || (x >= b && y >= a)) {
            System.out.println("The brick will pass");
        } else if ((x >= b && y >= c) || (x > c && y > b)) {
            System.out.println("The brick will pass");

        } else if ((x >= c && y >= a) || (x >= a && y >= c)) {
            System.out.println("The brick will pass");
        } else {
            System.out.println("The brick will not pass");
        }
    }
}

