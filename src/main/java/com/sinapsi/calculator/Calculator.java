package com.sinapsi.calculator;
import org.springframework.stereotype.Service;
/**
* This program implements a simple calculator
*/
@Service
public class Calculator {
    int sum(int a, int b) {
        return a + b;
    }
}
