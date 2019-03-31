package queuemanager;

//import java.util.Iterator;

/**
 * https://stackoverflow.com/questions/12756458/adding-and-removing-elements-in-a-user-defined-java-doubly-linkedlist
 * @author 07014975
 * @param <T> 
 */

public class UnsortedLinkedPriorityQueue<T> implements PriorityQueue<T> {
   /* 
    /**
     * 
     * @param size 
     
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
            throw new QueueUnderflowException();
        } else {
        top = top.getNext();
        }
        return top;
    }
    
    /*@Override
    public void add (T item) {
        top = new ListNode<>(item, top);
        ListNode<T> new_node =(new_data);
        
        top
    }
    
    
    @Override
    public void add () {
          
          
    }
    
    @Override
    public void remove() {
        
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
    
    private LinkEntry<T> head = null;
    private LinkEntry<T> tail = null;
    
    
    private int size = 0;
    
    public void UnsortedLinkedPriorityQueue() {
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
    
    public int size() {
        int count = 0;
        for (LinkEntry<T> current = head; current != null; current = current.next) {
            count ++;
        }
        return count;
    }
    
    public boolean add(T t) {// throws QueueOverflowException {
        LinkEntry<T> new_element = new LinkEntry<T>();
        LinkEntry<T> temp = new LinkEntry<T>();
        LinkEntry<T> current = new LinkEntry<T>();
        new_element.element = t;
        temp = null;
        current = null;
        if (head == null) {
            /*head = new_element;
            tail = head;
            
            
            head = new_element;
            tail = head;
        } else {
            /*tail.next = new_element;
            new_element.previous = tail;
            tail = new_element;
            //LinkEntry<T> temp = new LinkEntry<T>();
            temp = new_element;
            temp.next = tail;
            tail = temp;
        }
        size++;
        
        return true;
        
    }
    /*
    public UnsortedLinkedPriorityQueue insert(UnsortedLinkedPriorityQueue head, T t) {
        LinkEntry<T> node = new LinkEntry<T>();
        node.data = t;
        if (head != null) {
            node.next = head;
        }
        return node;
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
*/
    
    private ListNode<T> top;
    private ListNode<T> temp;
    
    public UnsortedLinkedPriorityQueue() {
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
    
    @Override
    public void add(T item, int priority) throws QueueOverflowException {
        if (top == null) {
            top = new ListNode<>(item, top);
        //throw new QueueOverflowException();
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
    }*/
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
