package com.codegym.services;

import com.codegym.models.Operands;

public interface CalculatingService {
    double getSum(Operands operands);

    double getDifference(Operands operands);

    double getProduct(Operands operands);

    double getQuotient(Operands operands) throws DivisionByZeroException;
}
