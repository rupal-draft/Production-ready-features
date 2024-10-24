package com.production_ready_features.Production.ready.featues.controllers;

import com.production_ready_features.Production.ready.featues.service.ConvertCurrencyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConverterController {

    private final ConvertCurrencyService convertCurrencyService;

    public ConverterController(ConvertCurrencyService convertCurrencyService) {
        this.convertCurrencyService = convertCurrencyService;
    }

    @GetMapping(path = "/convertCurrency")
    public double convertCurrency(@RequestParam String fromCurrency , @RequestParam String toCurrency, @RequestParam Integer units){
        return convertCurrencyService.convertCurrency(fromCurrency,toCurrency,units);
    }
}
