import mx.tc.j2se.tasks.IntervalException;
import mx.tc.j2se.tasks.LinkedTaskList;
import mx.tc.j2se.tasks.Task;
import mx.tc.j2se.tasks.ArrayTaskList;
public class Main {
    public static void main(String[] args) throws IntervalException {

        Task t1=new Task("walk",10);
        Task t2=new Task("sleep",12);
        Task t4=new Task("eat",7);
        Task t =new Task("sleep",14,20,5);
        t.setActive(false);
        System.out.println(t.getStartTime());
        System.out.println(t.nextTimeAfter(16));
        ArrayTaskList t3=new ArrayTaskList();
        t3.add(t);
        t3.add(t2);
        t3.add(t4);
        /*t3.remove(t1);
        t3.display();*/

        System.out.println(t3.getTask(1).getTitle());
        t3.incoming(5,15).display();
        t3.getTask(5);
        System.out.println("exception");

        LinkedTaskList t5=new LinkedTaskList();
        t5.add(t1);
        t5.add(t2);
        //t5.display();
        //t5.remove(t2);
        //t5.display();
        t5.getTask(0);




    }

}