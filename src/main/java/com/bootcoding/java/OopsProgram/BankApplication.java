package com.bootcoding.java.OopsProgram;

public class BankApplication {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.name = "Sruti";
        customer.city = "Bhopal";
        customer.phone = 7023023589L;

        Account account = new Account();
        account.name = "Saving";
        account.balance = 5000.00;
        account.accountNumber = 3456789;

        System.out.println("customer name: " +customer.name);
        System.out.println("customer city: " +customer.city);
        System.out.println("customer phone: " +customer.phone);

        System.out.println(" ");

        System.out.println("Account name: " +account.name);
        System.out.println("Account balance: " +account.balance);
        System.out.println("Account account number: " +account.accountNumber);



    }
}


