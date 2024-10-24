package com.production_ready_features.Production.ready.featues.service;


import com.production_ready_features.Production.ready.featues.dto.CurrencyConversionResponseDTO;
import lombok.RequiredArgsConstructor;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.lang.reflect.Type;

@Service
@RequiredArgsConstructor
public class ConvertCurrencyService implements CurrencyConverterService{

    @Value("${currency.base.url}")
    private String BASE_URL;

    private final RestClient restClient;

    Logger logger = LoggerFactory.getLogger(ConvertCurrencyService.class);
    @Override
    public double convertCurrency(String from, String to, Integer unit) {
        String url = String.format("%s&currencies=%s&base_currency=%s", BASE_URL, to, from);
        logger.trace("Hitting the FreeCurrency API with RestClient");
        try {
            CurrencyConversionResponseDTO responseDTO = restClient
                    .get().uri(url)
                    .retrieve()
                    .body(new ParameterizedTypeReference<CurrencyConversionResponseDTO>() {
                    });

            Double amount = responseDTO.getData().get(to);
            if (amount != null) {
                logger.trace("The endpoint responded successfully!!");
                return amount * unit;
            } else {
                logger.error("Conversion rate not found for currency: " + to);
                throw new RuntimeException("Conversion Failed");
            }
        } catch (Exception e){
            logger.error(e.getLocalizedMessage());
            throw new RuntimeException(e);
        }
    }
}
