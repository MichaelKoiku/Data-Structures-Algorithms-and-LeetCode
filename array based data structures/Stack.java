public class Stack {
    int[] storage;
    int top = -1;

    public Stack(int stack_size) {
        this.storage = new int[stack_size];
    }

    public void push(int element) {
        if(isFull() == true) {
            System.out.println("Overflow");
        }
        else{
            top++;
            storage[top] = element;
        }   
    }

    public int pop() {
        if (isEmpty() == true) {
            System.out.println("Underflow");
            return -1;
        }
        else {
            int popped_element = storage[top];
            top--;
            return popped_element;
        } 
    }

    public int peek() {
        return storage[top];
    }

    public boolean isEmpty() {
        if(top == -1) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if(top == storage.length - 1) {
            return true;
        }
        return false;
    }
}