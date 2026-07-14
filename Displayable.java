import java.util.Scanner;

// Custom Exception
class UserValidationException extends Exception {
    public UserValidationException(String message) {
        super(message);
    }
}

// Interface
interface CardOperations {
    void useCard(double amount);
    void payCredit(double amount);
}

// Superclass
class CardCustomer implements CardOperations {
    String name, city, vehicleType;
    int age;
    double income;
    double creditLimit = 50000;
    double creditAmount = 0;

    CardCustomer(String name, int age, double income, String city, String vehicleType) throws UserValidationException {
        this.name = name;
        this.age = age;
        this.income = income;
        this.city = city;
        this.vehicleType = vehicleType;

        validateUser();
    }

    public void validateUser() throws UserValidationException {
        if (age < 18 || age > 55)
            throw new UserValidationException("Age must be between 18 and 55.");
        if (income < 50000 || income > 100000)
            throw new UserValidationException("Income must be between ₹50,000 and ₹1,00,000.");
        if (!(city.equalsIgnoreCase("Pune") || city.equalsIgnoreCase("Mumbai") || 
              city.equalsIgnoreCase("Bangalore") || city.equalsIgnoreCase("Chennai")))
            throw new UserValidationException("City must be Pune, Mumbai, Bangalore, or Chennai.");
        if (!vehicleType.equalsIgnoreCase("4-wheeler"))
            throw new UserValidationException("User must own a 4-wheeler.");
    }

    public void useCard(double amount) {
        if (creditAmount + amount <= creditLimit) {
            creditAmount += amount;
            System.out.println("Card used for ₹" + amount + ". Total credit used: ₹" + creditAmount);
        } else {
            System.out.println("Cannot exceed credit limit of ₹" + creditLimit);
        }
    }

    public void payCredit(double amount) {
        if (amount <= creditAmount) {
            creditAmount -= amount;
            System.out.println("Paid ₹" + amount + ". Remaining credit: ₹" + creditAmount);
        } else {
            System.out.println("You are trying to pay more than you owe!");
        }
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Income: ₹" + income);
        System.out.println("City: " + city);
        System.out.println("Vehicle: " + vehicleType);
        System.out.println("Credit Limit: ₹" + creditLimit);
        System.out.println("Credit Used: ₹" + creditAmount);
    }
}

// Subclass with extended limit
class GoldCardCustomer extends CardCustomer {
    int increaseCount = 0;

    GoldCardCustomer(String name, int age, double income, String city, String vehicleType) throws UserValidationException {
        super(name, age, income, city, vehicleType);
    }

    public void increaseLimit(double amount) {
        if (increaseCount < 3 && amount <= 5000) {
            creditLimit += amount;
            increaseCount++;
            System.out.println("Credit limit increased by ₹" + amount + ". New limit: ₹" + creditLimit);
        } else {
            System.out.println("Limit increase failed. You can increase up to 3 times, ₹5000 max each.");
        }
    }
}
