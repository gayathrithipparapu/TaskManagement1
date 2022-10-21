package mx.tc.j2se.tasks;
public class TaskCannotBeFoundException extends Exception {
    public TaskCannotBeFoundException() {
        System.out.print("cannot find task");
    }
}
