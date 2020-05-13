package services;

import org.springframework.stereotype.Service;

@Service
public class CurrencyConverterImpl implements CurrencyConverter {

    public static final String ERROR_MESSAGE = "You have to enter values!";

    @Override
    public Float convert(float rate, float usd) {
        return rate * usd;
    }

    @Override
    public String getMessageError() {
        return ERROR_MESSAGE;
    }
}
