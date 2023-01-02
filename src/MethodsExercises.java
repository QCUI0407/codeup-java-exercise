import java.awt.*;
import java.sql.SQLOutput;
import java.util.Formatter;
import java.util.Random;
import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String input = sc.next();
//        System.out.println(Addition(10, 10));
//        Division(10, 5);
//        Subtraction(10, 9);
//        Multiplication(100, 60);
        //=========================
//        getNumber(10,20,sc);
//        getInteger(1, 10);
//        System.out.println(getInteger(1, 10));
        Factorial();

//        System.out.println(dice());
    }


    public static int Addition(int num1, int num2) {
        int add = num1 + num2;
        return add;
    }

    public static void Subtraction(int num1, int num2) {
        int sub = num1 - num2;
        System.out.println(sub);
    }

    public static void Multiplication(int num1, int num2) {
        int mul = num1 * num2;
        System.out.println(mul);
    }

    public static void Division(int num1, int num2) {
        if (num2 != 0) {
            int div = num1 / num2;
            System.out.println(div);

        } else {
            System.out.println("Can not be zero.");
        }
    }

    //=============================================
    public static void getNumber(int min, int max, Scanner sc) {
        max = 20;
        min = 10;
        Random r = new Random();
        int rNum = r.nextInt(10) + 11;
        System.out.println("Enter a number between 10 - 20");
        while (true) {
            int inputNum = sc.nextInt();
            if (inputNum == rNum) {
                System.out.println("Your guess is right!");
                break;
            } else {
                System.out.println("Try it again!");
            }
        }
    }

    public static void getInteger(int min, int max) {
        if (max >= min) {
            System.out.print(min + " ");
            getInteger(min + 1, max);
        }
    }

    //================================
    public static int getInteger1(int min, int max) {
        System.out.println("Enter a number between " + min + " and " + max);
        Scanner scanner = new Scanner(System.in);
        int userInput;
        userInput = scanner.nextInt();
        if (userInput >= min && userInput <= max) {
            return userInput;
        }
        return getInteger1(min, max);
    }

    //======================================

    public static void Factorial() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // prompt 1 to 10
            System.out.print("Enter an integer from 1 to 10: ");
            int n = scanner.nextInt();

            // check
            if (n <= 1 || n >= 10) {
                System.out.println("Invalid input. Please enter an integer from 1 to 10.");
                continue;
            }

            // factorial
            long factorial = 1;
            String layout = "";
            String layout1 = "";

            for (int i = 1; i <= n; i++) {
                factorial *= i;
                String mid = "";
                for (int j = 1; j < i + 1; j++) {
                    // Display the factorial
//                        System.out.println("i: "+i);
//                       System.out.println("j: "+j);
                    if (j == i) {
                        mid += j;
                        System.out.println("test:  " + mid);
                    } else {
                        mid += (j + " * ");
                    }
                    layout1 = j + "!" + " = " + mid;
                   layout = String.format(layout1 + "%+,"+(n-i)*2+"d","= "+factorial);
                    // + " = " + factorial
//                         layout = j+"!" + " = "+ j + "*" +i +" = "+ factorial;
//                        System.out.println(j+"!" + " = "+ j + "*" +i +" = "+ factorial);
                }
                System.out.print(layout);

                System.out.println();
            }

            // continue
            System.out.print("Do you want to continue? (y/n) ");
            String answer = scanner.next();
            if (!answer.equalsIgnoreCase("y")) {
                break;
            }
        }
    }

    //==================================
    public static int dice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("how many sides does your dice have?");
        int sides = scanner.nextInt();
        int dice1 = (int) ((Math.random() * sides) + 1);
        int dice2 = (int) ((Math.random() * sides) + 1);
        return dice1 + dice2;
    }


}

