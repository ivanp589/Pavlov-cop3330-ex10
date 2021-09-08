package org.example;

import java.util.Scanner;

import static java.lang.System.out;

/**
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 ivan pavlov
 */
public class App 
{
    static Scanner in = new Scanner(System.in);
    public static void main( String[] args )
    {
        int x=1;
        double tax = .055;
        int[] itemp = new int[5];
        int[] itemq =new int[5];
        while(x!=4) {
            out.print("Enter the price of item " +x+ ": ");
            itemp[x-1] = in.nextInt();
            out.print("Enter the quantity of item "+x+": ");
            itemq[x-1] = in.nextInt();
            x++;
        }
        App math = new App();
        double subtotal = math.add(itemp,itemq,x=1);
        double taxed= math.tax(subtotal,tax);
        double total= math.total(subtotal,taxed);
        out.printf(String.format("Subtotal: $%.2f\n",subtotal));
        out.println(String.format("Tax: $%.2f",taxed));
        out.println(String.format("Total: $%.2f",total));
    }
    private double add(int itemp[], int itemq[],int x){
        x=0;
        double sum =0;
        while(x!=4){
            sum += (itemp[x]*itemq[x]);
            x++;
        }
        return sum;
    }
    private double tax(double subtotal, double tax){
        return subtotal*tax;
    }
    private double total(double taxed, double subtotal){
        return subtotal+taxed;
    }
}
