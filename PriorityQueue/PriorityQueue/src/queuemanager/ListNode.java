/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuemanager;

/**
 *
 * @author FireHunter3958
 */
public class ListNode<T> {
    private T item;
    private ListNode<T> next;
    
    public ListNode(T item, ListNode<T> next) {
        this.item = item;
        this.next = next;
    }
    
    public T getItem() {
        return item;
    }
    
    public ListNode<T> getNext() {
        return next;
    }
}
