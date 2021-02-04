import java.util.Scanner;

public class DoublyLinkedList {
    Scanner scanner = new Scanner(System.in);
    private Node head;
    private Node ptr;
    private Node tail;
    int size;



    public boolean isEmpty(){
        return (head == null);
    }

    public void insertFirst(){

        int data;
        System.out.println("Enter the number to add to Doubly Linked List: ");
        data = scanner.nextInt();
        
        Node temp = new Node();
        temp.next = null;
        temp.prev = null;
        temp.data = data;

        if(isEmpty())
        {
            head = temp;
            tail = temp;
        }
        else{
            head.prev = temp;
            temp.next = head;
            temp.prev = null;
            head = temp;
        }
    }
    public void insertLast()
    {

        int data;
        System.out.println("Enter the number to add to Doubly Linked List: ");
        data = scanner.nextInt();

        Node temp = new Node();
        temp.next = null;
        temp.prev = null;
        temp.data = data;

        if(isEmpty())
        {
            head = temp;
        }
        else{
            ptr = head;
            while(ptr.next != null)
            {
                ptr = ptr.next;
            }
            ptr.next = temp;
            temp.prev = ptr;
        }
        
    }
    public void deleteFirst(){
        if (isEmpty()) {
            System.out.println("List is Empty!");
        }
        else{
            ptr= head;
            head=ptr.next;
            head.prev=null;
        }
    }
    public void deleteLast(){
        
        if(head != null)
        {
            if(head.next == null){
                head = null;
            }
            else
            {
                ptr = head;
                while(ptr.next!= null)
                {
                    ptr=ptr.next;   
                }
               tail = ptr.prev;
               ptr.prev = null;
               tail.next = null;
            }
        }
        
    }
    public void deleteAfter(Node after){

    }
    public void printLinkedList(){
        ptr = head;
        if(isEmpty()){
            System.out.println("List is empty!");
        }
        else{
            System.out.println("List is: ");
            while(ptr != null){
                System.out.print(ptr.data+" ");
                ptr = ptr.next;
            }
        }
    }
    
}
