package ge.edu.btu.currency.service;

public interface CurrencyService {
    void setExchangeRate(int integerRate);

    double convert(int amount);

    double convert(double amount);
}
