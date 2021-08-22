package com.smartauto.service.impl;

import com.smartauto.dto.ManufacturerFormDto;
import com.smartauto.entity.ManufacturerFormEntity;
import com.smartauto.repository.ManufacturerFormRepository;
import com.smartauto.service.EngineOilService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class EngineOilServiceImpl implements EngineOilService {
    private final ManufacturerFormRepository manufacturerFormRepository;

    @Transactional
    @Override
    public ManufacturerFormDto findByCar(String manufacturerName) {
        List<ManufacturerFormEntity> mnfFormRepoResponse =
                manufacturerFormRepository.findAllByManufacturerName(manufacturerName);
        ManufacturerFormDto manufacturerFormDto = new ManufacturerFormDto();
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
}
