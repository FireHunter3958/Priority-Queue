/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuemanager;

//import java.util.Iterator;

/**
 * https://www.geeksforgeeks.org/given-a-linked-list-which-is-sorted-how-will-you-insert-in-sorted-way/?fbclid=IwAR1hey_iqaGrc2rFAOJW2xXF9sk_E0whVohz9YqIuM2QgEyN8Uok13rMTBI
 * https://www.geeksforgeeks.org/linked-list-set-2-inserting-a-node/
 * @author 07014975
 * @param <T> 
 */

public class UnsortedLinkedPriorityQueue<T> implements PriorityQueue<T> {
   
    
    private ListNode<T> top;
    private ListNode<T> temp;
    private ListNode<T> head;
    
    public UnsortedLinkedPriorityQueue() {
        top = null;
        //head = null;
    }
    
    @Override
    public boolean isEmpty() {
        return head == null;
    }
    
    @Override
    public T head() throws QueueUnderflowException{
        if (isEmpty()) {
            System.out.println("The queue is empty, please enter a value.");
            throw new QueueUnderflowException();
        } else {
        return head.getItem();
        }
    }
    
    @Override
    public void remove() throws QueueUnderflowException{
        if (isEmpty()) {
            System.out.println("The queue is empty, please enter a value.");
            //throw new QueueUnderflowException();
        }
        temp = top;
        head = head.getNext();
        top = top.getNext();
    }
    
    @Override
    public void add(T item, int priority) throws QueueOverflowException {
        if (head == null) {
            top = new ListNode<>(item, top, priority);
            head = new ListNode<>(item, head, priority);
        //throw new QueueOverflowException();
                } else {
            
            temp = new ListNode<>(item, head,priority);
            if (head.getPriority() < temp.getPriority()) {
                head = temp;
                //head.next = top;
                head.next = top;
                top = head;
                //top = head;
            } else {
            temp.next = top;
            //head = temp;
            top = temp;
            }
            //System.out.println(head.getPriority());
            //System.out.println(top.getPriority());
            //top = new PriorityItem<>(item, priority);
            //top = new ListNode<>(item, top);
        }
        
    }
    /*
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
    }*/
    @Override
    public String toString() {
        String result = "";
            ListNode current = top;
            if (current == null) {
                result = ("The queue is empty, please enter a value.");
            } else {
            while(current.next != null){
                result += current.getItem();
                if(current.next != null){
                     result += ", ";
                } 
                current = current.next;
            }
            if (current.next == null){
                result += current.getItem();
            }
            }
            return "List: " + result;
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
}
