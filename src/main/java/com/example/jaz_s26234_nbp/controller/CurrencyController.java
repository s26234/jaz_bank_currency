package com.example.jaz_s26234_nbp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class CurrencyController {


    @GetMapping("/currency/average")
    public double getCurrencyAverage(
            @RequestParam String startDate,
            @RequestParam String endDate,
            @RequestParam String currencyCode
    )

}
