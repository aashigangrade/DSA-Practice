import java.util.*;

class Main {
    public static class Node {
        int data;
        Node next;
    }

    public static class LinkedList {
        Node head;
        Node tail;
        int size;

        void addLast(int val) {
            Node temp = new Node();
            temp.data = val;
            temp.next = null;
            if (size == 0) {
                head = tail = temp;
            } else {
                tail.next = temp;
                size++;
            }
            size++;
        }

        public int getSize() {
            return size;
        }

        public void display() {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp -> next;
            }
        }

        public void removeFirst() {
            if (size == 0) {
                return;
            } else if (size == 1) {
                tail = head = null;
                size--;
            } else {
                head = head.next;
                size--;
            }
        }

        public int getFirst() {
            if (size != 0) return head.data;
            return -1;
        }

        public int getLast() {
            if (size != 0) return tail.data;
            return -1;
        }

        public int getAt(int index) {
            Node temp = head;
            int i = 0;
            while (temp != null && i != index) {
                temp = temp.next;
                i++;
            }
            if (temp != null) return temp.data;
            return -1;
        }
    }

    public static void main(String[] args) {

    }
}