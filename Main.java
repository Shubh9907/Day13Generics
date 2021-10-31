package com.bridgelabz;

public class Main {
    /*
    Method to find the greatest of three Integers
     */
    public static void findMaxInteger(int num1,int num2,int num3){
        int max=num1;
        if (max<num2){
            max=num2;
        }
        if (max<num3){
            max=num3;
        }
        System.out.println("The Greatest Integer Number is:- " +max);
    }
    /*
    Method to find the Greatest of three floats
     */
    public static void findMaxFloat(float num1,float num2,float num3){
        float max=num1;
        if (max<num2){
            max=num2;
        }
        if (max<num3){
            max=num3;
        }
        System.out.println("The Greatest Float Number is:- "+max);
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Test Maximum Program");
        int num1=196,num2=156,num3=659;
        findMaxInteger(num1,num2,num3);
        float a=76.7f,b=26.6f,c=98.5f;
        findMaxFloat(a,b,c);
    }
}
