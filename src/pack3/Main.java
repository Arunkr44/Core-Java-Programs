package pack3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// User class representing both admins and customers
class User {
    private String username;
    private String password;
    private boolean isAdmin;

    public User(String username, String password, boolean isAdmin) {
        this.username = username;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    public String getUsername() {
        return username;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public boolean authenticate(String password) {
        return this.password.equals(password);
    }
}

public class Main {
    private static Map<String, User> users = new HashMap<>();

    public static void main(String[] args) {
        // Create some sample users
        users.put("admin", new User("admin", "admin123", true));
        users.put("customer", new User("customer", "customer123", false));

        Scanner scanner = new Scanner(System.in);

        // Login loop
        while (true) {
            System.out.println("Enter username:");
            String username = scanner.nextLine();
            System.out.println("Enter password:");
            String password = scanner.nextLine();

            User user = users.get(username);
            if (user != null && user.authenticate(password)) {
                if (user.isAdmin()) {
                    System.out.println("Welcome, admin!");
                    // Perform admin tasks
                } else {
                    System.out.println("Welcome, customer!");
                    // Perform customer tasks
                }
                break; // Exit loop after successful login
            } else {
                System.out.println("Invalid username or password. Please try again.");
            }
        }
        scanner.close();
    }
}

