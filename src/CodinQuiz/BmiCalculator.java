package CodinQuiz;
/*
 * Write a Java program to create a simple Body Mass Index (BMI) calculator. The program should repeatedly prompt the user to enter their age, gender, height (in meters), and mass (in kilograms). For each input, calculate the BMI using the formula:
BMI= mass/(height^2) 
The program should then display the calculated BMI along with a message indicating the BMI category according to the following scale:

BMI less than 18.5: Underweight
BMI between 18.5 and 24.9: Normal weight
BMI between 25 and 29.9: Overweight
BMI of 30 or greater: Obesity

After processing each set of inputs, ask the user if they want to calculate the BMI for another person. If the user enters 'no' or 'n', exit the loop. If the user enters 'yes' or 'y', continue the loop for the next person.
Ensure that the program handles input validation appropriately (e.g., ensuring that age, height, and mass are positive numbers).
 */
import java.util.Scanner;
public class BmiCalculator {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        String choice;
	        
	        do {
	            int age = getPositiveIntInput(scanner, "Enter your age: ");
	            char gender = getGenderInput(scanner);
	            double height = getPositiveDoubleInput(scanner, "Enter your height in meters: ");
	            double mass = getPositiveDoubleInput(scanner, "Enter your mass in kilograms: ");
	            
	            double bmi = calculateBMI(height, mass);
	            String category = getBMICategory(bmi);
	            
	            System.out.println("Your BMI: " + bmi);
	            System.out.println("BMI Category: " + category);
	            
	            System.out.println("Do you want to calculate BMI for another person? (yes/no)");
	            choice = scanner.next().toLowerCase();
	        } while (choice.equals("yes") || choice.equals("y"));
	        
	        scanner.close();
	    }
	    
	    public static int getPositiveIntInput(Scanner scanner, String message) {
	        int input = 0;
	        boolean validInput = false;
	        
	        do {
	            System.out.print(message);
	            if (scanner.hasNextInt()) {
	                input = scanner.nextInt();
	                if (input > 0)
	                    validInput = true;
	                else
	                    System.out.println("Please enter a positive number.");
	            } else {
	                System.out.println("Invalid input. Please enter a valid integer.");
	                scanner.next(); // Consume the invalid input
	            }
	        } while (!validInput);
	        
	        return input;
	    }
	    
	    public static char getGenderInput(Scanner scanner) {
	        char gender;
	        
	        do {
	            System.out.print("Enter your gender (M/F): ");
	            gender = scanner.next().toUpperCase().charAt(0);
	        } while (gender != 'M' && gender != 'F');
	        
	        return gender;
	    }
	    
	    public static double getPositiveDoubleInput(Scanner scanner, String message) {
	        double input = 0;
	        boolean validInput = false;
	        
	        do {
	            System.out.print(message);
	            if (scanner.hasNextDouble()) {
	                input = scanner.nextDouble();
	                if (input > 0)
	                    validInput = true;
	                else
	                    System.out.println("Please enter a positive number.");
	            } else {
	                System.out.println("Invalid input. Please enter a valid numerical value.");
	                scanner.next(); // Consume the invalid input
	            }
	        } while (!validInput);
	        
	        return input;
	    }
	    
	    public static double calculateBMI(double height, double mass) {
	        return mass / (height * height);
	    }
	    
	    public static String getBMICategory(double bmi) {
	        if (bmi < 18.5)
	            return "Underweight";
	        else if (bmi >= 18.5 && bmi < 25)
	            return "Normal weight";
	        else if (bmi >= 25 && bmi < 30)
	            return "Overweight";
	        else
	            return "Obesity";
	    }
}
