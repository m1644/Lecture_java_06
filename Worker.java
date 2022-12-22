/**
 * Task_04_Worker (Worker)
 */
public class Worker {
    int id;
    int salary;
    String firstName;
    String lastName;

    @Override
    public String toString() {
        return String.format("id:%d FName:%s LName:%s s:%d", id, firstName, lastName, salary);
    }

    @Override
    public boolean equals(Object obj) {
        Worker t = (Worker) obj;
        return id == t.id && firstName == t.firstName;
    }

    @Override
    public int hashCode() {    
        return id;
    }
}
