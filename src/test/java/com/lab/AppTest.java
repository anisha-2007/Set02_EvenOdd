package com.lab;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

@Test
public void testEvenNumber() {
    assertEquals("Even", App.checkEvenOdd(4));
}

@Test
public void testOddNumber() {
    assertEquals("Odd", App.checkEvenOdd(7));
}

@Test
public void testZero() {
    assertEquals("Even", App.checkEvenOdd(0));
}

}