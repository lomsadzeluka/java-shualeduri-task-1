package ge.edu.btu.currency.service.impl;

import ge.edu.btu.currency.service.CurrencyService;

public class CurrencyServiceImpl implements CurrencyService {

    private int _exchangeRate;

    public CurrencyServiceImpl() {
        _exchangeRate = 1;
    }

    @Override
    public void setExchangeRate(int integerRate) {
        _exchangeRate = integerRate;
    }

    @Override
    @SuppressWarnings("IntegerDivisionInFloatingPointContext")
    public double convert(int amount) {
        return amount / _exchangeRate;
    }

    @Override
    public double convert(double amount) {
        return amount / _exchangeRate;
    }
}
