package com.bridgelabz;

public class Main {
    /*
    Method to find the greatest of three Integers
     */
    public static void findMax(int num1,int num2,int num3){
        int max=num1;
        if (max<num2){
            max=num2;
        }
        if (max<num3){
            max=num3;
        }
        System.out.println("The Greatest Number is:- " +max);
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Test Maximum Program");
        int num1=196,num2=156,num3=659;
        findMax(num1,num2,num3);
    }
}
