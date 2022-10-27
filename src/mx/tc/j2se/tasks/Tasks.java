package mx.tc.j2se.tasks;
import java.time.LocalDateTime;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
public class Tasks {

    public static Iterator<Task> incoming(Iterator<Task> tasks, LocalDateTime start, LocalDateTime end)
    {

        ArrayTaskList l=new ArrayTaskList() {
            public Iterator<Task> Iterator()
            {
                return super.iterator();

        }
        };
        while (tasks.hasNext())
        {
            if(tasks.next().getStartTime().isAfter(start) && tasks.next().getEndTime().isBefore(end))
            {
                l.add(tasks.next());

            }
        }
        return l.iterator();

    }


}
