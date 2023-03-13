package NS;

class CircularLinkedList {

    Node head;
    class Node {
        int data;
        Node next;

        Node(int value) {
            data = value;
            next = null;
        }
    }

    CircularLinkedList insertElementFromTop(CircularLinkedList myLinkedList, int data) {
        Node node = new Node(data);
        if(myLinkedList.head == null) {
            myLinkedList.head = node;
            node.next = myLinkedList.head;
        } else {
            Node last = myLinkedList.head;
            while(last.next != head) {
                last = last.next;
            }
            node.next = myLinkedList.head;
            last.next = node;
            myLinkedList.head = node;
        }
        return myLinkedList;
    }

    CircularLinkedList insertElementFromBottom(CircularLinkedList myLinkedList, int data) {
        Node node = new Node(data);
        if(myLinkedList.head == null) {
            myLinkedList.head = node;
            node.next = myLinkedList.head;
        } else {
            Node last = myLinkedList.head;
            while(last.next != myLinkedList.head) {
                last = last.next;
            }
            last.next = node;
            node.next = myLinkedList.head;
        }
        return myLinkedList;
    }

    CircularLinkedList deleteElementFromTop(CircularLinkedList myLinkedList) {
        if(myLinkedList.head == null) {
            System.out.println("Linked List is already empty.");
        } else if(myLinkedList.head.next == myLinkedList.head) {
            myLinkedList.head = null;
        } else {
            Node last = myLinkedList.head;
            while(last.next != myLinkedList.head) {
                last = last.next;
            }
            myLinkedList.head = myLinkedList.head.next;
            last.next = myLinkedList.head;
        }
        return myLinkedList;
    }

    CircularLinkedList deleteElementFromBottom(CircularLinkedList myLinkedList) {
        if(myLinkedList.head == null) {
            System.out.println("Linked List is already empty.");
        } else if(myLinkedList.head.next == myLinkedList.head) {
            myLinkedList.head = null;
        } else {
            Node last = myLinkedList.head;
            Node previous = null;
            while(last.next != myLinkedList.head) {
                previous = last;
                last = last.next;
            }
            previous.next = myLinkedList.head;
        }
        return myLinkedList;
    }

    CircularLinkedList insertElementAfter(CircularLinkedList myLinkedList, int data, int element) {
        Node node = new Node(data);
        Node currentNode = myLinkedList.head;
        Node afterNode = myLinkedList.head.next;
        while(currentNode.data != element && currentNode.next != head) {
            currentNode = currentNode.next;
            afterNode = currentNode.next;
        }
        currentNode.next = node;
        node.next = afterNode;
        return myLinkedList;
    }
    void display(CircularLinkedList myLinkedList) {
        if(myLinkedList.head == null) {
            System.out.println("Linked List is empty.");
        } else {
            Node last = myLinkedList.head;
            while(last.next != myLinkedList.head) {
                System.out.print(last.data+", ");
                last = last.next;
            }
            System.out.print(last.data);
        }
    }
}

public class CircularLinkedListImplementation {
    public static void main(String[] args) {
        CircularLinkedList myLinkedList = new CircularLinkedList();
        myLinkedList = myLinkedList.insertElementFromBottom(myLinkedList, 9);
        myLinkedList = myLinkedList.insertElementFromBottom(myLinkedList, 11);
        myLinkedList = myLinkedList.insertElementFromBottom(myLinkedList, 23);
        myLinkedList = myLinkedList.insertElementFromBottom(myLinkedList, 56);
        myLinkedList.display(myLinkedList);
        myLinkedList = myLinkedList.insertElementAfter(myLinkedList, 46, 23);
        System.out.println();
        myLinkedList.display(myLinkedList);
    }
}

