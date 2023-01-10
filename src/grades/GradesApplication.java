package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication extends StudentTest{

    public static final HashMap<String, Student> students = new HashMap<>();

    public static final Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        add();

        // build student info
        Student s1 = new Student("AAA");
        s1.addGrade(100);
        s1.addGrade(100);
        s1.addGrade(100);

        Student s2 = new Student("BBB");
        s2.addGrade(200);
        s2.addGrade(200);
        s2.addGrade(200);

        Student s3 = new Student("CCC");
        s3.addGrade(300);
        s3.addGrade(300);
        s3.addGrade(300);

        Student s4 = new Student("DDD");
        s4.addGrade(400);
        s4.addGrade(400);
        s4.addGrade(400);

        // hashmap key
        students.put("GitAAA", s1);
        students.put("GitBBB", s2);
        students.put("GitCCC", s3);
        students.put("GitDDD", s4);

        System.out.println(students);

        boolean flag = true;
        System.out.println("Welcome!");
            System.out.println("Here are the GitHub usernames of our students: ");
            students.forEach((k,v) -> System.out.print(v.getName()+": "+ k + " | "));
        while (flag) {
            System.out.println("\nWhat student would you like to see more information on?");
            String name = SC.nextLine();
            if (students.get(name) == null) {
                System.out.println("Sorry, no student found with the GitHub username of <" + name + ">" +
                        "\nWould you like to see another student?");
            } else {
                System.out.println("Name: " + students.get(name).getName() + ". Average Grade: " + students.get(name).getGradeAverage());
            }
            System.out.println("Continue? [Y/N]");
            String ys = SC.nextLine();
            if (ys.equalsIgnoreCase("y")) {
                flag = true;
            } else {
                System.out.println("Goodbye, and have a wonderful day!");
                flag = false;
            }
        }

    }

}