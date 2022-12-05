/*
1. You are required to complete the code of our CustomQueue class. The class should mimic the behaviour of a Queue and implement FIFO semantic.
2. Here is the list of functions that you are supposed to complete
     2.1. add -> Should accept new data if there is space available in the underlying
     array or print "Queue overflow" otherwise.
     2.2. remove -> Should remove and return value according to FIFO, if available or
     print "Queue underflow" otherwise and return -1.
     2.3. peek -> Should return value according to FIFO, if available or print "Queue
     underflow" otherwise and return -1.
     2.4. size -> Should return the number of elements available in the queue.
     2.5. display -> Should print the elements of queue in FIFO manner (space-
     separated) ending with a line-break.
3. Input and Output is managed for you.
 */

public class NormalQueue {
    int[] data;
    int front;
    int size;

    public NormalQueue(int capacity) {
        data = new int[capacity];
        front = 0;
        size = 0;
    }

    int getSize() {
        return size;
    }

    void push(int val) {
        if (size == data.length) {
            System.out.println("Queue Overflow");
        } else {
            int rear = (front + size) % data.length;
            data[rear] = val;
            size++;
        }
    }

    int peek() {
        if (data.length == 0) return -1;
        else data[front];
    }

    int pop() {
        if (data.length == 0) return -1;
        else {
            int val = data[front];
            front = (front + 1) % data.length;ō
            size--;
        }
    }
}