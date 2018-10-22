package com.company;

public class Main {
    public static void main(String[] args) {
        printMenu();
    }



    private static void printMenu() {
        System.out.println("----------Menu----------");
        for (int i = 0; i < Menu.Menu.length; i++) {
            System.out.println(Menu.Menu[i]);
        }
    }
}
