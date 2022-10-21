package mx.tc.j2se.tasks;
public class Task {
    String title;
    int start;

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

    int end;
    int interval;
    int time;
    boolean status;
    boolean active;
    int current;
    boolean repeated;
    public Task (String title, int time){
        try {
            if (time < 0) {
                throw new IllegalArgumentException();
            }
        }
        catch(Exception e)
        {
            System.out.print("time cannnot be negative");

        }
        // if input time given is negative, exception is thrown.


        this.title=title;
        this.time=time;
        this.repeated=false;
        this.status=true;
    }
    public Task(String title, int start, int end, int interval) {
        try {
            if (start < 0 || end < 0) {
                throw new IllegalArgumentException();
            }
        }
        catch(Exception e)
        {
            System.out.println("time cannnot be negative");
        }
        // if input start or end time given is negative, exception is thrown.
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
        // if interval is zero or is negative, exception is thrown.

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
    public int getTime()
    {
        if(isRepeated())
            return getStartTime();
        return time;
    }
    //returns time if task is not repeated
    public void setTime(int time)
    {
        if(isRepeated())
           repeated=false;
    }
    public int getStartTime()
    {
        if(isRepeated() == false)
            return time;
        return start;
    }
    public int getEndTime(int time)
    {
        if(isRepeated() == false)
            return time;
        return end;
    }
    public int getRepeatInterval()
    {
        if(isRepeated() == false)
            return 0;
        return interval;
    }
    public void setTime(int start, int end, int interval) {
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
    public int nextTimeAfter (int current)
    {

        if((current+interval)<end )
        {
            status=true;
            current = current + interval;
            return current;
        }
        else
        {
            status=false;
            return -1;
        }
    }
}
