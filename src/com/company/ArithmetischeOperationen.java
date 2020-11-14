package com.company;

import jdk.dynalink.Operation;

public class ArithmetischeOperationen {
    public static void main(String[] args) {
        int a,b;
        a=9;
        b=5;
        /*
        int x = a+b;
        System.out.println(a +" + "+ b + " = " + x);
        x = a-b;
        System.out.println(a +" - "+ b + " = " + x);
        x = a*b;
        System.out.println(a +" * "+ b + " = " + x);
        x = a/b;
        System.out.println(a +" / "+ b + " = " + x);
        x = a%b;
        System.out.println(a +" % "+ b + " = " + x);
        */
        Calculate(a, b, '+');
        Calculate(a, b, '-');
        Calculate(a, b, '*');
        Calculate(a, b, '/');
        Calculate(a, b, '%');

        int n1 = 10;
        int n2 = 5;

        System.out.println(++n1);
    }

    private static void Calculate(int a, int b, char operation)
    {
        switch(operation)
        {
            case '+':
                int x = a+b;
                System.out.println(a +" + "+ b + " = " + x);
                break;
            case '-':
                x = a-b;
                System.out.println(a +" - "+ b + " = " + x);
                break;
            case '*':
                x = a*b;
                System.out.println(a +" * "+ b + " = " + x);
                break;
            case '/':
                x = a/b;
                System.out.println(a +" / "+ b + " = " + x);
                break;
            case '%':
                x = a%b;
                System.out.println(a +" % "+ b + " = " + x);
                break;
            default:
                System.out.println("Operation not recognized");
                break;
        }

    }
}
