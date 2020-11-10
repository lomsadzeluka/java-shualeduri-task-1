package ge.edu.btu.currency;

import ge.edu.btu.currency.service.CurrencyService;
import ge.edu.btu.currency.service.impl.CurrencyServiceImpl;

public class Main {
    public static void main(String[] args) {
        CurrencyService currencyService = new CurrencyServiceImpl();

        currencyService.setExchangeRate(3);

        var convert1 = currencyService.convert(12);
        var convert2 = currencyService.convert(122.3);

        System.out.println(convert1);
        System.out.println(convert2);
    }
}
