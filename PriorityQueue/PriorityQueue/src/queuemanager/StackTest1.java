/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 
package queuemanager;

/**
 *
 * @author FireHunter3958
 

public class StackTest1<T> implements PriorityQueue<T>{
    private ListNode<T> top;
    private ListNode<T> temp;
    
    public StackTest1() {
        top = null;
    }
    
    @Override
    public boolean isEmpty() {
        return top == null;
    }
    
    @Override
    public T head() throws QueueUnderflowException{
        if (isEmpty()) {
            throw new QueueUnderflowException();
        } else {
        return top.getItem();
        }
    }
    
    @Override
    public void remove() throws QueueUnderflowException{
        if (isEmpty()) {
            throw new QueueUnderflowException();
        }
        top = top.getNext();
    }
    
    //@Override
    public void add(T item, int priority) throws QueueOverflowException {
        if (top == null) {
            top = new ListNode<>(item, top);
        throw new QueueOverflowException();
                } else {
            temp = new ListNode<>(item, top);
            
            temp.next = top;
            top = temp;
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
    }/*
    @Override
    public String toString() {
        String result = "";
            ListNode current = top;
            while(current.next != null){
                result += current;
                if(current.next != null){
                     result += ", ";
                }
                current = current.next;
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
}*/