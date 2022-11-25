package Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*Student s1 = new Student("One A.A.", 11);
        Student s2 = new Student("Two B.B.", 31);
        Student s3 = new Student("Three C.C.", 9);
        Student s4 = new Student("Four D.D.", 6);
        Student s5 = new Student("Five E.E.", 4333);
        Student s6 = new Student("Six F.F.", 1);*/

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


        for (int j = 0; j < studentList.length; j++) {
            System.out.println(studentList[j]);
        }
        System.out.println("   ");
        for (int left = 0; left < studentList.length; left++) {
            int value = studentList[left].getiDNumber();
            Student temp = studentList[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < studentList[i].getiDNumber()) {
                    studentList[i + 1] = studentList[i];
                } else {
                    break;
                }
            }
            studentList[i + 1] = temp;
        }
        for (int j = 0; j < studentList.length; j++) {
            System.out.println(studentList[j]);
        }
    }
}
