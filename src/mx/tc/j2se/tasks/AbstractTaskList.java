package mx.tc.j2se.tasks;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.stream.*;
import java.util.function.Function;

public abstract class AbstractTaskList {
    int size;
    ArrayTaskList arr;
    LinkedTaskList l;
    LocalDateTime from;
    LocalDateTime to;

    private mx.tc.j2se.tasks.Task Task;


    public void add(Task task) {

    }

    ;

    public void display() {

    }

    ;

    public boolean remove(Task task) {
        return true;

    }

    ;

    public int size() {
        return size;
    }

    //abstract int size();
    //abstract void remove();
    //abstract void getTask();
    //abstract void  incoming();
    public Task getTask(int index) {

        return Task;

    }

    public Iterator<Task> iterator() {
        // OverRiding Default List Iterator //
        Iterator<Task> it = new Iterator<Task>() {
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                // OverRiding Default hasNext  Method//

                return currentIndex < size() && currentIndex!=size();
            }

            @Override
            public Task next() {
                // OverRiding Default next  Method//
                if(hasNext())
                {
                    return getTask(currentIndex++);
                }
                else
                {
                    throw new UnsupportedOperationException();
                }
            }


        };
        return it;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof AbstractTaskList)
        {

        AbstractTaskList tmpList = (AbstractTaskList) obj;
        if (this.size() == 0 && tmpList.size() == 0) {
            return true;
        }
        else if(this.size()==tmpList.size())
        {
            Iterator<Task> l1 = this.iterator();
            Iterator<Task> l2 = this.iterator();
            while (l1.hasNext()) {
                Object obj1 = l1.next();
                Object obj2 = l2.next();
                if (!(obj1 == null ? obj2 == null : obj1.equals(obj2))) {
                    return false;
                }
            }
            return true;
        }
        }
        return false;
    }
    public int hashcode()
    {
        return Objects.hash(size,Task);
    }
    public  Stream<Task> getStream()
    {
        ArrayTaskList a=new ArrayTaskList();
        Stream<Task> s=Stream.of(a.elementData);
        return s;
    }
    public ArrayTaskList incoming(LocalDateTime from,LocalDateTime to)
    {
        ArrayTaskList ar=new ArrayTaskList();
        return null ;
    }


}







