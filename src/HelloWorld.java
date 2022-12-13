import java.util.Scanner;
public class HelloWorld {
//    public static void main(String[] args){
//        System.out.println("Hello, World!");
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter---");
//        int num = sc.nextInt();
//    }
//}
    public static void main(String[] args) {
        // Initialize Scanner object
        Scanner scan = new Scanner("Anna Mills/Female/18");
        // initialize the string delimiter
        System.out.println('-');
        scan.useDelimiter("/");
        // Printing the delimiter used
        System.out.println("The delimiter use is "+scan.delimiter());
        // Printing the tokenized Strings
        while(scan.hasNext()){
            System.out.println(scan.next());
        }
        // closing the scanner stream
        scan.close();
    }
}
