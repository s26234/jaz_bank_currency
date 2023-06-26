package com.example.jaz_s26234_nbp.service;

import com.example.jaz_s26234_nbp.model.GoldData;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class NbpApiClient {

    private static final String API_URL = "http://api.nbp.pl/";

    private NbpApiResponse nbpApiResponse;

    public NbpApiClient(NbpApiResponse nbpApiResponse) {
        this.nbpApiResponse = nbpApiResponse;
    }

    public GoldData getCurrencyData(String currencyGold, String startDate, String endDate) {
        String apiUrl = API_URL + "exchangerates/rates/A/" + currencyGold + "/" + startDate + "/" + endDate + "/";

        RestTemplate restTemplate = new RestTemplate();
        nbpApiResponse.setRates(restTemplate.getForObject(apiUrl, NbpApiResponse.class).getRates());


        GoldData goldData = new GoldData(currencyGold, nbpApiResponse.getRates());

        return goldData;
    }


}
