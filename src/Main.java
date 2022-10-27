import mx.tc.j2se.tasks.*;

import java.time.LocalDateTime;
import java.time.Month;
import  java.time.format.DateTimeFormatter;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {


      //Task t1=new Task("Lunch with beautiful girl",);
      //Task t2=new Task("sleep",12);
      //Task t4=new Task("eat",7);
      //Task t =new Task("sleep",14,20,5);
        Task t1=new Task("Lunch with Beautiful girl", LocalDateTime.of(2022, Month.valueOf("AUGUST"),24,8,15));
        Task t2=new Task("Morning run",LocalDateTime.of(2022, Month.valueOf("MARCH"),1,8,15),LocalDateTime.of(2022, Month.valueOf("SEPTEMBER"),1,8,15),100L);
        //System.out.println(t2.nextTimeAfter(LocalDateTime.of(2022, Month.valueOf("AUGUST"),24,8,15)));
//       t1.setActive(false);
        //System.out.println(t1.getStartTime());
        /**to get next time after */

        // System.out.println(t2.nextTimeAfter(16));

       ArrayTaskList at=new ArrayTaskList();
       /*

        at.add(t1);
        at.add(t2);

        at.remove(t1);
        at.display();
        */

        /*System.out.println(t3.getTask(1).getTitle());
        at.incoming(5,15).display();
        at.getTask(5);
        System.out.println("exception");
        */
       /*LinkedTaskList lt=new LinkedTaskList();
       lt.add(t1);
       lt.add(t2);
       lt.display();
       lt.remove(t2);
       lt.display();
       lt.getTask(0);*/

       /* AbstractTaskList obj1= new ArrayTaskList();
       obj1.add(t1);
       obj1.add(t2);
       obj1.remove(t1);
       System.out.println(obj1.size());
       System.out.println(obj1.getTask(0));
       obj1.display();*/



        //AbstractTaskList obj2= new ArrayTaskList();
        //obj2.add(t2);
        //obj1.display();

       TaskListFactory obj3=new TaskListFactory();

       AbstractTaskList atl=obj3.createTaskList(ListTypes.types.ARRAY);
       atl.add(t1);



        ArrayTaskList t3=new ArrayTaskList();
        t3.add(t1);
        t3.add(t2);
        ArrayTaskList t4=new ArrayTaskList();
        t4.add(t1);
        System.out.println(t3.equals(t4));

        System.out.println(atl.hashCode());
        System.out.println(obj3.hashCode());
        System.out.println(t3.hashCode());

        Tasks ts=new Tasks();



    }

}