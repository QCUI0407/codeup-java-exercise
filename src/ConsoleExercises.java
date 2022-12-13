import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        {
            double pi = 3.14159;
            System.out.format("The value of pi is approximately %.2f.%n", pi);
            Scanner sc = new Scanner(System.in);
            System.out.println("enter a integer");
            long inputInteger = sc.nextInt();
            System.out.println(inputInteger);
            System.out.println("-------------");
            String word1 = sc.next();
            System.out.println("1: " + word1);
            String word2 = sc.next();
            System.out.println("2: " + word2);
            String word3 = sc.next();
            System.out.println("3: " + word3);
            System.out.printf("%s%n%s%n%s%n", word1, word2, word3);


        }
        {
            System.out.println("------------");
            Scanner sc = new Scanner(System.in);
            String sentence = sc.nextLine();
            System.out.println(sentence);
        }
        {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter the length of the classroom: ");
//            int length =Integer.parseInt(scanner.nextLine());
            double length = Double.parseDouble(scanner.nextLine());

            System.out.println("Enter the width of the classroom: ");
//            int width =Integer.parseInt(scanner.nextLine());
            double width = Double.parseDouble(scanner.nextLine());

            double area = length * width;
            double perimeter = (length * 2) + (width * 2);

            System.out.println("The area of the classroom is: " + area);
            System.out.printf("The perimeter of the classroom is: %.0f", perimeter);
        }
        {
            Scanner scanner = new Scanner(System.in);
//            scanner.useDelimiter("\n");
            //https://www.javatpoint.com/post/java-scanner-usedelimiter-method

            System.out.println("Enter the length of the rectangle: ");
            String lengthStr = scanner.nextLine();

            System.out.println("Enter the width of the rectangle: ");
            String widthStr = scanner.nextLine();

            double length = Double.parseDouble(lengthStr);
            double width = Double.parseDouble(widthStr);
            int lengthInt = (int) length;
            int widthInt = (int) width;

            double area = lengthInt * widthInt;


            System.out.println("The area of the classroom is: " + area);
//            System.out.printf("The perimeter of the classroom is: %.0f", perimeter);
        }
    }

}
