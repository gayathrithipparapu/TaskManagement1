package mx.tc.j2se.tasks;

public class LinkedTaskList {
    Node head; // head of list

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

            }

            // Insert the new_node at last node
            current.setNextNode(new_node);
        }

        // Return the list by head

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

    public void remove(Task task1){
        Node tmp = head;
        Node prev=null;
        // If head node to be deleted
        if (tmp != null && tmp.task== task1) {
            head = tmp.next; // Changed head
            return;
        }

        // Search for the task to be deleted, keep track of
        // the previous node as we need to change temp.next
        while (tmp != null && tmp.task!= task1) {
            prev = tmp;
            tmp = tmp.next;
        }
        // If key was not present in linked list
        if (tmp == null)
            return;

        // remove the node from linked list
        prev.next = tmp.next;

    }

    public void getTask(int index)
    {
        Node current = head;

        int counter=0;
        while(current.next != null && counter<index) {
            current = current.next;
            counter++;
            if(counter==index)
                break;
        }

        System.out.println("task at index "+ index+" is "+ current.task);
    }

}
