import java.util.LinkedList;
import java.util.Queue;

public class Answer {
    public static void main(String[] args) {
        printBinary(5);
    }
    //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

    public static void printBinary(int n) {
        if (n <= 0) {
            System.out.println();
            return;
        }
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);

        for (int i = 0; i < n; i++) {
            int current = queue.remove();
            System.out.println(current);
            queue.add(current*10);
            queue.add(current*10+1);
        }
        System.out.println();

    }

}
