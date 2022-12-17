import java.util.Objects;

public class ControlStatementsLec {
    public static void main(String[] args) {
//        double discountPercent = 2.3;
//        boolean discountTrue = Objects.equals(discountPercent, 4.2);
//
//        System.out.printf(" boolean value : %s %n", discountTrue);
//
////        double discountPercent = 2.3;       // equal to a numeric literal
//
//        boolean isLoggedIn = false;
//        boolean isAdmin = false;
//        if (!isLoggedIn || isAdmin) { // user is logged in *and* is an admin
//            // show the admin panel
//            System.out.println("both evaluate to true");
//            System.out.printf("isAdmin value: %s %n", isLoggedIn);
//        }

//        boolean falseCondition = false;
//        boolean trueCondition = true;
//
//        if (falseCondition) {
//            // executes if someCondition is true
//            System.out.println("first statement evaluates to true");
//        } else if (falseCondition) {
//            // executes if someOtherCondition is true *and* all of the previous ifs in
//            // this block were false
//            System.out.println("second statement evaluates to true");
//        } else {
//            // executes if none of the conditions checked in this block were true
//            System.out.println("if both first and second statement evaluate to false, this statement will evaluate true");
//        }

//        int caseSwitch = 1;
//
//        switch (caseSwitch) {
//            case 1:
//                System.out.println("Case 1");
//                // Fall through!
//                break;
//            case 2:
//                System.out.println("Case 2");
//                break;
//            default:
//                System.out.println("Default case");
//                break;
//        }

//        int count = 0;
//        do {
//            System.out.println("You will see this despite the condition!");
//            System.out.printf(" count #: %s %n", count);
//            count++;
//        }
//        while (/* condition */ count <= 5);

//        for(int i = 0; i < 10; i += 1) {
//            System.out.println("i is " + i);
//        }

        // print the numbers 1 through 5

//        for(int i = 1; i < 20; i++) {
//            System.out.println(i);
//            if (i == 5) {
//                break; // --------------+
//            } //                        |
//        } //                            |
//// <----------------------------+


        for(int i = 1; i <= 50; i++) { // <--+
            if(i % 5 == 0) { //              |
                continue; // ----------------+
            }
            System.out.println(i);
        }

    }
}