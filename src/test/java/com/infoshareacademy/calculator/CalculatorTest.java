package com.infoshareacademy.calculator;

import org.junit.Before;
import org.junit.Rule;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;
import org.mockito.internal.matchers.Null;

import java.math.BigDecimal;

public class CalculatorTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    private Calculator calculator;

//    @BeforeEach
    @Before
    public void setUp() {
        calculator = new Calculator();
    }

//    @Test
    @org.junit.Test
    public void shouldReturnSumWhenCorrectParams() {
        //GIVEN
        BigDecimal num1 = BigDecimal.TEN;
        BigDecimal num2 = new BigDecimal(5.5);
        BigDecimal expected = new BigDecimal(15.5);

        //WHEN
        BigDecimal result = calculator.add(num1, num2);

        //THEN
        Assertions.assertEquals(expected, result);
    }

    @org.junit.Test
//    @Test
    public void shouldThrowIllegalArgumentExceptionWhenParamIsNull() {
        expectedException.expect(IllegalArgumentException.class);
        //GIVEN
        BigDecimal num1 = BigDecimal.TEN;
        BigDecimal num2 = null;

        //WHEN
        BigDecimal result = calculator.add(num1, num2);
    }

    @org.junit.Test
    public void shouldReturnSubstractionWhenCorrectParams() {
        //GIVEN
        BigDecimal num1 = BigDecimal.TEN;
        BigDecimal num2 = new BigDecimal(5.5);
        BigDecimal expected = new BigDecimal(4.5);

        //WHEN
        BigDecimal result = calculator.substract(num1, num2);

        //THEN
        Assertions.assertEquals(expected, result);
    }

    @org.junit.Test
    public void shouldReturnCorrectSumWhenManyParams() {
        //GIVEN
        BigDecimal num1 = BigDecimal.TEN;
        BigDecimal num2 = new BigDecimal(5.5);
        BigDecimal num3 = new BigDecimal(2.0);
        BigDecimal expected = new BigDecimal(17.5);

        //WHEN
        BigDecimal result = calculator.addManyParams(num1, num2, num3);

        //THEN
        Assertions.assertEquals(expected, result);
    }

    @org.junit.Test
    public void shouldReturnCorrectSumWithStringParams() {
        //GIVEN
        String numbers = "4,2";
        Integer expected = new Integer(6);

        //WHEN
        Integer result = calculator.addStringNumbers(numbers);

        //THEN
        Assertions.assertEquals(expected, result);
    }

    @org.junit.Test
    public void shouldReturnCorrectSumWhenEmptyString() {
        //GIVEN
        String numbers = "";
        Integer expected = new Integer(0);

        //WHEN
        Integer result = calculator.addStringNumbers(numbers);

        //THEN
        Assertions.assertEquals(expected, result);
    }

    @org.junit.Test
    public void shouldReturnCorrectSumWhenOneParam() {
        //GIVEN
        String numbers = "2";
        Integer expected = new Integer(2);

        //WHEN
        Integer result = calculator.addStringNumbers(numbers);

        //THEN
        Assertions.assertEquals(expected, result);
    }

}
