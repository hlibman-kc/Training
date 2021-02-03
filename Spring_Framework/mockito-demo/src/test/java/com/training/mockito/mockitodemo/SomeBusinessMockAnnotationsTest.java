package com.training.mockito.mockitodemo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class SomeBusinessMockAnnotationsTest {

    @Mock
    DataService dataServiceMock;

    @InjectMocks
    SomeBusinessImpl businessImpl;

    @Test
    public void testFindTheGreatestFromAllData() {
        when (dataServiceMock.retrieveAllData()).thenReturn(new int[]{24, 15, 3});
        int result = businessImpl.findTheGreatestFromAllData();
        assertEquals(24, result);
    }

    @Test
    public void testFindTheGreatestFromAllData_ForOneValue() {
        when (dataServiceMock.retrieveAllData()).thenReturn(new int[]{15});
        int result = businessImpl.findTheGreatestFromAllData();
        assertEquals(15, result);
    }

    @Test
    public void testFindTheGreatestFromAllData_NoValue() {
        when (dataServiceMock.retrieveAllData()).thenReturn(new int[]{});
        int result = businessImpl.findTheGreatestFromAllData();
        assertEquals(Integer.MIN_VALUE, result);
    }

}
