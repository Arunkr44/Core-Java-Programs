package CodinQuiz;

import java.util.Scanner;
public class TemperatureConvet {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;
        
        do {
            double celsius = getValidTemperature(scanner);
            double fahrenheit = convertToCelsius(celsius);
            String category = getCategory(fahrenheit);
            
            System.out.println("Temperature in Fahrenheit: " + fahrenheit);
            System.out.println("Category: " + category);
            
            System.out.println("Do you want to convert another temperature? (yes/no)");
            choice = scanner.next().toLowerCase();
        } while (choice.equals("yes") || choice.equals("y"));
        
        scanner.close();
    }
    
    public static double getValidTemperature(Scanner scanner) {
        double temperature = 0;
        boolean validInput = false;
        
        do {
            System.out.print("Enter temperature in Celsius: ");
            if (scanner.hasNextDouble()) {
                temperature = scanner.nextDouble();
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter a valid numerical value.");
                scanner.next(); 
            }
        } while (!validInput);
        
        return temperature;
    }
    
    public static double convertToCelsius(double celsius) {
        return (9.0 / 5.0) * celsius + 32;
    }
    
    public static String getCategory(double fahrenheit) {
        if (fahrenheit < 32)
            return "Very cold";
        else if (fahrenheit >= 32 && fahrenheit < 50)
            return "Cold";
        else if (fahrenheit >= 50 && fahrenheit < 70)
            return "Mild";
        else
            return "Warm";
    }
}
