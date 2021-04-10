package GraphDFS;

public class Stack {
    private int maxSize;
    private long[] stack;
    private int top;
    
    public Stack(int size) {
        this.maxSize = size;
        stack = new long[maxSize];
        top = -1;
    }
    
    public void push(long value) {
        stack[++top] = value;
    }
    public int pop() {
        return (int) stack[top--];
    }
    public boolean isEmpty() {
        return (top == -1);
    }
}
