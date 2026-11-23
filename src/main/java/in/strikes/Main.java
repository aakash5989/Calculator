package in.strikes;


import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("\n ====== Calculator =======");
            System.out.println("Addition");
            System.out.println("Subtraction");
            System.out.println("Multiplication");
            System.out.println("Division");
            System.out.println("Exit");

            System.out.println("Enter Your Choice : ");
            int choice = sc.nextInt();

            if(choice == 5){
                System.out.println("Calculator Closed");
                break;
            }

            System.out.println("Enter First Number");
            double num1 = sc.nextDouble();

            System.out.println("Enter Second Number");
            double num2 = sc.nextDouble();

            switch (choice){
                case 1:
                    System.out.println("Result : "+(num1+num2));
                    break;

                case 2:
                    System.out.println("Result : "+(num1-num2));
                    break;

                case 3:
                    System.out.println("Result : "+(num1*num2));
                    break;

                case 4:
                    if(num2 != 0){
                        System.out.println("Result :"+(num1/num2));
                    }
                    else{
                        System.out.println("Cannot divided by Zero!");
                    }
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }
        sc.close();
    }
}
