package grades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Collectors;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    private HashMap<String, String> attendance;

    public HashMap<String, String> getAttendance() {
        return attendance;
    }

    public void setAttendance(HashMap<String, String> attendance) {
        this.attendance = attendance;
    }
    public Student(String name, ArrayList<Integer> grades, HashMap<String, String> attendance) {
        this.name = name;
        this.grades = grades;
        this.attendance = attendance;
    }

    public void recordAttendance(String date, String value) {
        attendance.put(date, value);
    }
    private String date;

    public void setDate(String date) {
        this.date = date;
    }

    public Student(String name, String date) {
        this.name = name;
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    // Constructor for new student
    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    public double getGradeAverage() {
        double total = 0;
        for (int i = 0; i < this.grades.size(); i++) {
            total += this.grades.get(i);
        }
        return total / this.grades.size();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grades=" + grades +
                '}';
    }


}