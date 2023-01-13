package com.example.classcompany;

public class Main {

    public static void main(String[] args) {

        Company google = new Company("Google", "CVBFGRT4");
        System.out.println(google.phone);


        Company amazon = new Company("AMZN", "CVBFGRT4", 200.0, "+34555999888");
        System.out.println(amazon.income);
    }
}
