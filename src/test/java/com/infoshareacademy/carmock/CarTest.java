package com.infoshareacademy.carmock;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
class CarTest {
    @Mock
    private Type type;

    @InjectMocks
    private Car testee;

    @BeforeEach
    public void setUp() {
        testee = new Car();
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void getTypeName() {
        //GIVEN
        String expectedName = "NAME";

        //WHEN
        Mockito.when(type.getName())
                .thenReturn("name");
        String result = testee.getTypeName();

        //THEN
        assertEquals(expectedName, result);
    }
}