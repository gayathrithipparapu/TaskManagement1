package mx.tc.j2se.tasks;
import java.time.LocalDateTime;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
public class Tasks {

    public static Iterator<Task> incoming(Iterator<Task> tasks, LocalDateTime start, LocalDateTime end)
    {

        AbstractTaskList l=new ArrayTaskList() {
            public Iterator<Task> Iterator()
            {
                return super.iterator();
            }
        };

        while (tasks.hasNext())
        {
            Task tmp=tasks.next();
            //System.out.println(tmp.getEndTime()+"  "+end+"   "+tmp.getEndTime().isAfter(end) );
            if(tmp.getEndTime().isAfter(end) && tmp.getStartTime().isBefore(start) )
            {
                l.add(tmp);

            }
        }
        return l.iterator();

    }



}
