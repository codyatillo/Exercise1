package Exercise;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First number: ");
        double firstNum = scanner.nextDouble();
        System.out.println("Enter Second number: ");
        double secondNum = scanner.nextDouble();

        System.out.println("Select an option");
        System.out.println("1 - Add");
        System.out.println("2 - Subtract");
        System.out.println("3 - Multiply");
        System.out.println("4 - Divide");

        int selectionNum = scanner.nextInt();

        while(selectionNum < 1 || selectionNum > 4){
            System.out.println("Invalid input select operation between 1 - 4");
            selectionNum = scanner.nextInt();
        }
        if(selectionNum == 1){
            System.out.println();
            System.out.println("1 was selected");
            System.out.println("Sum of the numbers = " + (firstNum+secondNum));
        }else if(selectionNum == 2){
            System.out.println();
            System.out.println("2 Was selected");
            System.out.println("Difference of the numbers = " + (firstNum - secondNum));
        }else if(selectionNum == 3) {
            System.out.println();
            System.out.println("3 was selected");
            System.out.println("Numbers multiplied = " + (firstNum*secondNum));
        }else if(selectionNum == 4){
            System.out.println();
            System.out.println("4 was selected");
            System.out.println("Numbers Divided = " + (firstNum/secondNum));
        }
    }
}
