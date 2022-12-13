import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        {
            int i = 5;
            String outPut = "";
            while (i <= 15) {
                outPut += i + " ";
                i++;
            }
            System.out.println(outPut);
        }

        {
            int i = 0;
            do {
                System.out.println(i);
                i+=2;
            }while(i<=100);
        }
        {
            int i = 100;
            do{
                System.out.println(i);
                i-=5;
            }while (i>=-10);
        }
        {
            long i = 2;
            do{
                System.out.println(i);
                i *= i;
            }while (i < 1000000);
        }
        {
            for (int i = 1; i <= 100; i++) {
                if (i % 3 == 0) {
                    if (i % 5 == 0) {
                        System.out.println("FizzBuzz:" + i);
                    }
                    System.out.println("Fizz: " + i);
                } else if (i % 5 == 0) {
                    System.out.println("Buzz: " + i);
                }
            }
        }
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("What number would you like to go up to?");
            int userInput = sc.nextInt();
            System.out.println("Here is your table!" + "\n" + "number | squared | cubed\n------ | ------- | -----");
            for (int i = 1; i < userInput + 10; i++) {
                if (i == userInput + 1) {
                    System.out.print("Continue? [y/N] ");
                    String userContinue = sc.next();
                    if (!userContinue.equals("y")) {
                        break;
                    }
                }
                System.out.println(i + "      | " + i * i + "       | " + i * i * i);
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
                    }else {
                        System.out.println("Bye!");
                    }
        }
    }
}

