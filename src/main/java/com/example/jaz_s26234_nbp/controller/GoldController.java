package com.example.jaz_s26234_nbp.controller;

import com.example.jaz_s26234_nbp.model.QueryGold;
import com.example.jaz_s26234_nbp.service.GoldService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoldController {

    private GoldService goldService;

    public GoldController(GoldService goldService) {
        this.goldService = goldService;

    }

    @GetMapping("/gold/average")
    @Operation(summary = "Gold average currency")
    @ApiResponse(responseCode = "200", description = "Get gold average", content = {@Content(mediaType = "application/json", schema = @Schema(implementation = QueryGold.class))})
    public double getCurrencyAverage(
            @RequestParam String startDate,
            @RequestParam String endDate,
            @RequestParam String currencyGold
    ) {
        return goldService.calculateAverage(startDate, endDate, currencyGold);
    }

}
