package com.codegym.services;

import com.codegym.models.Operands;
import org.springframework.stereotype.Service;

@Service
public class CalculatingServiceImpl implements CalculatingService {

    public double getSum(Operands operands) {
        return operands.getFirstOperand() + operands.getSecondOperand();
    }

    public double getDifference(Operands operands) {
        return operands.getFirstOperand() - operands.getSecondOperand();
    }

    public double getProduct(Operands operands) {
        return operands.getFirstOperand() * operands.getSecondOperand();
    }

    public double getQuotient(Operands operands) throws DivisionByZeroException {
        if (operands.getSecondOperand() == 0) throw new DivisionByZeroException("Cannot divide by zero!");
        return operands.getFirstOperand() / operands.getSecondOperand();
    }
}
