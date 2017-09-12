/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecommerce.helloworld5.test;

import com.ecommerce.helloworld5.utilities.Tag;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hilink
 */
public class TagTest {
    @Test
    public void testTag(){
        String[] a= new String[]{"food","lifestyle","fashion"};
       // System.out.println("");
        String expected="fashion,lifestyle,food,";
        assertEquals(expected,Tag.convertTag(a));
        
    }
    @Test
    public void testName(){
      String b= "Pastries";
      String expected2="Pastries";
      assertEquals(expected2,b);
    }
    
   /* @BeforeClass
    public static void setUpClass() {
        System.out.println("I am before class");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("I am after class");
    }
    
    @Before
    public void setUp() {
        System.out.println("I am before ");
    }
    
    @After
    public void tearDown() {
        System.out.println("I am after ");
    }
    @Test                                      //@test is main logic
 public void hello() {
     System.out.println("I am real logic");
 }*/
 
}
