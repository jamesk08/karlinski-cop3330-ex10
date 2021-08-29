/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 James Karlinski
 */

package org.example;

import java.text.MessageFormat;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        int item1Price = GetNumberInput("Enter the price of item 1: ");
        int item1Count = GetNumberInput("Enter the quantity of item 1: ");

        int item2Price = GetNumberInput("Enter the price of item 2: ");
        int item2Count = GetNumberInput("Enter the quantity of item 2: ");

        int item3Price = GetNumberInput("Enter the price of item 3: ");
        int item3Count = GetNumberInput("Enter the quantity of item 3: ");

        int item1Total = GetItemTotal(item1Price, item1Count);
        int item2Total = GetItemTotal(item2Price, item2Count);
        int item3Total = GetItemTotal(item3Price, item3Count);

        double subtotal = GetSubtotal(item1Total, item2Total, item3Total);
        final double TAX_RATE = 0.055;
        double tax = subtotal * TAX_RATE;
        double total = subtotal + tax;

        System.out.println(MessageFormat.format("Subtotal: ${0}", subtotal));
        System.out.println(MessageFormat.format("Tax: ${0}", tax));
        System.out.println(MessageFormat.format("Total: ${0}", total));
    }

    public static int GetNumberInput(String message)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        String userInput = scanner.nextLine();
        return Integer.parseInt(userInput);
    }

    public static int GetItemTotal(int price, int count){
        return price * count;
    }

    public static int GetSubtotal(int item1Total, int item2Total, int item3Total){
        return item1Total + item2Total + item3Total;
    }
}
