package mx.tc.j2se.tasks;
import java.util.Arrays;
import java.util.stream.*;

public class ArrayTaskList extends AbstractTaskList{

    // Define initialcapacity, size of elements of custom ArrayList
    private static final int initialcapacity = 1;
    private int size = 0;
    public Task elementData[] = {};

    /**
     * constructor of ArrayTaskList
     */
    public ArrayTaskList() {
        elementData = new Task[initialcapacity];
    }

    /**
     * add elements in ArrayTaskList
     * Method adds elements in ArrayTaskList.
     */
    public void add(Task task) {
        if (size == elementData.length) {
            ensureCapacity(); // increase current capacity of list,to make it
            // double.
        }
        elementData[size++] = task;
    }


    private void ensureCapacity() {
        int newIncreasedCapacity = elementData.length * 2;
        elementData = Arrays.copyOf(elementData, newIncreasedCapacity);
    }
    public int size()
    {

        return size;
    }

    public boolean remove(Task task)  {


        for (int i = 0; i < size ; i++) {
            boolean flag=false;
            if(elementData[i] == task)
            {
                flag=true;
                for(int k=i;k<size;k++) {

                    elementData[k] = elementData[k+ 1];
                }

            }
            try {
                if (flag = false) {
                    throw new TaskCannotBeFoundException();
                }
            }
            catch(TaskCannotBeFoundException e)
            {
                System.out.println(e.getMessage());
            }

            size--;
            break;
        }
         // reduce size of ArrayListCustom after removal of element.

        return true;
    }

    public Task getTask(int index) {
        // if index is negative or greater than size of size, we throw
        // Exception.
        try {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException();

            }
        }
        catch(Exception e)
        {
            System.out.println("index cannot be negative or greater than size");

        }

        return (Task) elementData[index]; // return value on index.
    }
    public void display() {
        System.out.print("Displaying list : ");
        for (int i = 0; i < size; i++) {
            System.out.println(elementData[i].toString());
        }
    }
    public Stream<Task> getStream()
    {
        return Stream.of(elementData);

    }
    //displays task
    /*public ArrayTaskList incoming(int from, int to)
    {
        ArrayTaskList arr=new ArrayTaskList();
        for(int i=0;i<size;i++)
        {
            if(elementData[i].getStartTime()>=from && to>=elementData[i].getStartTime())
            {
                arr.add(elementData[i]);
            }

        }
        return arr;
    }*/


    //returns tasks of given period of time
}
    /*boolean remove (Task task)
    {
        if(l.contains(task))
        {
            c1++;
            if (c1>= 1)
                l.remove(task);
            return true;
        }
        return false;
    }
    int size()
    {
        return c;
    }
    Task getTask(int index)
    {

        return (Task) l.get(index);
    }
*/


