import java.util.Scanner;


class Bob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String keep = "y";
        while (keep.equalsIgnoreCase("y")){
            System.out.println("Ask question");
            String question = sc.nextLine();
            if(question.endsWith("?")){
                System.out.println("Sure.");
            } else if (question.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (question.isEmpty()) {
                System.out.println("Fine. Be that way!");
            }else {
                System.out.println("Whatever.");
            }
            System.out.println("keep asking?[y/n]");
             keep = sc.nextLine();
        }
    }
}