package mx.tc.j2se.tasks;

public class LinkedTaskList extends AbstractTaskList{
    Node head; // head of list
    int size=0;

    // Linked list Node.
    // This inner class is made static
    // so that main() can access it
    class Node {

        Task task;
        Node next;

        // Constructor
        public Node(Task task) {
            this.task=task;

        }
        public Task getData() {
            return task;
        }

        public void setData(int data) {
            this.task = task;
        }

        public Node getNextNode() {
            return next;
        }

        public void setNextNode(Node next) {
            this.next = next;
        }
    }
    public void add(Task task)
    {
        // Create a new node with given data


        Node new_node = new Node(task);


        // If the Linked List is empty,
        // then make the new node as head
        if (this.head == null) {
            head = new_node;
        }
        else {
            // Else traverse till the last node
            // and insert the new_node there
            Node current = head;
            while (current.getNextNode() != null) {
                current= current.next;
                size++;

            }

            // Insert the new_node at last node
            current.setNextNode(new_node);
        }

        // Return the list by head

    }
    public int size()
    {
        return size;
    }
    public void display(){
        if(head != null){
            Node current = head;
            while(current.getNextNode() != null){
                System.out.println(current.getData());
                current = current.getNextNode();
            }
            System.out.println(current.getData().toString());
        }
    }

    public boolean remove(Task task1){
        Node tmp = head;
        Node prev=null;
        // If head node to be deleted
        if (tmp != null && tmp.task== task1) {
            head = tmp.next; // Changed head
            return true;
        }

        // Search for the task to be deleted, keep track of
        // the previous node as we need to change temp.next
        while (tmp != null && tmp.task!= task1) {
            prev = tmp;
            tmp = tmp.next;
        }
        // If key was not present in linked list
        if (tmp == null)
            return false;

        // remove the node from linked list
        prev.next = tmp.next;
        return true;

    }

    public Task getTask(int index)
    {
        Node current = head;

        int counter=0;
        while(current.next != null && counter<index) {
            current = current.next;
            counter++;
            if(counter==index)
                break;
        }

        return current.task;
    }
    /*public LinkedTaskList incoming(int from, int to)
    {
        LinkedTaskList larr=new LinkedTaskList();
        Node current=head;
        while(current.next!=null)
        {
            if(current.getData().getStartTime()>=from && to>=current.getData().getStartTime())
            {
                larr.add(current.getData());

            }
        }
        return larr;

    }*/

}
