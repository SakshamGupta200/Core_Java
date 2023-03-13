package NS;

class LinkedList
{

    Node head; //points to the initial position of linked list

    class Node {
        int data; //actual value
        Node next; //hold the address of next value

        Node(int value) {
            data = value;
            next = null;
        }
    }

    //Insert data
    LinkedList insertElementAtBottom(LinkedList myLinkedList, int data) {
        //In order to store new data, create new object of Node
        Node node = new Node(data);
        if (myLinkedList.head == null) {
            myLinkedList.head = node;
        } else {
            Node last = myLinkedList.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = node;
        }
        return myLinkedList;
    }

    LinkedList insertElementAtTop(LinkedList myLinkedList, int data) {
        Node node = new Node(data);
        if (myLinkedList.head == null) {
            myLinkedList.head = node;
        } else {
            node.next = myLinkedList.head;
            myLinkedList.head = node;
        }
        return myLinkedList;
    }

    LinkedList deleteElementFromTop(LinkedList myLinkedList) {
        if (myLinkedList.head == null) {
            System.out.println("Linked List is empty");
        } else {
            myLinkedList.head = myLinkedList.head.next;
        }
        return myLinkedList;
    }
    LinkedList deleteElementFromBottom(LinkedList myLinkedList){
        if (myLinkedList.head==null){
            System.out.println("Linked List Is Empty");
        } else {
            Node previous = myLinkedList.head;
            Node last=myLinkedList.head;
            while (last.next != null){
                previous = last;
                last =last.next;
            }
            if (previous == last){
                myLinkedList.head = null;
            } else {
                previous.next = null;
            }
        }
        return myLinkedList;
    }


            void display(LinkedList myLinkedList) {
                if(myLinkedList.head == null) {
                    System.out.println("Linked List is Empty");
                } else {
                    Node node = head;
                    while(node.next != null) {
                        System.out.print(node.data+ ", ");
                        node = node.next;
                    }
                    System.out.println(node.data);
                }
            }

            LinkedList insertElementBefore(LinkedList myLinkedList, int data, int element) {
                Node node = new Node(data);
                if (myLinkedList.head == null) {
                    myLinkedList.head = node;
                } else {
                    Node previous = myLinkedList.head;
                    Node current = myLinkedList.head;
                    while (current.data != element) {
                        previous = current;
                        current = current.next;
                    }
                    if (previous == current) {
                        node.next = myLinkedList.head;
                        myLinkedList.head = node;
                    } else {
                        node.next = current;
                        previous.next = node;
                    }
                }
                return myLinkedList;
            }

            LinkedList deleteElement(LinkedList myLinkedList, int element) {
                if (myLinkedList.head == null) {
                    System.out.println("Linked List is already empty.");
                } else {
                    Node previous = myLinkedList.head;
                    Node current = myLinkedList.head;
                    while (current.data != element) {
                        previous = current;
                        current = current.next;
                    }
                    if (previous == current) {
                        myLinkedList.head = null;
                    } else {
                        previous.next = current.next;
                    }
                }
                return myLinkedList;
            }

        }
public class LinkedListImplementation {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList();
        myLinkedList = myLinkedList.insertElementAtBottom(myLinkedList,9);
        myLinkedList = myLinkedList.insertElementAtBottom(myLinkedList,11);
        myLinkedList = myLinkedList.insertElementAtBottom(myLinkedList,23);
        myLinkedList = myLinkedList.insertElementAtBottom(myLinkedList,56);
        myLinkedList = myLinkedList.insertElementAtTop(myLinkedList,2);
        myLinkedList = myLinkedList.insertElementAtTop(myLinkedList,-66);
        myLinkedList.display(myLinkedList);
        myLinkedList = myLinkedList.deleteElementFromTop(myLinkedList);
        myLinkedList.display(myLinkedList);
        myLinkedList = myLinkedList.deleteElementFromBottom(myLinkedList);
        myLinkedList.display(myLinkedList);
        myLinkedList = myLinkedList.deleteElementFromBottom(myLinkedList);
        myLinkedList.display(myLinkedList);
        myLinkedList = myLinkedList.deleteElementFromBottom(myLinkedList);
        myLinkedList.display(myLinkedList);
        myLinkedList = myLinkedList.deleteElementFromBottom(myLinkedList);
        myLinkedList.display(myLinkedList);
    }
}
