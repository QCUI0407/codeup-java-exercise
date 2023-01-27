import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsLecture {

    public static void main(String[] args) throws Exception {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter a number");
//        try {
//            int userNum = sc.nextInt();
//        }catch (Exception e){
//            System.out.println("Unexpected error");
//        }
//        System.out.println("have a nice day");



        Scanner sc = new Scanner(System.in);
//        String[] colors = {"red", "blue", "green"};
//        int userChoice = 0;
//        try {
//            System.out.println("pick a number between 1-3, your number decides your color...");
//            userChoice = sc.nextInt();
//            System.out.println(colors[userChoice - 1]);
//        }catch (Exception e){
//            System.out.println("invalid input!");
//        }


        String fileName = sc.nextLine();
        if(fileName.equals("myFile")){
            System.out.println(fileName);
        }else{
            throw new IncorrectFileNameException("Incorrect filename : " + fileName);
        }


    }


//    public static String getIndentationPreference() throws Exception {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("What type of indentation do you prefer?");
//        String indentationPreference = sc.nextLine();
//
//        if (indentationPreference.equals("tabs")) {
//            throw new Exception("Spaces are superior!");
//        }
//
//        return indentationPreference;
//    }


}