package JavaProblems.DataStructure;

import java.util.*;

public class JavaSort {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfStudents = input.nextInt();

        List<Student> students = new ArrayList<>();


        for (int i = 0; i < numberOfStudents; i++) {
            students.add(new Student(input.nextInt(), input.next(), input.nextFloat()));
        }

        System.out.println("Before Sorting: ");
        System.out.println(students);

        System.out.println("After Sorting: ");
        Collections.sort(students, new CheckerComparator());
        students.forEach(student -> System.out.println(student.getName()));

    }
}

class Student {
    private int id;
    private String name;
    private float CGPA;

    public Student(int id, String name, float CGPA) {
        this.id = id;
        this.name = name;
        this.CGPA = CGPA;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getCGPA() {
        return CGPA;
    }

    public void setCGPA(float CGPA) {
        this.CGPA = CGPA;
    }

    @Override
    public String toString() {
        return "StudentInfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", CGPA=" + CGPA +
                '}';
    }
}

class CheckerComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
             int diff = 0;
        if (Math.abs(o1.getCGPA() - o2.getCGPA()) > diff) {
            return o1.getCGPA() < o2.getCGPA() ? 1 : -1;
        } else if (!o1.getName().equals(o2.getName())) {
            return o1.getName().compareTo(o2.getName());
        } else {
            return o1.getId() - o2.getId();
        }
    }
}


