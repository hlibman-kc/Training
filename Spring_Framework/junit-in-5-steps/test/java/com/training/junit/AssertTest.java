package com.training.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class AssertTest {

    @Test
    public void test() {
        boolean cond = true;
        assertTrue(cond);
        assertNotNull(cond);
    }
}
