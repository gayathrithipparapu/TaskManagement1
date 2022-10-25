package mx.tc.j2se.tasks;

interface A
{
    ArrayTaskList incoming();

}
interface B
{
   LinkedTaskList incoming();
}



public abstract class AbstractTaskList{
    int size;
    ArrayTaskList arr;
    LinkedTaskList l;
    private mx.tc.j2se.tasks.Task Task;

    public  void add(Task task){

    };
    public void display(){

    };
    public boolean remove(Task task)
    {
        return true;

    };
    public int size()
    {
        return size;
    }
    //abstract int size();
    //abstract void remove();
    //abstract void getTask();
    //abstract void  incoming();
    public Task getTask(int index)
    {

        return Task;

    }





}
