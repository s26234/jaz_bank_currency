package com.example.jaz_s26234_nbp.model;

import java.util.List;

public class GoldData {

    private String currencyGold;
    private List<Double> rates;

    public GoldData(String currencyGold, List<Double> rates) {
        this.currencyGold = currencyGold;
        this.rates = rates;
    }
    public String getCurrencyGold() {
        return currencyGold;
    }
    public List<Double> getRates() {
        return rates;
    }

}
