import java.util.Scanner; // scanner import

public class Calculator {

    public static void addition() { // addition method

         double num1 = getNumbers();
         double num2 = getNumbers();
         double value = num1 + num2;
        System.out.println(num1 + " plus " + num2 + " = " +value );
    }

    public static void subtraction() { // subtraction method
        double num1 = getNumbers();
        double num2 = getNumbers();
        double value = num1 - num2;
        System.out.println(num1 + " minus " + num2 + " = " +value );
    }

    public static void multiplication(){ // multiplication method
        double num1 = getNumbers();
        double num2 = getNumbers();
        double value = num1 * num2;
        System.out.println(num1 + " multiplied by " + num2 + " = " +value );
    }

    public static void division() { // division method

           try { // try catch for division by 0
               double num1 = getNumbers();
               double num2 = getNumbers();
               double value = num1 / num2;
               System.out.println(num1 + " divided by " + num2 + " = " +value );
           }
           catch (ArithmeticException e){
               System.out.println(e);
           }

    }

    public static Double getNumbers() { // user input method
        Double value = null;
        boolean error = true;
        do {
            try {  // try catch for invalid input

                System.out.println("Enter a number Number");
                Scanner Num1 = new Scanner(System.in);
                value = Num1.nextDouble();
                error = false;

            }

            catch (Exception e){
                System.out.println("Invalid input. Please enter a valid number ");
            }
        }

        while (error);


      return value;

    }

    public static void main(String[] args) {


        System.out.println("Basic Calculator");  // main menu
        System.out.println("------------------------" );
        System.out.println("What would you like to do");
        System.out.println("1.Add");
        System.out.println("2.Subtract");
        System.out.println("3.Divide");
        System.out.println("4.Multiply");
        System.out.println("5. Exit");

        Scanner userChoice = new Scanner(System.in);
        String choice = userChoice.next(); // user input

        switch (choice) {
            case "1":
                addition();
                main(args);
            case "2":
                subtraction();
                main(args);
            case "3":
                division();
                main(args);
            case "4":
                multiplication();
                main(args);
            case "5":
                System.exit(0);
            default: {
                System.out.println("Invalid input. Try again");
                main(args);
            }
        }

    }
}