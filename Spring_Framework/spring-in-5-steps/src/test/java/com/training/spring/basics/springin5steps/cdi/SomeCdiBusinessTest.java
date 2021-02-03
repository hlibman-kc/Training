package com.training.spring.basics.springin5steps.cdi;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertEquals;

//Load the context
@ExtendWith(MockitoExtension.class)
class SomeCdiBusinessTest {

    //Create Mock
    @Mock
    SomeCdiDao daoMock;

    //Inject Mock
    @InjectMocks
    SomeCdiBusiness business;

    @Test
    public void testBasicScenario() {

        //When daoMock.getData() method is called, return int[] {2,4}
        Mockito.when(daoMock.getData()).thenReturn(new int[] {2,4});
        assertEquals(4, business.findGreatest());
    }

    @Test
    public void testBasicScenario_NoElements() {
        Mockito.when(daoMock.getData()).thenReturn(new int[] {});
        assertEquals(Integer.MIN_VALUE, business.findGreatest());
    }

    @Test
    public void testBasicScenario_EqualElements() {
        Mockito.when(daoMock.getData()).thenReturn(new int[] {2,2});
        assertEquals(2, business.findGreatest());
    }


}