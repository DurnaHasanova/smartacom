package com.smartauto.service.impl;

import com.smartauto.dto.ManufacturerFormDataDto;
import com.smartauto.dto.ManufacturerFormResultDto;
import com.smartauto.entity.ManufacturerFormDataEntity;
import com.smartauto.entity.ManufacturerFormResultEntity;
import com.smartauto.repository.ManufacturerFormDataRepository;
import com.smartauto.repository.ManufacturerFormResultRepository;
import com.smartauto.service.EngineOilService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class EngineOilServiceImpl implements EngineOilService {
    private final ManufacturerFormDataRepository manufacturerFormRepository;
    private final ManufacturerFormResultRepository manufacturerFormResultRepository;

    @Transactional
    @Override
    public ManufacturerFormDataDto findByManufacturerName(String manufacturerName) {
        List<ManufacturerFormDataEntity> mnfFormRepoResponse =
                manufacturerFormRepository.findAllByManufacturerName(manufacturerName);
        ManufacturerFormDataDto manufacturerFormDto = new ManufacturerFormDataDto();
        manufacturerFormDto
                .setArea(mnfFormRepoResponse.stream().map(c->c.getCountry()).collect(Collectors.toSet()));
        manufacturerFormDto
                .setYear(mnfFormRepoResponse.stream().map(c->c.getYear()).collect(Collectors.toSet()));
        manufacturerFormDto
                .setModel(mnfFormRepoResponse.stream().map(c->c.getCarModelName()).collect(Collectors.toSet()));
        manufacturerFormDto
                .setType(mnfFormRepoResponse.stream().map(c->c.getCarModelTypeName()).collect(Collectors.toSet()));

        return manufacturerFormDto;
    }

    @Override
    public List<ManufacturerFormResultDto> findByFormData(String carModelType) {
        List<ManufacturerFormResultEntity> manufacturerFormResultEntities =
                manufacturerFormResultRepository.findAllCarModelType(carModelType);
        List<ManufacturerFormResultDto> manufacturerFormResultDtos = new ArrayList<>();
        for (ManufacturerFormResultEntity result: manufacturerFormResultEntities) {
            ManufacturerFormResultDto manufacturerFormResultDto = new ManufacturerFormResultDto();
            manufacturerFormResultDto.setCapacity(result.getCapacity());
            manufacturerFormResultDto.setOil(result.getOilName());
            manufacturerFormResultDto.setSpecification(result.getSpecification());
            manufacturerFormResultDtos.add(manufacturerFormResultDto);

        }
        return manufacturerFormResultDtos;
    }
}
