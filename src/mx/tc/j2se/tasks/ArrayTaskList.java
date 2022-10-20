package mx.tc.j2se.tasks;
import java.util.Arrays;


public class ArrayTaskList<task> {

    // Define INITIAL_CAPACITY, size of elements of custom ArrayList
    private static final int INITIAL_CAPACITY = 10;
    private int size = 0;
    private Task elementData[] = {};

    /**
     * constructor of ArrayTaskList
     */
    public ArrayTaskList() {
        elementData = new Task[INITIAL_CAPACITY];
    }

    /**
     * add elements in ArrayTaskList
     * Method adds elements in ArrayTaskList.
     */
    public void add(Task task) {
        if (size == elementData.length) {
            ensureCapacity(); // increase current capacity of list, make it
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
    public boolean remove(Task task) {
        // if index is negative or greater than size of size, we throw
        // Exception.

        for (int i = 0; i < size ; i++) {
            if(elementData[i] == task)
            {
                for(int k=i;k<size;k++) {

                    elementData[k] = elementData[k+ 1];
                }

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
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size "
                    + index);
        }
        return (Task) elementData[index]; // return value on index.
    }
    public void display() {
        System.out.print("Displaying list : ");
        for (int i = 0; i < size; i++) {
            System.out.println(elementData[i].getTitle()+ " ");
        }
    }
    public void ArrayTaskListincoming(int from, int to)
    {
        for(int i=from;i<=to;i++)
        {
            if(elementData[i].getStartTime()>=from && to<=elementData[i].getStartTime())
            {
                return;

            }

        }
    }
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


