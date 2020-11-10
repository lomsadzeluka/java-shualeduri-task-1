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
        var validation = validate(amount);

        HandleValidation(validation);

        return amount / _exchangeRate;
    }

    @Override
    public double convert(double amount) {
        var validation = validate(amount);

        HandleValidation(validation);

        return amount / _exchangeRate;
    }

    private void HandleValidation(boolean validation) {
        if (!validation) {
            var message = "Input must be positive!";

            throw new IllegalArgumentException(message);
        }
    }

    @Override
    public boolean validate(int amount) {
        return amount > 0;
    }

    @Override
    public boolean validate(double amount) {
        return amount > 0;
    }
}
