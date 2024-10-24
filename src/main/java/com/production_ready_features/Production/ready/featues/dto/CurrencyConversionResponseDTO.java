package com.production_ready_features.Production.ready.featues.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Map;

@Data
@RequiredArgsConstructor
public class CurrencyConversionResponseDTO {
    private Map<String, Double> data;
}
