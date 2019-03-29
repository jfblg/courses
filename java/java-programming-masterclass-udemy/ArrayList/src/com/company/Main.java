package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
	// write your code here
        boolean quit = false;
        int choice = 0;
        printInsructions();
        while(!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    printInsructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInsructions() {
        System.out.println("\nPress");
        System.out.println("\t 0 - print help");
        System.out.println("\t 1 - print the list");
        System.out.println("\t 2 - add a new item");
        System.out.println("\t 3 - modify the list");
        System.out.println("\t 4 - remove an item");
        System.out.println("\t 5 - search for an item in the list");
        System.out.println("\t 6 - quit");
    }

    public static void addItem() {
        System.out.print("Enter the item: ");
        String newItem = scanner.nextLine();
        System.out.println("you entered " + newItem);
        scanner.nextLine();
        groceryList.addGroceryItem(newItem);
    }

    public static void modifyItem() {
        System.out.print("Enter item number: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter replacement value: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNo - 1, newItem);
    }

    public static void removeItem() {
        System.out.print("Enter item number: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        groceryList.removeGroceryItem(itemNo - 1);
    }

    public static void searchForItem() {
        System.out.print("Enter the item name: ");
        String searchItem = scanner.nextLine();
        if (groceryList.findItem(searchItem) != null) {
            System.out.println(searchItem + " found in the list");
        } else {
            System.out.println(searchItem + " not found in the list");
        }
    }
}
