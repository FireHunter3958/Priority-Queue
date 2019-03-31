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
public class UnsortedArrayPriorityQueue<T> implements PriorityQueue<T> {
    
    /**
     * Where data is stored
     */
    private final Object[] storage;
    
    /**
     * size of storage array
     */
    private final int capacity;
    
    /**
     * The index of the last stored item
     */
    private int tailIndex;
    
    
    /**
     * New empty queue of given size
     * @param size
     */
    public UnsortedArrayPriorityQueue(int size) {
        storage = new Object[size];
        capacity = size;
        tailIndex = -1;
        
    }
    
    @Override
    public T head() throws QueueUnderflowException {
        if (isEmpty()) {
            throw new QueueUnderflowException();
        } else {
            int max = 0;
            int position = 0;
            for (int i = tailIndex; i >= 0; i--) {
                int current = ((PriorityItem<T>)storage[i]).getPriority();
                if (current > max) {
                    max = current;
                    position = i;
                    
                }
            }
            return ((PriorityItem<T>)storage[position]).getItem();
        }
        
        
    }
    
    @Override
    public void add(T item, int priority) throws QueueOverflowException {
        tailIndex = tailIndex + 1;
        if (tailIndex >= capacity) {
            tailIndex = tailIndex - 1;
            throw new QueueOverflowException();
        } else {
            /*int i = tailIndex;
            while (i > 0 && ((PriorityItem<T>) storage[i - 1]).getPriority() < priority) {
                storage[i] = storage [i - 1];
                i = i - 1;
            }
            storage[i] = new PriorityItem<>(item, priority);
        }
        
        */
        
        int i = tailIndex;
            while (i > 0) {
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
            int max = 0;
            int position = 0;
            for (int i = tailIndex; i >= 0; i--) {
                int current = ((PriorityItem<T>)storage[i]).getPriority();
                if (current > max) {
                    max = current;
                    position = i;
                    
                }
            }
            for(int i = 0; i < tailIndex; i ++) {
                if(((PriorityItem<T>) storage[i]).getPriority() == max) {
                    Object tempStore = storage[i+1];
                    storage[i+1] = storage[i];
                    storage[i] = tempStore;
            }
            }
            tailIndex = tailIndex - 1;
        }
    }
    
    @Override
    public boolean isEmpty() {
        return tailIndex < 0;
    }
    
    @Override
    public String toString() {
        String result = "[";
        for (int i = 0; i <= tailIndex; i++) {
            if (i > 0) {
                result = result + ", ";
            }
            result = result + storage[i];
        }
        result = result + "]";
        return result;
    }
}
