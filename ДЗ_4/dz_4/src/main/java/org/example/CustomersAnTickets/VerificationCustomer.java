package org.example.CustomersAnTickets;

import java.util.Scanner;

public class VerificationCustomer
{
    public String verificationCustomerLogin()
    {
        System.out.println("Ведите логин: \n");
        Scanner scanner1 = new Scanner(System.in);
        String text1 = scanner1.nextLine();
        return text1;
    }
    public String verificationCustomerPassword()
    {
        System.out.println("Ведите пароль: \n");
        Scanner scanner2 = new Scanner(System.in);
        String text2 = scanner2.nextLine();
        return text2;
    }
}
