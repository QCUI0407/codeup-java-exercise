import java.util.Scanner;

public class MethodsLecture {

    public static void main(String[] args){
//        int number1 = 5;
//        int number2 = 7;
//
//        System.out.println(add(number1, number2));
//        System.out.println(add("hey ", "dude"));
//        System.out.println(add(1, 2, 3));
//
//        count(10);

        iSpy("griselda", "furry");
    }

    //1. is it private or public? accessibility
    //2. is it static or instance?
    //3. what datatype do I get back from method? returnType
    //4. what is the name? method name
    //5. what parms does my method take? parameters
    //6. what does this function do? code body/block

    //create a method that return an int, named 'add' that takes in two int arguments and return the arguments added.
    public static int add(int num1, int num2){
        return num1 + num2;
    }

    public static String add(String str1, String str2){
        return str1.concat(str2);
    }

    public static int add(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

    public static void count(int n) {
        if (n <= 0) {
            System.out.println("All done!");
            return;
        }
        System.out.println(n);
        count(n - 1);
    }

    public static void iSpy(String objectToFind, String hint){
        System.out.println("Player1: I spy with my little eyes something " + hint.concat("!"));
        Scanner spyaneer = new Scanner(System.in);
        String guess = spyaneer.nextLine();
        System.out.println("Player2: I spy, with my little eyes " + guess);
        if(guess.equalsIgnoreCase(objectToFind)){
            System.out.println("Shucks you win gg no reps!");
            return;
        }
        System.out.println("keep guessing!");
        iSpy(objectToFind, hint);
    }
}