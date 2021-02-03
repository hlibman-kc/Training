package com.training.mockito.mockitodemo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SomeBusinessSubTest {

    SomeBusinessImpl businessImpl = new SomeBusinessImpl(new DataServiceStub());

    @Test
    public void testFindTheGreatestFromAllData() {
        int result = businessImpl.findTheGreatestFromAllData();
        assertEquals(24, result);
    }

}

class DataServiceStub implements DataService {
    @Override
    public int[] retrieveAllData() {
        return new int[] {24, 6, 15};
    }
}