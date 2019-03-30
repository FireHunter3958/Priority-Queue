//package queuemanager;

import java.util.Iterator;

/**
 *https://stackoverflow.com/questions/12756458/adding-and-removing-elements-in-a-user-defined-java-doubly-linkedlist
 * @author 07014975
 */
public class SortedLinkedPriorityQueue<T>{// implements PriorityQueue<T> {
    
    private LinkEntry<T> head = null;
    private LinkEntry<T> tail = null;
    
    private int size = 0;
    
    public void SortedLinkedPriorityQueue() {
    head = tail = null;
    }
    
    public boolean isEmpty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }
    }
    /*
    public T head() throws QueueUnderflowException {
        if (isEmpty()) {
            throw new QueueUnderflowException();
        } else {
            T headValue = head;
            return head;
        }
    }
    */
    public int size() {
        int count = 0;
        for (LinkEntry<T> current = head; current != null; current = current.next) {
            count ++;
        }
        return count;
    }
    
    public boolean add(T t) {// throws QueueOverflowException {
        LinkEntry<T> new_element = new LinkEntry<T>();
        new_element.element = t;
        if (head == null) {
            head = new_element;
            tail = head;
        } else {
            tail.next = new_element;
            new_element.previous = tail;
            tail = new_element;
        }
        
        size++;
        
        return true;
        
    }
    /*
    public T remove(int n) {
        LinkEntry<T> current = new LinkEntry<T>();
        int i = 0;
        
        while (n == i++) {
            current.previous.next = current.next;
            if (current.next != null) {
                current.next.previous = current.previous;
            }
        }
        return (T) current;
    }
    */
    public void remove(){// throws QueueUnderflowException {
            LinkEntry<T> current = new LinkEntry<T>();
        int i = 0;
        int n = 1;
        
        while (n == i++) {
            current.previous.next = current.next;
            if (current.next != null) {
                current.next.previous = current.previous;
            }
        }
        }
    
    @Override
    public String toString() {
        String result = "";
            LinkEntry current = head;
            while(current.next != null){
                result += current;
                if(current.next != null){
                     result += ", ";
                }
                current = current.next;
            }
            return "List: " + result;

    }
    
    protected class LinkEntry<T> {
        protected T element;
        protected LinkEntry<T> next;
        protected LinkEntry<T> previous;
        
        protected LinkEntry() {element = null; next = previous = null;}
    }
    
    protected class ListAttempt2<T> implements Iterator<T> {
        protected LinkEntry<T> next;
        
        protected ListAttempt2() {
            next = (LinkEntry<T>) head;
        }
        
        @Override
        public boolean hasNext() {
            return false;
        }
        
        @Override
        public T next() {
            return null;
        }
        
        
    }
    
    
    
}