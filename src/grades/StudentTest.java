package grades;


import java.util.Scanner;

public class StudentTest {
    private static final Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        add();
    }

    public static void add() {
        System.out.println("student name");
        String name = SC.nextLine();
        Student student1 = new Student(name);
        boolean flag = true;
        while (flag) {
        System.out.println("add " + student1.getName() + "'s grade");
            int num;
            num = SC.nextInt();
            student1.addGrade(num);
            System.out.println("Add more?[y/n]");
            String ys = SC.next();
            if (ys.equalsIgnoreCase("y")) {
                flag = true;
            } else {
                System.out.println(student1.toString());
                System.out.println(student1.getName() + "'s average grade: " + student1.getGradeAverage());
                flag = false;
            }
        }
    }

}

