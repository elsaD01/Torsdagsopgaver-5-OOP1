package Task3;

import Task2.Room;

import java.util.ArrayList;


public class Main {

    static ArrayList<Customer> customers = new ArrayList<>();

    public static void main(String[] args) {
        Customer customer1 = new Customer("Maja", "Jensen", "MajaJ1", 1);
        Customer customer2 = new Customer("Signe", "Hole", "SigneH1", 2);
        Customer customer3 = new Customer("Jeanette", "Kinder", "JeanetteK1", 3);
        Customer customer4 = new Customer("Alba", "Gash", "ALbaG1", 4);
        Customer customer5 = new Customer("Emma", "Parse", "EmmaK1", 5);
        Customer customer6 = new Customer("Liva", "Hjorth", "LivaH1", 6);

        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        customers.add(customer4);
        customers.add(customer5);
        customers.add(customer6);

        printCustomers(customers);
    }

    public static void printCustomers(ArrayList<Customer> customers) {
        for (Customer cus : customers) {
            System.out.println(cus);
        }
    }
}