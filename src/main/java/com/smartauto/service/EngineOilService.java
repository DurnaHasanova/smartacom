package com.smartauto.service;


import com.smartauto.dto.ManufacturerFormDataDto;
import com.smartauto.dto.ManufacturerFormResultDto;
import com.smartauto.entity.ManufacturerFormResultEntity;

import java.util.List;

public interface EngineOilService {

    ManufacturerFormDataDto findByManufacturerName(String manufacturerName);

    List<ManufacturerFormResultDto> findByFormData(String carModelType);
}
