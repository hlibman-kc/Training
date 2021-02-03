package com.training.spring.basics.springin5steps.basic;

import com.training.spring.basics.springin5steps.SpringIn5StepsBasicApplication;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

//Load the context
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations="/testContext.xml")
class BinarySearchXMLConfigurationTest {

    //get this bean from context
    @Autowired
    BinarySearchImpl binarySearch;

    @Test
    public void testBasicScenario() {

        //call method on binarySearch
        int actualResult = binarySearch.binarySearch(new int[] {}, 5);
        //Check if value is correct
        assertEquals(3, actualResult);
    }

}