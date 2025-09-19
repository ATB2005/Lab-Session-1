import java.util.Scanner;

public class FootballPlayer {
    public static void main(String[] args) {
        // TASK 1
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.print("Enter your age: ");
        byte age = input.nextByte();
        System.out.print("Enter your height (metres): ");
        float heightInMetres = input.nextFloat();
        System.out.print("Enter your weight (pounds): ");
        float weightInPounds = input.nextFloat();
        System.out.print("Enter your jersey number: ");
        byte jerseyNumber = input.nextByte();

        System.out.println(" ");
        System.out.println("Player name - " + name);
        System.out.println("Age - " + age);
        System.out.println("Height - " + heightInMetres + "m");
        System.out.println("Weight - " + weightInPounds + "lbs");
        System.out.println("Jersey Number - " + jerseyNumber);

        //TASK 2
        final float POUND = 0.45359237f;
        final byte METER = 100;

        int weightInKg = (int) (weightInPounds * POUND);
        int heightInCm = (int) (heightInMetres * METER);

        System.out.println(" ");
        System.out.println("Player name - " + name);
        System.out.println("Age - " + age);
        System.out.println("Height - " + heightInCm + "cm");
        System.out.println("Weight - " + weightInKg + "kg");
        System.out.println("Jersey Number - " + jerseyNumber);

        //TASK 3
        System.out.println(" ");
        System.out.println(age);
        age++;
        jerseyNumber--;
        System.out.println(age++);
        System.out.println(jerseyNumber--);

        //Task 4
        boolean isEligible = (age >= 18 && age< 35 && weightInKg <= 90);
        if (isEligible)
            System.out.println("You are eligible");
        if (age < 18 || weightInKg > 90)
            System.out.println("Player has a problem (either too young or too heavy)");
        if (!isEligible)
            System.out.println("You are eligible");





    }
}
