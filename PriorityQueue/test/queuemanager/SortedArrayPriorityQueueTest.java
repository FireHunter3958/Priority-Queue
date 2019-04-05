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
 * @author 07014975
 */
public class SortedArrayPriorityQueueTest {
    
    public SortedArrayPriorityQueueTest() {
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
     * Test of head method, of class SortedArrayPriorityQueue.
     */
    @Test
    public void testHead() throws Exception {
        System.out.println("head");
        SortedArrayPriorityQueue instance = new SortedArrayPriorityQueue(8);
        Object item = "John";
        int priority = 22;
        instance.add(item, priority);
        Object expResult = instance.head();
        Object result = instance.head();
        assertEquals(expResult, result);
        System.out.println(result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of head method, of class SortedArrayPriorityQueue.
     */
    @Test
    public void testHeadMany() throws Exception {
        System.out.println("headMany");
        SortedArrayPriorityQueue instance = new SortedArrayPriorityQueue(8);
        Object item = "John";
        int priority = 22;
        instance.add(item, priority);
        item = "James";
        priority = 11;
        instance.add(item, priority);
        Object expResult = instance.head();
        Object result = instance.head();
        assertEquals(expResult, result);
        System.out.println(result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class SortedArrayPriorityQueue.
     */
    @Test
    public void testAdd() throws Exception {
        System.out.println("add");
        Object item = "John";
        int priority = 22;
        SortedArrayPriorityQueue instance = new SortedArrayPriorityQueue(8);
        instance.add(item, priority);
        System.out.println(instance);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testAddHigher() throws Exception {
        System.out.println("addHigher");
        Object item = "John";
        int priority = 22;
        SortedArrayPriorityQueue instance = new SortedArrayPriorityQueue(8);
        instance.add(item, priority);
        item = "James";
        priority = 55;
        instance.add(item, priority);
        System.out.println(instance);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testAddLower() throws Exception {
        System.out.println("addLower");
        Object item = "John";
        int priority = 22;
        SortedArrayPriorityQueue instance = new SortedArrayPriorityQueue(8);
        instance.add(item, priority);
        item = "James";
        priority = 11;
        instance.add(item, priority);
        System.out.println(instance);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class SortedArrayPriorityQueue.
     */
    @Test
    public void testRemove() throws Exception {
        System.out.println("remove");
        SortedArrayPriorityQueue instance = new SortedArrayPriorityQueue(8);
        Object item = "John";
        int priority = 22;
        instance.add(item, priority);
        instance.remove();
        System.out.println(instance);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of remove method, of class SortedArrayPriorityQueue.
     */
    @Test
    public void testRemoveMany() throws Exception {
        System.out.println("removeMany");
        SortedArrayPriorityQueue instance = new SortedArrayPriorityQueue(8);
        Object item = "John";
        int priority = 22;
        instance.add(item, priority);
        item = "James";
        priority = 11;
        instance.add(item, priority);
        instance.remove();
        System.out.println(instance);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class SortedArrayPriorityQueue.
     */
    @Test
    public void testIsEmpty() throws Exception{
        System.out.println("isEmpty");
        SortedArrayPriorityQueue instance = new SortedArrayPriorityQueue(8);
        Object item = "John";
        int priority = 22;
        instance.add(item, priority);
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        System.out.println(result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class SortedArrayPriorityQueue.
     */
    @Test
    public void testToString() throws Exception{
        System.out.println("toString");
        SortedArrayPriorityQueue instance = new SortedArrayPriorityQueue(8);
        Object item = "John";
        int priority = 22;
        instance.add(item, priority);
        String expResult = "[(John, 22)]";
        String result = instance.toString();
        assertEquals(expResult, result);
        System.out.println(result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of toString method, of class SortedArrayPriorityQueue.
     */
    @Test
    public void testToStringMany() throws Exception{
        System.out.println("toStringMany");
        SortedArrayPriorityQueue instance = new SortedArrayPriorityQueue(8);
        Object item = "John";
        int priority = 22;
        instance.add(item, priority);
        item = "James";
        priority = 11;
        instance.add(item, priority);
        String expResult = "[(John, 22), (James, 11)]";
        String result = instance.toString();
        assertEquals(expResult, result);
        System.out.println(result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
