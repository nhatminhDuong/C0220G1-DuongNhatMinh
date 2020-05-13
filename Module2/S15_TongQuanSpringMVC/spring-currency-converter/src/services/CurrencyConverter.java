package services;

public interface CurrencyConverter {
    Float convert(float rate, float usd);

    String getMessageError();
}
