package com.example.jaz_s26234_nbp.service;

import com.example.jaz_s26234_nbp.model.GoldData;
import com.example.jaz_s26234_nbp.model.QueryGold;
import com.example.jaz_s26234_nbp.repository.GoldRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class GoldService {

    private NbpApiClient nbpApiClient;

    private GoldRepository goldRepository;

    public double calculateAverage(String startDate, String endDate, String currencyGold) {
        GoldData goldData = nbpApiClient.getCurrencyData(currencyGold, startDate, endDate);
        List<Double> rates = goldData.getRates();

        double sum = 0.0;
        for (Double rate : rates) {
            sum += rate;
        }
        double average = sum / rates.size();


        QueryGold queryGold = new QueryGold(currencyGold, startDate, endDate, average, LocalDateTime.now());
        goldRepository.save(queryGold);
        return average;
    }

}
