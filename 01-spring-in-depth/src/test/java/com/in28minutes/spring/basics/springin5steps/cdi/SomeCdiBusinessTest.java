package com.in28minutes.spring.basics.springin5steps.cdi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;


import static org.junit.Assert.assertEquals;


@RunWith(MockitoJUnitRunner.class)
public class SomeCdiBusinessTest {

    @InjectMocks
    SomeCdiBusiness business;

    @Mock
    SomeCdiDao daoMock;

    @Test
    public void testBasicScenario() {
        Mockito.when(daoMock.getData()).thenReturn(new int[]{2,4});
        int result = business.findGreatest();
        assertEquals(4, result);
    }
}