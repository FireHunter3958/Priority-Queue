/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package queuemanager;

/**
 *
 * @author 07014975
 */
public class unsortedlistattempt2<T> {
    
private LinkEntry<T> head = null;
private LinkEntry<T> tail = null;
    
private int size = 0;
    
public void unsortedlistattempt2() {
    head = tail = null;
}
 
public int size() {
        int count = 0;
        for (LinkEntry<T> current = head; current != null; current = current.next) {
            count ++;
        }
        return count;
    }

public boolean isEmpty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }
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
 
    /**
     * This method removes a node from a linked list.
     */
    public LinkedListNode removeNode(Comparable nodeValue) {
 
        System.out.println("Removing Node: " + nodeValue);
 
        if (this.value.compareTo(nodeValue) == 0) { // head
            return this.next;
        } else { // non head
 
            LinkedListNode current = this;
            LinkedListNode previous = null;
 
            while (current.next != null) {
                if (current.value.compareTo(nodeValue) == 0) {
                    previous.next = current.next;
                    return this;
                }
 
                previous = current;
                current = current.next;
            }
 
            if (current.value.compareTo(nodeValue) == 0) { // tail
                previous.next = null;
            }
 
        }
 
        return this;
 
    }
 
    @Override
    public String toString() {
 
        String data = "";
        LinkedListNode current = this;
        do {
            data += current.value + ",";
            current = current.next;
        } while (current != null);
 
        return data;
    }
 
    /**
     * Adds the node at the tail, making it an unsorted linked list. This method
     * returns a head node.
     */
    public LinkedListNode addNode(Comparable value) {
 
        // if first node
        if (this.next == null) {
            LinkedListNode node = new LinkedListNode(value);
            this.next = node;
            this.next.next = null;
        } else {
            LinkedListNode current = this.next;
            while (current.next != null) {
                current = current.next;
            }
 
            LinkedListNode node = new LinkedListNode(value);
            current.next = node;
            current.next.next = null;
        }
 
        return this; // return head
    }
}
}