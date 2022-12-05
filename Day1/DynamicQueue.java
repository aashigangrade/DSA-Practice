/*
1. You are required to complete the code of our CustomQueue class. The class should mimic the behaviour of a Queue and implement FIFO semantic.
2. Here is the list of functions that are written in the class
    2.1. add -> Accepts new data if there is space available in the underlying array or
    print "Queue overflow" otherwise.
    2.2. remove -> Removes and returns value according to FIFO, if available or print
    "Queue underflow" otherwise and return -1.
    2.3. peek -> Returns value according to FIFO, if available or print "Queue
     underflow" otherwise and return -1.
    2.4. size -> Returns the number of elements available in the queue.
    2.5. display -> Prints the elements of queue in FIFO manner (space-separated)
    ending with a line-break.
 */

class DynamicQueue {
    int[] data;
    int front;
    int size;

    public DynamicQueue(int capacity) {
        data = new int[capacity];
        front = 0;
        size = 0;
    }

    int getSize() {
        return size;
    }

    void push(int val) {
        if (size == data.length) {
            int[] ndata = new int[2 * size];
            for (int i = 0; i < data.length; i++) {
                int idx = (front + i) % data.length;
                ndata[i] = data[idx];
            }
            data = ndata;
            front = 0;
            int rear = (front + size) % data.length;
            data[rear] = val;
            size++;
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
            front = (front + 1) % data.length;
            ō
            size--;
        }
    }
}