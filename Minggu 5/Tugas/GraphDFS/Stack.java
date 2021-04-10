/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GraphDFS;

/**
 *
 * @author Tony's PC
 */
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
