import java.util.Arrays;
import java.util.HashSet;

/**
 * Task_02 (MathSet)
 */
public class Task_02 {

    public static void main(String[] args) {
        var a = new HashSet<>(Arrays.asList(1,2,3,4,5,6,7));
        System.out.println(a);  // [1, 2, 3, 4, 5, 6, 7]

        var b = new HashSet<>(Arrays.asList(2,3,5,7,8,16,18));
        System.out.println(b);  // [16, 2, 18, 3, 5, 7, 8]

        var u = new HashSet<Integer>(a);    
        System.out.println(u);  // [1, 2, 3, 4, 5, 6, 7]
        u.addAll(b); System.out.println(u);  // [16, 1, 2, 18, 3, 4, 5, 6, 7, 8]

        var r = new HashSet<Integer>(a);
        System.out.println(r);  // [1, 2, 3, 4, 5, 6, 7]
        r.retainAll(b); System.out.println(u);  // [16, 1, 2, 18, 3, 4, 5, 6, 7, 8]

        var s = new HashSet<Integer>(a);
        System.out.println(s);  // [1, 2, 3, 4, 5, 6, 7]
        s.removeAll(b); System.out.println(s);  // [1, 4, 6]
        // Удаляет из этого набора все его элементы, которые содержатся в указанной коллекции.

        boolean res = a.addAll(b);
        System.out.println(res);  // true
    }
}
