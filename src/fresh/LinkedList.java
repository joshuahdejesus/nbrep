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

    Node root;
    Node current;

    public void addNode(int value) {

        Node newNode = new Node(value, null);

        if (root == null) {

            root = newNode;
            current = root;

        } else {

            current.next = newNode;
            current = current.next;

        }
    }

    public void printList() {

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
}
