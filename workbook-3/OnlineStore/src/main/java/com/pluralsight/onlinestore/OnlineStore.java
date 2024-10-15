package com.pluralsight.onlinestore;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public static void main(String[] args) {
    String filePath = "src/main/Products"; // Update this path

    try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    class StoreApplication {
        private List<Products> products;
        private List<Products> cart;

        public StoreApplication() {
            ArrayList<Products> products = new ArrayList<>();
            ArrayList<Products> cart = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);


        }

        public void displayHomeScreen() {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("""
                        Welcome to the Online Store!
                        """);

                System.out.println("""
                        Choose an option:
                        A. Products
                        B. Cart
                        C. Exit
                        """);
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        displayProducts();
                        break;
                    case 2:
                        displayCart();
                        break;
                    case 3:
                        System.out.println("Exiting...");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            }
        }

        private void displayProducts() {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("""
                        Available Products:
                        A. Search Products
                        B. Go back
                        C. Add to cart""");

                double choice = scanner.nextInt();
                if (choice >= 1 && choice <= products.size()) {
                    cart.add(products.get((int) (choice - 1)));
                    System.out.println(products.get((int) (choice - 1)).getName() + " has been added to your cart.");
                } else if (choice == 4) {
                    searchProducts();
                } else if (choice == 5) {
                    return;
                } else {
                    System.out.println("Invalid option. Please try again.");
                }
            }
        }

        private void searchProducts() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter product name, price, or department to search: ");
            String query = scanner.nextLine().toLowerCase();

            System.out.println("Search Results:");
            for (Products product : products) {
                if (product.getName().toLowerCase().contains(query) ||
                        String.valueOf(product.getPrice()).contains(query) ||
                        product.getDepartment().toLowerCase().contains(query)) {
                    System.out.println(product);
                }
            }
        }

        private void displayCart() {
            Scanner scanner = new Scanner(System.in);
            if (cart.isEmpty()) {
                System.out.println("Your cart is empty.");
                return;
            }
            System.out.println("Items in your cart:");
            double total = 0;
            for (Products item : cart) {
                System.out.println(item);
                total += item.getPrice();
            }

            System.out.println("1. Check Out");
            System.out.println("2. Remove Product from Cart");
            System.out.println("3. Go Back to Home Screen");
            System.out.print("Choose an option: ");

            double choice = scanner.nextInt();
            switch ((int) choice) {
                case 2:
                    removeProductFromCart();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        private void removeProductFromCart() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Select a product to remove from cart:");
            for (int i = 0; i < cart.size(); i++) {
                System.out.println((i + 1) + ". " + cart.get(i));
            }
            System.out.print("Choose a product number to remove: ");
            int choice = scanner.nextInt();
            if (choice >= 1 && choice <= cart.size()) {
                Products removedProducts = cart.remove(choice - 1);
                System.out.println(removedProducts.getName() + " has been removed from your cart.");
            } else {
                System.out.println("Invalid product number.");
            }
        }

        public static void main(String[] args) {
            StoreApplication storeApp = new StoreApplication();
            storeApp.displayHomeScreen();
        }
    }
}