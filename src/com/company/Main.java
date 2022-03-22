package com.company;
import  java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    Scanner p=new Scanner(System.in);
    double x, y ;
        System.out.println("Podaj x");

    x=p.nextDouble();
        System.out.println("podaj y");
    y=p.nextDouble();
    double z= Math.pow(x,y);
    System.out.println("Liczba"+x+"podniesiona do potęgi" +y+ "to" +z);
    }
}
