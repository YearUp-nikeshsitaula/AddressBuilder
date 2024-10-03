package com.pluralsight;
import java.util.*;

public class AddressBuilder {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){

        //DECLARE VARIABLES
        //StringBuilder to get constant variables, without needing to print each expression
        StringBuilder skills = new StringBuilder();
        skills.append(promptForString("Full name: "));
        skills.append("\n");
        skills.append("\nBilling Address: \n");
        skills.append(promptForString("\nBilling Street: "));
        skills.append("\n");
        skills.append(promptForString("Billing City: "));
        skills.append(", ");
        skills.append(promptForString("Billing State: "));
        skills.append(" ");
        skills.append(promptForString("Billing Zip: "));
        skills.append("\n");
        skills.append("\n");
        skills.append("Shipping Adress: \n");
        skills.append(promptForString("\nShipping Street: "));
        skills.append("\n");
        skills.append(promptForString("Shipping City: "));
        skills.append(", ");
        skills.append(promptForString("Shipping State: "));
        skills.append(" ");
        skills.append(promptForString("Shipping Zip: "));

        //PRINT
        System.out.println("------------------------------------------");
        String addressBuilder = skills.toString();
        System.out.println(addressBuilder);

    }

    public static String promptForString(String prompt){
        System.out.print(prompt);
        return scanner.nextLine();
    }

}
