import java.util.*;

public class Game {
    public static Stack pushBefore(Stack<Integer> st, int a, int b) {
        Stack<Integer> temp = new Stack<>();
        while (!st.empty())
            temp.push(st.pop());
        st.push(b);
        st.push(a);
        while (!temp.empty())
            st.push(temp.pop());
        return st;
    }

    public static Queue popQ(Queue<Integer> q) {
        Queue<Integer> temp = new LinkedList<>();
        int n = q.size();
        for (int i = 0; i < n - 1; i++)
            temp.add(q.remove());
        return temp;
    }

    public static Queue pushBeforeQ(Queue<Integer> q, int a, int b) {
        Queue<Integer> temp = new LinkedList<>();
        while (!q.isEmpty())
            temp.add(q.remove());
        q.add(b);
        q.add(a);
        while (!temp.isEmpty())
            q.add(temp.remove());
        return q;
    }

    public void taskOne() {
        System.out.println("Задание 1.");
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите карты первого игрока: ");
        for (int i = 0; i < 5; i++)
            st1.push(sc.nextInt());
        System.out.println("Введите карты второго игрока: ");
        for (int i = 0; i < 5; i++)
            st2.push(sc.nextInt());
        int cntMoves = 0;
        while (!st1.empty() && !st2.empty()) {
            int a = st1.pop();
            int b = st2.pop();
            if (a == 0 && b == 9)
                st1 = pushBefore(st1, a, b);
            else if (b == 0 && a == 9)
                st2 = pushBefore(st2, a, b);
            else if (a < b)
                st2 = pushBefore(st2, a, b);
            else
                st1 = pushBefore(st1, a, b);
            if (cntMoves >= 106) {
                System.out.println("botva");
                break;
            }
            cntMoves++;
        }
        System.out.println(st1);
        System.out.println(st2);
        if (st1.empty())
            System.out.println("second " + cntMoves);
        else if (st2.empty())
            System.out.println("first " + cntMoves);
    }

    public void taskTwo() {
        System.out.println("Задание 2.");
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите карты первого игрока: ");
        for (int i = 0; i < 5; i++)
            q1.add(sc.nextInt());
        System.out.println("Введите карты второго игрока: ");
        for (int i = 0; i < 5; i++)
            q2.add(sc.nextInt());
        int cntMoves = 0;
        while (!q1.isEmpty() && !q2.isEmpty()) {
            Queue<Integer> temp = new LinkedList<>();
            temp = popQ(q1);
            int a = q1.remove();
            q1 = temp;
            temp = popQ(q2);
            int b = q2.remove();
            q2 = temp;
            if (a == 0 && b == 9) {
                q1 = pushBeforeQ(q1, a, b);
            } else if (b == 0 && a == 9) {
                q2 = pushBeforeQ(q2, a, b);
            } else if (a < b) {
                q2 = pushBeforeQ(q2, a, b);
            } else {
                q1 = pushBeforeQ(q1, a, b);
            }
            if (cntMoves >= 106) {
                System.out.println("botva");
                break;
            }
            cntMoves++;
        }
        System.out.println(q1);
        System.out.println(q2);
        if (q1.isEmpty())
            System.out.println("second " + cntMoves);
        else if (q2.isEmpty())
            System.out.println("first " + cntMoves);
    }

    public void taskThree() {
        System.out.println("Задание 3.");
        Deque<Integer> dq1 = new LinkedList<>();
        Deque<Integer> dq2 = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите карты первого игрока: ");
        for (int i = 0; i < 5; i++)
            dq1.addLast(sc.nextInt());
        System.out.println("Введите карты второго игрока: ");
        for (int i = 0; i < 5; i++)
            dq2.addLast(sc.nextInt());
        int cntMoves = 0;
        while (!dq1.isEmpty() && !dq2.isEmpty()) {
            int a = dq1.pollLast();
            int b = dq2.pollLast();
            if (a == 0 && b == 9) {
                dq1.addFirst(a);
                dq1.addFirst(b);
            } else if (b == 0 && a == 9) {
                dq2.addFirst(a);
                dq2.addFirst(b);
            } else if (a < b) {
                dq2.addFirst(a);
                dq2.addFirst(b);
            } else {
                dq1.addFirst(a);
                dq1.addFirst(b);
            }
            if (cntMoves >= 106) {
                System.out.println("botva");
                break;
            }
            cntMoves++;
        }
        System.out.println(dq1);
        System.out.println(dq2);
        if (dq1.isEmpty())
            System.out.println("second " + cntMoves);
        else if (dq2.isEmpty())
            System.out.println("first " + cntMoves);
    }
}
