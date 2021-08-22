package com.smartauto.service;


import com.smartauto.dto.ManufacturerFormDto;

public interface EngineOilService {

    ManufacturerFormDto findByCar(String manufacturerName);
}
