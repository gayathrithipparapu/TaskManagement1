package mx.tc.j2se.tasks;

public class IntervalException extends Exception {
    public IntervalException() {
        System.out.print("interval cannot be zero or less than zero");
    }
}
