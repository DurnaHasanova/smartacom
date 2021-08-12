package com.smartauto.service.impl;

import com.smartauto.dto.EngineOilResponseDto;
import com.smartauto.dto.ManufacturerResponseDto;
import com.smartauto.service.EngineOilService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EngineOilServiceImpl implements EngineOilService {

    @Override
    public EngineOilResponseDto findByCarTypeAndYear(String carType, Integer year) {
        return null;
    }

    @Override
    public ManufacturerResponseDto findByCar(String car) {
        return null;
    }
}
