package com.example.jaz_s26234_nbp.service;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class NbpApiResponse {

    private String currency;
    private List<Double> rates;

    public NbpApiResponse() {
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public List<Double> getRates() {
        return rates;
    }

    public void setRates(List<Double> rates) {
        this.rates = rates;
    }


}
