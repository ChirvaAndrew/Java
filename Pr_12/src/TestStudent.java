import java.util.Arrays;
import java.util.Comparator;
import java.util.concurrent.ThreadLocalRandom;

public class TestStudent {
    private static SortingStudentsByGPA comp = new SortingStudentsByGPA();
    public static Student[] qSort(Student[] source, int leftBorder, int rightBorder) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        Object pivot = source[(leftMarker + rightMarker) / 2];
        do {
            while (comp.compare(source[leftMarker], pivot) > 0) {
                leftMarker++;
            }
            while (comp.compare(source[rightMarker], pivot) < 0) {
                rightMarker--;
            }
            if (leftMarker <= rightMarker) {
                if (leftMarker < rightMarker) {
                    Student tmp = source[leftMarker];
                    source[leftMarker] = source[rightMarker];
                    source[rightMarker] = tmp;
                }
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);
        if (leftMarker < rightBorder) {
            source = qSort(source, leftMarker, rightBorder);
        }
        if (leftBorder < rightMarker) {
            source = qSort(source, leftBorder, rightMarker);
        }
        return source;
    }

    public static void mergeSort(Student[] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        Student[] l = new Student[mid];
        Student[] r = new Student[n - mid];

        System.arraycopy(a, 0, l, 0, mid);
        System.arraycopy(a, mid, r, 0, n - mid);
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }
    public static void merge(
            Student[] a, Student[] l, Student[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (comp.compare(l[i], r[j]) <= 0) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }

    public static Student[] generateStudents(int size){
        Student[] students= new Student[size];
        for (int i = 0; i < 10; i++){
            Student student = new Student();
            int randomNum = ThreadLocalRandom.current().nextInt(1, 100);
            student.setScore(randomNum);
            students[i] = student;
        }
        return students;
    }

    public static void printStudents(Student[] students){
        for (Student s : students) {
            System.out.println(s.getScore());
        }
    }
    public static void qSortTest(){
        Student[] students = generateStudents(10);
        System.out.println("До быстрой сортировки");
        printStudents(students);
        students = (qSort(students, 0, students.length-1));
        System.out.println("После быстрой сортировки");
        printStudents(students);
    }

    public static void mSortTest(){
        Student[] students = generateStudents(10);
        System.out.println("До сортировки слиянием");
        printStudents(students);
        mergeSort(students, students.length);
        System.out.println("После сортировки слиянием");
        printStudents(students);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.sort(10);
        qSortTest();
        mSortTest();
    }
}
