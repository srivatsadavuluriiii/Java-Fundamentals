// Java program to create a shopping list using a menu-driven program
// Fri June 08 2024

import java.util.Scanner;

public class shopping_list_using_case_and_rule_switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] shoppingList = new String[5];
        
        // Accepting five items from the user
        System.out.println("Enter 5 items for your shopping list:");
        for (int i = 0; i < shoppingList.length; i++) {
            shoppingList[i] = scanner.nextLine();
        }
        
        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add item at specified location");
            System.out.println("2. Add item at the end of the list");
            System.out.println("3. Delete an item from the list");
            System.out.println("4. Print the contents of the array");
            System.out.println("5. Exit");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            switch (choice) {
                case 1 -> {
                    // Add item at specified location
                    System.out.print("Enter the item to add: ");
                    String newItem = scanner.nextLine();
                    System.out.print("Enter the location (0-4): ");
                    int location = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    if (location >= 0 && location < shoppingList.length) {
                        shoppingList[location] = newItem;
                    } else {
                        System.out.println("Invalid location");
                    }
                }
                case 2 -> {
                    // Add item at the end of the list
                    System.out.print("Enter the item to add: ");
                    String newItem = scanner.nextLine();
                    shoppingList = addItemAtEnd(shoppingList, newItem);
                }
                case 3 -> {
                    // Delete an item from the list
                    System.out.print("Enter the location (0-4) to delete: ");
                    int location = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    if (location >= 0 && location < shoppingList.length) {
                        shoppingList = deleteItem(shoppingList, location);
                    } else {
                        System.out.println("Invalid location");
                    }
                }
                case 4 -> // Print the contents of the array
                    printArray(shoppingList);
                case 5 -> {
                    // Exit
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Invalid choice");
            }
        }
    }
    
    public static String[] addItemAtEnd(String[] array, String item) {
        String[] newArray = new String[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[array.length] = item;
        return newArray;
    }
    
    public static String[] deleteItem(String[] array, int index) {
        if (index < 0 || index >= array.length) {
            System.out.println("Invalid index");
            return array;
        }
        String[] newArray = new String[array.length - 1];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (i != index) {
                newArray[j++] = array[i];
            }
        }
        return newArray;
    }
    
    public static void printArray(String[] array) {
        System.out.println("Shopping List:");
        for (String item : array) {
            System.out.println(item);
        }
    }
}




