package com.company;

public class Distance
{
    public static void main(String[] args)
    {
        double km = 2;
        double miles = 1;



        System.out.println(km + " km sind "+ Km2Miles(km)+" miles");
        System.out.println(miles + " miles sind "+ Miles2Kilometres(miles)+" km");
    }

    public static double Km2Miles(double km)
    {
        return km * 0.6214;
    }

    public static double Miles2Kilometres(double miles)
    {
        return miles / 0.6214;
    }
}
