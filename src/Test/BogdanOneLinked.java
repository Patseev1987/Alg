package Test;

public class BogdanOneLinked {
    private Node head;

    public void addHead(int value) {

        Node node = new Node();
        node.value = value;
        if (this.head == null) {
            this.head = node;
        } else {
            node.next = this.head;
            this.head = node;
        }
    }

    public void deleteHead() {
        if (head != null) {
            Node temp = head.next;
            head = temp;

        }
    }

    public boolean find(int value) {
        boolean result = false;
        Node currentNode = head;
        while (currentNode != null) {
            if (currentNode.value == value) {
                result = true;
            }
            currentNode = currentNode.next;
        }
        return result;
    }

    public void addLast(int value) {
        Node node = new Node();
        node.value = value;
        Node currentNode = head;
        while (currentNode != null) {
            if (currentNode.next == null) {
                currentNode.next = node;
                break;
            }
            currentNode = currentNode.next;
        }
    }

    public void deleteLast() {
        if (head != null) {
            Node currentNode = head;
            while (currentNode != null) {
                if (currentNode.next.next == null) {
                    currentNode.next = null;
                    break;
                }
                currentNode = currentNode.next;
            }
        }
    }


    public void reverse(Node node, Node previous) {
        if (node.next == null) {
            head = node;
        } else {
            reverse(node.next, node);
        }
        node.next = previous;
        previous.next = null;
    }

    public void reverse() {
        if (head != null && head.next != null) {
            reverse(head.next, head);
        }
    }


    public void reverseCheat() {
        if (head != null && head.next != null) {
            BogdanOneLinked result = new BogdanOneLinked();
            Node node = head;
            while (node != null) {
                result.addHead(node.value);
                node = node.next;
            }
            head = result.head;
            head.next = result.head.next;

        }
    }


    public void show() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            Node node = head;
            while (node != null) {
                System.out.print(node.value + " ");
                node = node.next;
            }
            System.out.println();
        }
    }


    class Node {
        private int value;
        private Node next;
    }
}
