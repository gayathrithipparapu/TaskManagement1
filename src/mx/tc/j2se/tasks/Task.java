package mx.tc.j2se.tasks;
public class Task {
    String title;
    int start;
    int end;
    int interval;
    int time;
    boolean status;
    boolean active;
    int current;
    boolean repeated;
    public Task (String title, int time)
    {
        this.title=title;
        this.time=time;
        this.repeated=false;
        this.status=true;
    }
    public Task(String title, int start, int end, int interval)
    {
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
    public void setTitle(String title)
    {
        this.title=title;
    }
    public boolean isActive()
    {
        return status;
    }
    public void setActive(boolean active)
    {
        this.active=active;
    }
    public int getTime()
    {
        if(isRepeated())
            return getStartTime();
        return time;
    }
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
