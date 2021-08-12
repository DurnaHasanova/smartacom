package com.smartauto.service;


import com.smartauto.dto.EngineOilResponseDto;
import com.smartauto.dto.ManufacturerResponseDto;
import java.util.List;

public interface EngineOilService {

    EngineOilResponseDto findByCarTypeAndYear(String carType, Integer year);
    ManufacturerResponseDto findByCar(String car);
}
