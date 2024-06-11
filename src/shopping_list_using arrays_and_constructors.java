import java.util.Scanner;

public class ShoppingList {
    private String[] items;

    // Constructor to initialize the array with five items
    public ShoppingList(String[] initialItems) {
        items = new String[5];
        for (int i = 0; i < initialItems.length && i < 5; i++) {
            items[i] = initialItems[i];
        }
    }

    // Method to add an item at a specified location
    public void addItemAtIndex(String item, int index) {
        if (index >= 0 && index < items.length) {
            items[index] = item;
            System.out.println("Item added at index " + index);
        } else {
            System.out.println("Invalid index");
        }
    }

    // Method to add an item at the end of the list
    public void addItemAtEnd(String item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                System.out.println("Item added at the end of the list");
                return;
            }
        }
        System.out.println("List is full, cannot add item at the end");
    }

    // Method to delete an item from the list
    public void deleteItem(String item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null && items[i].equals(item)) {
                items[i] = null;
                System.out.println("Item deleted successfully");
                return;
            }
        }
        System.out.println("Item not found in the list");
    }

    // Method to print the contents of the list
    public void printList() {
        System.out.println("Shopping List:");
        for (String item : items) {
            if (item != null) {
                System.out.println(item);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] initialItems = new String[5];
        
        // Accepting initial items from the command line
        System.out.println("Enter five initial items for the shopping list:");
        for (int i = 0; i < 5; i++) {
            initialItems[i] = scanner.nextLine();
        }
        
        // Creating ShoppingList object with initial items
        ShoppingList shoppingList = new ShoppingList(initialItems);

        // Menu for operations
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add item at specified location");
            System.out.println("2. Add item at the end of the list");
            System.out.println("3. Delete an item");
            System.out.println("4. Print the contents of the list");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter item to add: ");
                    String newItem = scanner.nextLine();
                    System.out.print("Enter index to add item at: ");
                    int index = scanner.nextInt();
                    shoppingList.addItemAtIndex(newItem, index);
                    break;
                case 2:
                    System.out.print("Enter item to add at the end: ");
                    String newItemEnd = scanner.nextLine();
                    shoppingList.addItemAtEnd(newItemEnd);
                    break;
                case 3:
                    System.out.print("Enter item to delete: ");
                    String itemToDelete = scanner.nextLine();
                    shoppingList.deleteItem(itemToDelete);
                    break;
                case 4:
                    shoppingList.printList();
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice, please enter again.");
            }
        }
    }
}

