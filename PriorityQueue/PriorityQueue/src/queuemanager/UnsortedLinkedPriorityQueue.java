/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuemanager;

/**
 *
 * @author 07014975
 */
public class UnsortedLinkedPriorityQueue<T> implements PriorityQueue<T> {
    
    /**
     * 
     * @param size 
     */
    private ListNode<T> top;
    
    public UnsortedLinkedPriorityQueue() {
        top = null;
    }
    
    private int size() {
        ListNode<T> node = top;
        int result = 0;
        while (node != null) {
            result = result + 1;
            node = node.getNext();
        }
        return result;
    }
    
    @Override
    public boolean isEmpty() {
        return top == null;
    }
    
    @Override
    public T head() throws QueueUnderflowException {
        if (isEmpty()) {
            throw new QueueUnderflowException();
        }
        return top.getItem();
    }
    
    @Override
    public T pop() throws QueueUnderflowException{
        if (isEmpty()) {
            throw new QueueUnderflowException
        }
        top = top.getNext();
    }
    
    @Override
    public void push (T item) {
        top = new ListNode<>(item, top);
    }
    /*
    public UnsortedLinkedPriorityQueue(int size) {
        storage = new Object[size];
        capacity = size;
        tailIndex = -1;
    }
    
    @Override
    public T head() throws QueueUnderflowException {
        if (isEmpty()) {
            throw new QueueUnderflowException();
        } else {
            return ((PriorityItem<T>) storage[0]).getItem();
        }
        
        /*
        for (int i = 0; i < x; i++) {
        
        
        
    }
    
    @Override
    public void add(T item, int priority) throws QueueOverflowException {
        tailIndex = tailIndex + 1;
        if (tailIndex >= capacity) {
            tailIndex = tailIndex - 1;
            throw new QueueOverflowException();
        } else {
            int i = tailIndex;
            while (i > 0 && ((PriorityItem<T>) storage[i - 1]).getPriority() < priority) {
                storage[i] = storage [i - 1];
                i = i - 1;
            }
            storage[i] = new PriorityItem<>(item, priority);
        }
    }
    
    @Override
    public void remove() throws QueueUnderflowException {
        if (isEmpty()) {
            throw new QueueUnderflowException();
        } else {
            for (int i = 0; i < tailIndex; i++) {
                storage[i] = storage[i + 1];
            }
            tailIndex = tailIndex - 1;
        }
    }
    
    */
    
    @Override
    public String toString() {
        String result = "LinkedStack: size = " + size();
        result += ", contents = [";
        for (ListNode<T> node = top; node != null; node = node.getNext()) {
            if (node != top) {
                result += ", ";
            }
            result += node.getItem();
        }
        result += "], isEmpty() = " + isEmpty();
        if (!isEmpty()) {
            result += ", top() = " + head();
        }
        return result;
    }
}
