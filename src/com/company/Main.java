package com.company;

public class Main {

    public static void main(String[] args) {
        String str1 = args[0];
        int marks = Integer.parseInt(str1);
        switch (marks) {
            case 90:
                System.out.println("You marks:"+marks+" and rank is A");
                break;
            case 80:
                System.out.println("You marks:"+marks+" and rank is B");
                break;
            case 70:
                System.out.println("You marks:"+marks+" and rank is C");
                break;
            default:
                System.out.println("You marks:"+marks+" and rank is FAIL");
        }
    }
}