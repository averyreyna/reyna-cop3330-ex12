/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Avery Reyna
 */

package org.example;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // inputs 1 and 2 ask the user about their investment
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the principal: ");
        String inputPrincipal = input.nextLine();

        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter the rate of interest: ");
        String inputInterestRate = input2.nextLine();

        Scanner input3 = new Scanner(System.in);
        System.out.print("Enter the number of years: ");
        int inputYears = Integer.parseInt(input3.nextLine());

        // these are the double versions of the inputted strings to make sure the output is consistent with the ones shown
        double convertedPrincipal = Double.parseDouble(inputPrincipal);
        double covertedInterestRate = Double.parseDouble(inputInterestRate);

        double simpleInterest = Math.ceil(convertedPrincipal * (1 + ((covertedInterestRate / 100) * inputYears)));

        System.out.println(String.format("After %d years at %s%%, the investment will be worth $%.2f.", inputYears, inputInterestRate, simpleInterest));
    }
}