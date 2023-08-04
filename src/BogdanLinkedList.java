import java.util.Collections;
import java.util.Comparator;

public class BogdanLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;

    class Node<T> {
        private T value;
        private Node next;
        private Node previous;

        public T getValue() {
            return value;
        }


    }

    public Node findeNode(T value) {
        Node<T> result = null;
        Node<T> curentNode = head;
        while (curentNode != null) {
            if (curentNode.value == value) {
                return curentNode;
            }
            curentNode = curentNode.next;
        }
        return result;
    }

    public void addLast(T value) {
        Node<T> node = new Node<>();
        node.value = value;
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            node.previous = tail;
            tail = node;
        }

    }

    public void add(T value, Node<T> previous) {
        Node<T> next = previous.next;
        Node<T> newNode = new Node<>();
        newNode.value = value;
        previous.next = newNode;
        newNode.previous = next;
        if (next == null) {
            tail = newNode;
        } else {
            next.previous = newNode;
            newNode.next = next;
        }
    }

    public void delete(Node<T> node) {
        Node<T> previous = node.previous;
        Node<T> next = node.next;
        if (previous == null) {
            next.previous = null;
            head = next;
        } else if (next == null) {
            tail = previous;
            previous.next = null;
        } else {
            previous.next = next;
            next.previous = previous;
        }
    }

    public void revers() {
        Node<T> currentNode = head;
        while (currentNode != null) {
            Node next = currentNode.next;
            Node previous = currentNode.previous;
            currentNode.next = previous;
            currentNode.previous = next;
            if (previous == null) {
                tail = currentNode;
            }
            if (next == null) {
                head = currentNode;
            }
            currentNode = next;
        }
    }

    public void show() {
        Node<T> currentNode = head;
        if (head == null) {
            System.out.println("List is empty");
        } else {
            while (currentNode != null) {
                System.out.print(currentNode.getValue() + "  ");
                currentNode = currentNode.next;
            }
        }
    }


}
