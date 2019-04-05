/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuemanager;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author FireHunter3958
 */
public class SortedLinkedPriorityQueueTest {
    
    public SortedLinkedPriorityQueueTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of isEmpty method, of class SortedLinkedPriorityQueue.
     */
    @Test
    public void testIsEmpty() throws Exception{
        System.out.println("isEmpty");
        SortedLinkedPriorityQueue instance = new SortedLinkedPriorityQueue();
        Object item = "John";
        int priority = 55;
        instance.add(item, priority);
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        System.out.println(result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of head method, of class SortedLinkedPriorityQueue.
     */
    @Test
    public void testHead() throws Exception {
        System.out.println("head");
        SortedLinkedPriorityQueue instance = new SortedLinkedPriorityQueue();
        Object item = "John";
        int priority = 55;
        instance.add(item, priority);
        Object expResult = instance.head();
        Object result = instance.head();
        assertEquals(expResult, result);
        System.out.println(result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of head method, of class SortedLinkedPriorityQueue.
     */
    @Test
    public void testHeadMany() throws Exception {
        System.out.println("headMany");
        SortedLinkedPriorityQueue instance = new SortedLinkedPriorityQueue();
        Object item = "John";
        int priority = 55;
        instance.add(item, priority);
        item = "James";
        priority = 77;
        instance.add(item, priority);
        Object expResult = instance.head();
        Object result = instance.head();
        assertEquals(expResult, result);
        System.out.println(result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class SortedLinkedPriorityQueue.
     */
    @Test
    public void testRemove() throws Exception {
        System.out.println("remove");
        SortedLinkedPriorityQueue instance = new SortedLinkedPriorityQueue();
        Object item = "John";
        int priority = 55;
        instance.add(item, priority);
        instance.remove();
        System.out.println(instance);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of remove method, of class SortedLinkedPriorityQueue.
     */
    @Test
    public void testRemoveMany() throws Exception {
        System.out.println("removeMany");
        SortedLinkedPriorityQueue instance = new SortedLinkedPriorityQueue();
        Object item = "John";
        int priority = 55;
        instance.add(item, priority);
        item = "James";
        priority = 77;
        instance.add(item, priority);
        item = "Mike";
        priority = 11;
        instance.add(item, priority);
        instance.remove();
        System.out.println(instance);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class SortedLinkedPriorityQueue.
     */
    @Test
    public void testAdd() throws Exception {
        System.out.println("add");
        Object item = "John";
        int priority = 55;
        SortedLinkedPriorityQueue instance = new SortedLinkedPriorityQueue();
        instance.add(item, priority);
        System.out.println(instance);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of add method, of class SortedLinkedPriorityQueue.
     */
    @Test
    public void testAddHigher() throws Exception {
        System.out.println("addHigher");
        Object item = "John";
        int priority = 55;
        SortedLinkedPriorityQueue instance = new SortedLinkedPriorityQueue();
        instance.add(item, priority);
        item = "James";
        priority = 77;
        instance.add(item, priority);
        System.out.println(instance);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of add method, of class SortedLinkedPriorityQueue.
     */
    @Test
    public void testAddLower() throws Exception {
        System.out.println("addLower");
        Object item = "John";
        int priority = 55;
        SortedLinkedPriorityQueue instance = new SortedLinkedPriorityQueue();
        instance.add(item, priority);
        item = "Mike";
        priority = 11;
        instance.add(item, priority);
        System.out.println(instance);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class SortedLinkedPriorityQueue.
     */
    @Test
    public void testToString() throws Exception{
        System.out.println("toString");
        SortedLinkedPriorityQueue instance = new SortedLinkedPriorityQueue();
        Object item = "John";
        int priority = 55;
        instance.add(item, priority);
        String expResult = "List: John";
        String result = instance.toString();
        assertEquals(expResult, result);
        System.out.println(result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of toString method, of class SortedLinkedPriorityQueue.
     */
    @Test
    public void testToStringMany() throws Exception{
        System.out.println("toStringMany");
        SortedLinkedPriorityQueue instance = new SortedLinkedPriorityQueue();
        Object item = "John";
        int priority = 55;
        instance.add(item, priority);
        item = "Jameson";
        priority = 77;
        instance.add(item, priority);
        String expResult = "List: Jameson, John";
        String result = instance.toString();
        assertEquals(expResult, result);
        System.out.println(result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
