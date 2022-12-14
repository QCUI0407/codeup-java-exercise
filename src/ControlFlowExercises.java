import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        {
            int i = 5;
            String outPut = "";
            while (i <= 15) {
                outPut += i + " ";
//                System.out.printf("%s",i);
                i++;
            }
            System.out.println(outPut);
        }

        {
            int i = 0;
            do {
                System.out.println(i);
                i += 2;
            } while (i <= 100);
        }
        {
            int i = 100;
            do {
                System.out.println(i);
                i -= 5;
            } while (i >= -10);
        }
        {
            long i = 2;
            do {
                System.out.println(i);
                i *= i;
            } while (i < 1000000);
        }
        {
            for (int i = 1; i <= 100; i++) {
                if (i % 15 == 0) {
                    System.out.println("FizzBuzz:" + i);
                } else if (i % 3 == 0) {
                    System.out.println("Fizz: " + i);
                } else if (i % 5 == 0) {
                    System.out.println("Buzz: " + i);
                } else {
                    System.out.println(i);
                }
            }
        }
        {
            //Question 3
            Scanner steve = new Scanner(System.in);

            int userInput = 0;
            String playAgain = "y";

            while (playAgain.equalsIgnoreCase("y")) {
                System.out.print("What number would you like to go to?");
                userInput = steve.nextInt();
                System.out.println("Here's Your table! \n");
                System.out.println("number | squared | cubed");
                System.out.println("------ | ------- | -----");
                for (int i = 1; i <= userInput; i++) {
                    if (i < 10) {
                        System.out.println(i + "      | " + i * i + "       | " + i * i * i);
                    } else {
                        System.out.println(i + "     | " + i * i + "      | " + i * i * i);
                    }
                    System.out.println("Would you like to play again?");
                    playAgain = steve.next();
                }
            }
            {
                Scanner sc = new Scanner(System.in);
                System.out.println("What number would you like to go up to?");
                int userInput1 = sc.nextInt();
                System.out.println("Here is your table!" + "\n" + "number | squared | cubed\n------ | ------- | -----");
                for (int i = 1; i < userInput1 + 10; i++) {
                    if (i == userInput1 + 1) {
                        System.out.print("Continue? [Y/N] ");
                        String userContinue = sc.next();
                        if (!userContinue.equalsIgnoreCase("y")) {
                            break;
                        }
                    }
                    if (i < 10) {
                        System.out.println(i + "      | " + i * i + "       | " + i * i * i);
                    } else {
                        System.out.println(i + "     | " + i * i + "      | " + i * i * i);

                    }
                }
            }
            {
                Scanner sc = new Scanner(System.in);
                System.out.print("Do you want to check your Grade?[y/n] ");
                String userContinue = sc.next();
                if (userContinue.equals("y")) {
                    Scanner scoreInput = new Scanner(System.in);
                    System.out.println("What's your number grades?'");
                    int score = scoreInput.nextInt();

                    if (score <= 100 && score >= 88) {
                        System.out.println("AAAAA");
                    } else if (score >= 80 && score <= 87) {
                        System.out.println("BBBB");
                    } else if (score >= 67 && score <= 79) {
                        System.out.println("CCCCCC");
                    } else if (score >= 60 && score <= 66) {
                        System.out.println("DDDDD");
                    } else if (score >= 0 && score <= 59) {
                        System.out.println("FFFFF");
                    } else {
                        System.out.println("Score not acceptable");
                    }
                } else {
                    System.out.println("Bye!");
                }
            }
            {
                // Question 4 - grade chekcer

                Scanner sc = new Scanner(System.in);

                int userInput2 = 0;
                String playAgain2 = "y";

                while (playAgain2.equalsIgnoreCase("y")) {
                    System.out.print("What is you number grade?");
                    userInput2 = steve.nextInt();
                    if (userInput2 >= 0 && userInput2 <= 59) {
                        System.out.println("F");
                    } else if (userInput2 >= 60 && userInput2 <= 66) {
                        System.out.println("D");
                    } else if (userInput2 >= 67 && userInput2 <= 79) {
                        System.out.println("C");
                    } else if (userInput2 >= 80 && userInput2 <= 87) {
                        System.out.println("B");
                    } else if (userInput2 >= 88 && userInput2 <= 100) {
                        System.out.println("A");
                    } else {
                        System.out.print("Not on the grading scale");
                    }

                    System.out.println("Would you like to play again?");
                    playAgain = steve.next();
                }
            }
        }
    }
}

