import mx.tc.j2se.tasks.Task;
import mx.tc.j2se.tasks.ArrayTaskList;
public class Main {
    public static void main(String[] args) {

        Task t1=new Task("walk",10);
        Task t2=new Task("sleep",12);
        Task t4=new Task("eat",7);
        /*Task t1=new Task("sleep",14,20,5);
        t1.setActive(false);
        System.out.println(t.getStartTime());
        System.out.println(t1.nextTimeAfter(16));
        */

        ArrayTaskList t3=new ArrayTaskList();
        t3.add(t1);
        t3.add(t2);
        t3.add(t4);
        t3.remove(t1);
        t3.display();
        System.out.print(t3.getTask(1).getTitle());



    }

}