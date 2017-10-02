package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<Integer>();
    }

    public String getName() {
        return name;
    }
    public void addGrade(int grade){
        grades.add(grade);
    }
    public double getGradeAverage(){
        double sum = 0;
            for (double grade : grades) {
                sum += grade;
            }
            return sum / grades.size();
        }

    public static void main(String[] args) {
        Student student = new Student("Tomas");
        student.grades.add(50);
        student.grades.add(100);
        student.grades.add(100);
        student.grades.add(98);

        System.out.println(student.getName() + student.getGradeAverage());
    }

}
