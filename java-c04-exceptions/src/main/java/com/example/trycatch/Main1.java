package com.example.trycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        // try catch
        try {
            long option = scanner.nextLong();
        } catch (InputMismatchException e){
            e.printStackTrace();
        }


        System.out.println("fin");
    }


}
