import com.sun.tools.jconsole.JConsoleContext;

import java.util.Scanner;

public class StringLecture {

    public static void main(String[] args){
        String name = "billy joe";
        String fullName = "billy joe";
        System.out.println("billy joe");
        System.out.println(name);
        //do not worry about hashcode, it is only to show current instance of memory for string object
        System.out.println(name.hashCode());
        //this is not mutating the String
        name = "this is his name " + "jonny bravo";
        name = name.concat("!");
        System.out.println(name);
        System.out.println(name.hashCode());


        Scanner sc = new Scanner(System.in);
        System.out.println("Continue? [y/n]");
        String userInput = sc.nextLine();


        boolean confirmation = userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes");
        System.out.println(confirmation);

        System.out.println("Hi there");
        String dog = "misty fell down today";
        boolean startWith =  dog.startsWith("mis");
        boolean endsWith = dog.endsWith("today");
        System.out.println(startWith);
        System.out.println(endsWith);

        String value = sc.nextLine();
        boolean hiIsTrue = value.startsWith("hello");


        System.out.println(hiIsTrue);




    }

}