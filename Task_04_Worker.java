import java.util.Arrays;
import java.util.HashSet;

/**
 * Task_04_Worker
 */
public class Task_04_Worker {

    public static void main(String[] args) {

        //#region

        Worker w1 = new Worker();
        w1.firstName = "Иван";
        w1.lastName = "Иванов";
        w1.salary = 1000;
        w1.id = 100;

        Worker w4 = new Worker();
        w4.firstName = "Иван";
        w4.lastName = "Иванов";
        w4.salary = 1000;
        w4.id = 100;

        Worker w2 = new Worker();
        w2.firstName = "Петр";
        w2.lastName = "Петров";
        w2.salary = 2000;
        w2.id = 200;

        Worker w3 = new Worker();
        w3.firstName = "Сидр";
        w3.lastName = "Сидоров";
        w3.salary = 3000;
        w3.id = 300;

        System.out.println(w1);
        System.out.println(w2);
        System.out.println(w3);
        System.out.println(w4);

        //#endregion

        System.out.println(w1==w4);
        System.out.println(w1.equals(w4));
        var workers = new HashSet<Worker>(Arrays.asList(w1,w2,w3));
        System.out.println(workers.contains(w4));
    }
}
