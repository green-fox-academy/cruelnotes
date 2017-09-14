import java.util.Scanner;

public class Calculator {

    public static void main(String... args) {
        // Create a simple calculator application which reads the parameters from the prompt
        // and prints the result to the prompt.
        // It should support the following operations:
        // +, -, *, /, % and it should support two operands.
        // The format of the expressions must be: {operation} {operand} {operand}.
        // Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)

        // You can use the Scanner class
        // It should work like this:

        // Start the program
        // It prints: "Please type in the expression:"
        // Waits for the user input
        // Print the result to the prompt
        // Exit

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please type in the expression:");
        String operationOperand = myScanner.nextLine();

        String[] calculatorArray = operationOperand.split(" ");

        String operation;

        operation = calculatorArray[0];
        int operandA = Integer.parseInt(calculatorArray[1]);
        int operandB = Integer.parseInt(calculatorArray[2]);


        switch (operation) {

            case "+":
                System.out.println(operandA + operandB);
                break;
            case "-":
                System.out.println(operandA - operandB);
                break;
            case "/":
                System.out.println(operandA / operandB);
                break;
            case "*":
                System.out.println(operandA * operandB);
                break;
            case "%":
                System.out.println(operandA % operandB);
                break;
            default:
                System.out.println("Invalid operator.");
        }

    }
}