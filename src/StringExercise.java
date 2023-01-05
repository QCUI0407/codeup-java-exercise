import java.util.Scanner;

public class StringExercise {
    public static void main(String[] args) {
        String str = "We don't need no education\n" + "We don't need no thought control";
        System.out.println(str);

        String myStr = "Check \"this\" out!, \"s inside of \"s!";
        System.out.println(myStr.replace("inside of", "this"));
        System.out.println(myStr);

        System.out.println("In windows, the main drive is usually C:\\");

        System.out.println("I can do backslashes \\, double backslashes \\\\,\n" +
                "and the amazing triple backslash \\\\\\!");
    }

}


