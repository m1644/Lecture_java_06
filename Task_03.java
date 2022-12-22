import java.util.Set;
import java.util.TreeSet;

/**
 * Task_03 (TreeSet)
 */
public class Task_03 {

    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(1); set.add(2); set.add(4); set.add(16);
        set.add(8); set.add(5); set.add(7); set.add(10);
        System.out.println(set);  // [1, 2, 4, 5, 7, 8, 10, 16]
    }
}
