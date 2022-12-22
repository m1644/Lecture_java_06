import java.util.HashSet;
import java.util.Set;

/**
 * Task_01 (HashSet)
 */
public class Task_01 {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1); set.add(12); set.add(123); set.add(1234);
        System.out.println(set);  // [1, 1234, 123, 12]
        System.out.println(set.contains(12));  // true
        set.add(null); System.out.println(set);  // [null, 1, 1234, 123, 12]
        System.out.println(set.size());  // 5
        set.remove(12); System.out.println(set);  // [null, 1, 1234, 123]
        for (var item : set) System.out.println(item + " ");  // null 1 1234 123
        Set<Integer> coll = new HashSet<>();
        coll.addAll(set); System.out.println(coll);  // [null, 1, 1234, 123]
        // Добавляет все элементы из указанной коллекции в этот набор.  
        coll.retainAll(set); System.out.println(coll);  // [null, 1, 1234, 123]
        // Сохраняет только те элементы в этом наборе, которые содержатся в указанной коллекции.
        coll.removeAll(set); System.out.println(coll);  // []
        // Удаляет из этого набора все его элементы
        set.clear(); System.out.println(set);  // []
    }
}
