import mx.tc.j2se.tasks.*;
import mx.tc.j2se.tasks.AbstractTaskList;
import java.time.LocalDateTime;
import java.time.Month;
import  java.time.format.DateTimeFormatter;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {



        Task t1=new Task("Lunch with Beautiful girl", LocalDateTime.of(2022, Month.valueOf("AUGUST"),24,8,15));
        Task t2=new Task("Morning run",LocalDateTime.of(2022, Month.valueOf("MARCH"),1,8,15),LocalDateTime.of(2022, Month.valueOf("SEPTEMBER"),1,8,15),24L);
        Task t3=new Task("Taking medication",LocalDateTime.of(2022, Month.valueOf("AUGUST"),20,8,15),LocalDateTime.of(2022, Month.valueOf("AUGUST"),28,8,15),12L);
        Task t4=new Task("Meeting with friends", LocalDateTime.of(2022, Month.valueOf("SEPTEMBER"),1,18,0));

        /** ArrayList implementation*/
        // t1.setActive(false);
        /**to get start time  */
        //System.out.println(t1.getStartTime());
        /**to get next time after */
        // System.out.println(t2.nextTimeAfter(LocalDateTime.of(2022, Month.valueOf("AUGUST"),24,8,15)));


       //ArrayTaskList at=new ArrayTaskList();
        /** adding elements to array */
        /*
        at.add(t1);
        at.add(t2);
        */
        /** removing and displaying array */
        /*
        at.remove(t1);
        at.display();
        */
        /**get task of specified index*/
        //System.out.println(t3.getTask(1).getTitle());
        //at.incoming(5,15).display();
        /** if index given is greater than size returns -1*/
        //at.getTask(5);

        /**Linkedlist implementation*/
        /** adding,removing,diplaying,get task */
       /*LinkedTaskList lt=new LinkedTaskList();
       lt.add(t1);
       lt.add(t2);
       lt.display();
       lt.remove(t2);
       lt.display();
       lt.getTask(0);*/
        /**Abstract tasklist implementation of all methods in ArrayTaskList and LinkedTaskList methods*/

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
        /**TaskListFactory Implementation*/

       /* TaskListFactory obj3=new TaskListFactory();
       AbstractTaskList atl=obj3.createTaskList(ListTypes.types.ARRAY);
       */
        /**Implementation of equals and hashcode method*/
        /*ArrayTaskList at1=new ArrayTaskList();
        at1.add(t1);
        ArrayTaskList at2=new ArrayTaskList();
        at2.add(t1);
        System.out.println(at1.equals(at2));
        System.out.println(atl.hashCode());
        System.out.println(obj3.hashCode());
        System.out.println(t3.hashCode());
        */

        AbstractTaskList atl=new ArrayTaskList();
        atl.add(t1);
        atl.add(t2);
        atl.add(t3);
        atl.add(t4);
        Iterator<Task> itr=atl.iterator();


       /** PRINTS VALUES USING ITERATOR*/
        /*while(itr.hasNext())
        {
            //System.out.println("added");
            Task i=(Task)itr.next();
            //System.out.println(i);

        }*/
        /** INCOMING METHOD USING ITERATOR*/
        Iterator<Task> itr1=Tasks.incoming(itr,LocalDateTime.of(2022, Month.valueOf("AUGUST"),25,8,0),LocalDateTime.of(2022, Month.valueOf("AUGUST"),26,8,0));
        while(itr1.hasNext())
        {
            System.out.println(itr1.next().getTitle());
        }



    }

}