public class SimpleQueue {
    int[] queue;
    int head, tail = 0;

    public SimpleQueue(int capacity) {
        this.queue = new int[capacity];
    }

    public void enqueue(int element) {
        if (isFull() == true) {
            System.out.println("Overflow");
        }
        else{
            queue[tail] = element;
            tail++;
        }
    }

    public int deque() {

        if(isEmpty() == true) {
            System.out.println("Undeflow");
            return -1;
        }
        else {
            int element = queue[head];

            int i;

            for(i = 0; i < queue.length; i++) {
                queue[i] = queue[i++];
            }
            tail--;
            return element;
        }
    }

    public int peek() {
        return queue[head];
    }

    public boolean isEmpty() {
        if(tail == head) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isFull() {
        if(tail == queue.length - 1) {
            return true;
        }
        else {
            return false;
        }
    }
}
