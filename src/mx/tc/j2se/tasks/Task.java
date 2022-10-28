package mx.tc.j2se.tasks;
import java.time.LocalDateTime;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;

public class Task {
    String title;
    LocalDateTime start;

    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", start=" + start +
                ", end=" + end +
                ", interval=" + interval +
                ", time=" + time +
                ", status=" + status +
                ", active=" + active +
                ", current=" + current +
                ", repeated=" + repeated +
                '}';
    }

    LocalDateTime end;
    Long interval;

    LocalDateTime time;
    boolean status;
    boolean active;
    LocalDateTime current;
    boolean repeated;


    public Task (String title, LocalDateTime time){
        try {
            if (time.getHour()< 0 && time.getHour()<0) {
                throw new IllegalArgumentException();
            }
        }
        catch(Exception e)
        {
            System.out.print("time cannnot be negative");

        }
        /** if input time given is negative, exception is thrown*/


        this.title=title;
        this.time=time;
        this.repeated=false;
        this.status=true;
    }
    public Task(String title, LocalDateTime start, LocalDateTime end, Long interval) {
        try {
            if (start.getHour() < 0 || end.getHour()< 0) {
                throw new IllegalArgumentException();
            }
        }
        catch(Exception e)
        {
            System.out.println("time cannnot be negative");
        }
        /**if input start or end time given is negative, exception is thrown*/
        try
        {
            if(interval<=0)
            {
                throw new IntervalException();
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        /** if interval is zero or is negative, exception is thrown.*/

        this.title=title;
        this.start=start;
        this.end=end;
        this.interval=interval;
        this.repeated=true;
        this.status=true;
    }
    public String getTitle()
    {
        return title;
    }
    // returns title of task
    public void setTitle(String title)
    {
        this.title=title;
    }
    //sets the title
    public boolean isActive()
    {
        return status;
    }
    // returns status of task whether it is active or not active
    public void setActive(boolean active)
    {
        this.status=active;
    }
    // sets status of task to active
    public LocalDateTime getTime()
    {
        if(isRepeated())
            return getStartTime();
        return time;
    }
    //returns time if task is not repeated
    public void setTime(LocalDateTime time)
    {
        if(isRepeated())
           repeated=false;
        else
        {
            this.current=time;
        }

    }
    public LocalDateTime getStartTime()
    {
        if(isRepeated() == false)
            return time;
        return start;
    }
    public LocalDateTime getEndTime()
    {
        if(isRepeated() == false)
            return time;
        return end;
    }
    public Long getRepeatInterval()
    {
        if(isRepeated() == false)
            return Long.valueOf(0);
        return interval;
    }
    public void setTime(LocalDateTime start, LocalDateTime end, Long interval) {
        this.start = start;
        this.end = end;
        this.interval = interval;
        if (isRepeated() == false)
        {
            repeated=true;

        }
    }
    public boolean isRepeated()
    {
        return repeated;

    }
    public LocalDateTime nextTimeAfter (LocalDateTime current)
    {

        if((current.plusHours(interval)).isBefore(end) )
        {
            status=true;
            current = current.plusHours(interval);
            return current;
        }
        else
        {
            status=false;
            return LocalDateTime.parse("-1");
        }
    }


}
