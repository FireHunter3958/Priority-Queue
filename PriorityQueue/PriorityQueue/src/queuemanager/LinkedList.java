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
public class LinkedList {
    
Node head;  // head of list 
  
    /* Linked list Node.  This inner class is made static so that 
       main() can access it */
    static class Node { 
        int data; 
        Node next; 
        Node(int d)  { data = d;  next=null; } // Constructor 
    } 
  
    /* This function prints contents of linked list starting from head */
    public void printList() 
    { 
        Node n = head; 
        while (n != null) 
        { 
            System.out.print(n.data+" "); 
            n = n.next; 
        } 
    } 
    
    /* Inserts a new Node at front of the list. */
    public void push(int new_data) 
    { 
        /* 1 & 2: Allocate the Node & 
                  Put in the data*/
        Node new_node = new Node(new_data); 
  
        /* 3. Make next of new Node as head */
        new_node.next = head; 
  
        /* 4. Move the head to point to new Node */
        head = new_node; 
    } 
  
    /* Inserts a new node after the given prev_node. */
    public void insertAfter(Node prev_node, int new_data) 
    { 
        /* 1. Check if the given Node is null */
        if (prev_node == null) 
        { 
            System.out.println("The given previous node cannot be null"); 
            return; 
        } 
  
        /* 2 & 3: Allocate the Node & 
                  Put in the data*/
        Node new_node = new Node(new_data); 
  
        /* 4. Make next of new Node as next of prev_node */
        new_node.next = prev_node.next; 
  
        /* 5. make next of prev_node as new_node */
        prev_node.next = new_node; 
    } 
     
    /* Appends a new node at the end.  This method is  
       defined inside LinkedList class shown above */
    public void append(int new_data) 
    { 
        /* 1. Allocate the Node & 
           2. Put in the data 
           3. Set next as null */
        Node new_node = new Node(new_data); 
  
        /* 4. If the Linked List is empty, then make the 
              new node as head */
        if (head == null) 
        { 
            head = new Node(new_data); 
            return; 
        } 
  
        /* 4. This new node is going to be the last node, so 
              make next of it as null */
        new_node.next = null; 
  
        /* 5. Else traverse till the last node */
        Node last = head;  
        while (last.next != null) 
            last = last.next; 
  
        /* 6. Change the next of last node */
        last.next = new_node; 
        return; 
    } 
  
    /* method to create a simple linked list with 3 nodes*/
    public static void main(String[] args) 
    { 
        /* Start with the empty list */
        LinkedList llist = new LinkedList(); 
  
        // Insert 6.  So linked list becomes 6->NUllist 
        llist.append(6); 
  
        // Insert 7 at the beginning. So linked list becomes 
        // 7->6->NUllist 
        llist.push(7); 
  
        // Insert 1 at the beginning. So linked list becomes 
        // 1->7->6->NUllist 
        llist.push(1); 
  
        // Insert 4 at the end. So linked list becomes 
        // 1->7->6->4->NUllist 
        llist.append(4); 
  
        // Insert 8, after 7. So linked list becomes 
        // 1->7->8->6->4->NUllist 
        llist.insertAfter(llist.head.next, 8); 
  
        System.out.println("\nCreated Linked list is: "); 
        llist.printList(); 
    } 
}
