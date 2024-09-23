package com.example.factorialapp;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class FactorialService {

    public BigDecimal calculate(int n) {
        return new BigDecimal(n).multiply(calculate(n-1));
    }
}
