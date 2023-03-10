import java.util.Scanner;

public class InsurancePremiumCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        Car[] cars = new Car[10];  // add upto 10 cars

        int count = 0;
        do {
        	try {
        	
            // read input for a car
            System.out.print("Enter car model: ");
            String model = scanner.nextLine();
            
            System.out.print("Enter car type (Hatchback, Sedan, SUV): ");
            String type = scanner.nextLine();
            if(!type.equals("Hatchback")&& !type.equals("Sedan")&& !type.equals("SUV")) {
            	throw new IllegalArgumentException("Invalid car type :"+type);
            }

            System.out.print("Enter car price: ");
            double price = Double.parseDouble(scanner.nextLine());
            if(price<0) {
            	throw new IllegalArgumentException("Car price cannot be negative.");
            }

            System.out.print("Enter insurance type (Basic, Premium): ");
            String insuranceType = scanner.nextLine();
            if(!insuranceType.equals("Basic")&&!insuranceType.equals("Premium")) {
            	throw new IllegalArgumentException("Invalid insurance type: " + insuranceType);
            }
            

            // create a new Car object and add it to the  car array
            cars[count++] = new Car(model, type, price, insuranceType);

            // ask if the user wants to enter another car
            System.out.print("Do you want to enter details of any other car (y/n): ");
            input = scanner.nextLine();
        	} catch (Exception e) {
        		System.out.println("Error: " +e.getMessage());
        		input="y"; //ask the user to enter input again
        	}
        } while (input.equals("y"));

        // display insurance premium for each car mentioned
        for (int i = 0; i < count; i++) {
            Car car = cars[i];
            double premium = car.calculatePremium();

            System.out.printf("Car model: %s, price: %.2f, insurance premium: %.2f\n",
                    car.getModel(), car.getPrice(), premium);
        }

        scanner.close();
    }
}
