/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package queuemanager;

/**
 *
 * @author FireHunter3958
 */
public class linkedlistattempt3<T> {
    private LinkEntry<T> head = null;
    private LinkEntry<T> tail = null;
    private LinkedListNode current = null;
    
    private int size = 0;
    
    public void linkedlistattempt3() {
        head = tail = null;
    }
    
    public boolean isEmpty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }
    }
    
    public int size() {
        int count = 0;
        for (LinkEntry<T> current = head; current != null; current = current.next) {
            count ++;
        }
        return count;
    }
    protected class LinkEntry<T> {
        protected T element;
        protected LinkEntry<T> next;
        protected LinkEntry<T> previous;
        
        protected LinkEntry() {element = null; next = previous = null;}
    }
    
    class LinkedListNode {
    private LinkedListNode next;
    private Comparable value = null;
 
    public LinkedListNode(Comparable value) {
        // create first node
        next = null;
        this.value = value;
 
        System.out.println("Adding Node: " + value);
    }
        public boolean add(T t, Comparable value) {
            LinkEntry<T> new_element = new LinkEntry<T>();
            new_element.element = t;
        if (tail.next == null) {/*
            LinkEntry<T> node = tail;//(value);
            tail.next = null;*/
            head = new_element;
            tail = head;
        } else {
                LinkEntry<T> current = tail.next;
                while (current.next != null) {
                current = current.next;
                }
        }
        LinkedListNode node = new LinkedListNode(value);
        current.next = node;
        current.next.next = null;
        return true;
}
    }
}