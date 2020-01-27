public class SinglyLinkedList {
    public Node head;

    public SinglyLinkedList() {
        this.head = null;
    }

    // SLL methods go here. As a starter, we will show you how to add a node to the
    // list.
    public void add(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while (runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }

    public void remove() {
        if (head == null)
            return;
        else if (head.next == null)
            head = null;
        else {
            Node previous = head;
            Node runner = head.next;
            while (runner.next != null) {
                previous = runner;
                runner = runner.next;
            }
            previous.next = null;
        }
    }

    public void printValues() {
        Node runner = head;
        while (runner != null) {
            System.out.println(runner.value);
            runner = runner.next;
        }
    }

    public Node find(int value) {
        Node runner = head;
        while (runner != null) {
            if (runner.value == value) break;
            runner = runner.next;
        }
        return runner;
    }

    public void removeAt(int index) {
        if (head == null)
            return;
        else if (index == 0)
            head = head.next;
        else {
            int current = 1;
            Node previous = head;
            Node runner = head.next;
            while (runner != null) {
                if (index == current) {
                    previous.next = runner.next;
                    break;
                }
                previous = runner;
                runner = runner.next;
                ++current;
            }
        }
    }
}