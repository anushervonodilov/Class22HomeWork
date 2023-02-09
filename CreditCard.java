package com.class22HomeWork;

public class CreditCard {

    double balance;
    double interest;

    void calculateInterest(double balance, double interest) {
        this.balance = balance;
        this.interest = interest;
        System.out.println((balance * interest) * 5);
    }

}

class Visa extends CreditCard {

}

class AX extends CreditCard {

    void calculateInterest(double balance, double interest) {
        System.out.println((balance * interest) * 10);
    }

    public static void main(String[] args) {

        CreditCard creditCard = new CreditCard();
        creditCard.calculateInterest(10000, 0.02);
        Visa visa = new Visa();
        visa.calculateInterest(10000, 0.02);
        AX ax = new AX();
        ax.calculateInterest(10000, 0.02);

    }

}
