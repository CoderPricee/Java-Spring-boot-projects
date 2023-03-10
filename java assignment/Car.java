public class Car {
    private String model;
    private String type;
    private double price;
    private String insuranceType;

    public Car(String model, String type, double price, String insuranceType) {
        this.model = model;
        this.type = type;
        this.price = price;
        this.insuranceType = insuranceType;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public String getInsuranceType() {
        return insuranceType;
    }
    
    public double calculatePremium() {
        double premium = 0.0;

        switch (type) {
            case "Hatchback":
                premium = 0.05 * price;
                break;
            case "Sedan":
                premium = 0.08 * price;
                break;
            case "SUV":
                premium = 0.10 * price;
                break;
            default:
                throw new IllegalArgumentException("Invalid car type: " + type);
        }

        if (insuranceType.equals("Premium")) {
            premium += 0.2 * premium;
        }

        return premium;
    }
}
