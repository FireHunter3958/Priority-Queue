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
public class SortedLinkedListv2<T> implements PriorityQueue<T> {
    
    private ListNode<T> top;
    private ListNode<T> temp;
    private ListNode<T> head;
    private ListNode<T> tail;
    
    public SortedLinkedListv2() {
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
        return head.getItem();
        }
    }
    
    @Override
    public void remove() throws QueueUnderflowException{
        if (isEmpty()) {
            throw new QueueUnderflowException();
        }
        head = head.getNext();
    }
    
    public void add(T item, int priority) throws QueueOverflowException {
        { 
         ListNode current; 
         ListNode new_node = new ListNode(item, head, priority);
  
         /* Special case for head node */
         if (head == null || head.priority <= new_node.priority) 
         { 
            new_node.next = head; 
            head = new_node; 
            top = head;
         } 
         else { 
  
            /* Locate the node before point of insertion. */
            current = head; 
  
            while (current.next != null && 
                   current.next.priority > new_node.priority) 
                  current = current.next; 
  
            new_node.next = current.next; 
            current.next = new_node; 
         } 
     } 
    }
    /*
    public void add(T item, int priority) throws QueueOverflowException {
        //ListNode new_node = new ListNode(item, top, priority);
        if (head == null) {
            //new_node.next = top;
            //top = new_node;
            top = new ListNode<>(item, top, priority);
            head = new ListNode<>(item, head, priority);
            tail = head;
            System.out.println(tail);
        } else {
            //ListNode addNode = new ListNode(item, top, priority);
            
            //addNode.next = new_node.next;
            //new_node.next = addNode;
            temp = new ListNode<>(item, head, priority);
            if (head.getPriority() < temp.getPriority()) {
                ListNode tempStore = head;
                head = temp;
                top = tempStore;
                head.next = top;
                top = head;
                tail.next = tail;
                //tail = top;
            } else {
                if (temp.getPriority() < tail.getPriority()) {
            //temp.next = top;
            temp.next = tail;
            //tail.next = temp;
            tail = temp;
            tail.next = tail;
            top.next = tail;
            //tail.next = null;
                } else {
                    ListNode tempStore = tail;
                    //tempStore = tail;
                    tail.next = tail;
                    tail.next.previous = tempStore;
                    top.next = tail;
                    
                }
                System.out.println(tail.getPriority());
                System.out.println(temp.getPriority());
            //tail.next = null;
            }
            System.out.println(tail.getPriority());
                System.out.println(temp.getPriority());
            //ListNode last = new_node;
            //while(last.next != null) {
              //  last = last.next;
           // }
           // last.next = tail;
        }
    }
    /*
    @Override
    public void add(T item, int priority) throws QueueOverflowException {
        if (top == null) {
            top = new ListNode<>(item, top);
            tail = top;
        //throw new QueueOverflowException();
                } else {
            tail.next = new ListNode<>(item, top);
            temp = tail;
            tail = new ListNode<>(item, top);
            
            //temp.next = (ListNode) item;

            //top = new PriorityItem<>(item, priority);
            //top = new ListNode<>(item, top);
        }
        System.out.println(tail.getItem());
        System.out.println(tail);
        System.out.println(top);
        System.out.println(temp);
        System.out.println(priority);
        
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
    /*
    @Override
    public String toString() {
        String result = "";
            
            ListNode current = top;
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
            return "List: " + result;

    }
    */
    
    public String toString() {
        String result = "";
         ListNode temp = head; 
         while (temp != null) 
         { 
            //System.out.print(temp.priority+" "); 
             result += temp.getItem();
             if(temp.next != null){
                     result += ", ";
                } 
            temp = temp.next; 
         } /*
         if (temp.next == null){
                result += temp.getItem();
            }*/
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

