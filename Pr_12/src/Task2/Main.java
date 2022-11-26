package Task2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args){

        /*List<Student> students = new ArrayList<>();
        students.add(new Student("Lavka" , 113));
        students.add(new Student("Bormincev" , 111));
        students.add(new Student("Ivanov" , 12));
        students.add(new Student("Andreev" , 154));
        students.add(new Student("Kuzya" , 3));

        List<Student> students2 = new ArrayList<>();
        students2.add(new Student("Lavka" , 133));
        students2.add(new Student("Bormincev" , 121));
        students2.add(new Student("Ivanov" , 42));
        students2.add(new Student("Andreev" , 110));
        students2.add(new Student("Kuzya" , 4));*/

        //List<Student> students11;


        System.out.println("Введите количество студентов >>");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Student [] studentList = new Student[num];
        String name;
        int id;
        for (int i = 0; i < num; i++) {
            sc.nextLine();
            System.out.println("Введите ФИО студента >> ");
            name = sc.nextLine();
            System.out.println("Введите id студента >> ");
            id = sc.nextInt();
            Student newStudent = new Student(name, id);
            studentList[i] = newStudent;
        }

        SortingStudentsByGPA a = new SortingStudentsByGPA();
        //studentList = a.sort(studentList, 0, studentList.length - 1);
        System.out.println(studentList);

    }

}
