package com.infoshareacademy.calculator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Calculator {

    public BigDecimal add(BigDecimal num1, BigDecimal num2) {
        if (checkIfNullParams(num1, num2)) {
            throw new IllegalArgumentException();
        }
        return num1.add(num2);
    }

    private boolean checkIfNullParams(BigDecimal num1, BigDecimal num2) {
        return num1 == null || num2 == null;
    }

    public BigDecimal substract(BigDecimal num1, BigDecimal num2) {
        return num1.subtract(num2);
    }

    public BigDecimal addManyParams (BigDecimal ... params) {
        BigDecimal result = new BigDecimal(0.0);
        for (BigDecimal b: params) {
          result = result.add(b);
        }
        return result;
    }


    public Integer addStringNumbers(String ... numbers) {
        List<String> paramsList = convertArraysToList(numbers);
        List<String> splitString = paramsList.stream()
                .peek(s -> splitString(s))
                .collect(Collectors.toList());
        List<Integer> integers = convertStringToInt(splitString);
        if (splitString.isEmpty()) {
            return 0;
        } else {
            Integer x = 0;
            for (Integer i : integers) {
                x = x + i;
            }
            return x;
        }
    }

    private List<String> splitString(String numbers) {
        String[] split = numbers.split(",");

        return convertArraysToList(split);
    }

    private List<Integer> convertStringToInt(List<String> list) {
        return list.stream()
                .map(s -> Integer.parseInt(s))
                .collect(Collectors.toList());
    }

    private List<String> convertArraysToList(String[] params) {
        List<String> numbersString = new ArrayList<>();
        for (String s: params) {
            numbersString.add(s);
        } return numbersString;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.splitString("4,2"));
        System.out.println(calculator.convertStringToInt(Arrays.asList("4","2")));

    }


}
