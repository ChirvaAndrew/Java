package Task2;

import java.util.Comparator;

public class Student {

    private String name;
    private int mark;

    public Student(String name, int mark) {
        this.mark = mark;
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Name: " + name + ", mark: " + mark;
    }
}
