package fresh;

class Node {

    int value;
    Node next;

    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }
}

public class LinkedList {

    static Node root;
    static Node current;
    static Node header;

    static void addNode(int value) {

        Node newNode = new Node(value, null);

        if (root == null) {

            root = newNode;
            current = root;

        } else {

            current.next = newNode;
            current = current.next;

        }
    }

    static void removeNode(int value) {

        current = root;
        header = current;

        while (current != null) {

            if (current.next != null && current.value != value) {

                current = current.next;
                System.out.println("current.next");

            } else if (current.value == value) {

                current = header;
                current = current.next.next;
                System.out.println("header.next removed: " + header.next.value);
             
                header.next = null;
                   
                break;

            }
                
                header = current;
                System.out.println("header points to current: " + header.value);
            
        }
    }

    static void printList() {

        current = root;

        if (current == null) {

            System.out.println("List is empty!");

        } else {

            while (current != null) {

                System.out.println(current.value);

                current = current.next;

            }
        }
    }

    public static void main(String[] args) {

        addNode(10);
        addNode(20);
        addNode(30);
        addNode(40);
        printList();
        removeNode(20);
        printList();
    }
}
