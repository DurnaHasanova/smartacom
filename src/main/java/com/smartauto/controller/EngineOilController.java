package com.smartauto.controller;

import com.smartauto.dto.ManufacturerFormDataDto;
import com.smartauto.dto.ManufacturerFormResultDto;
import com.smartauto.dto.RestResponse;
import com.smartauto.logger.MainLogger;
import com.smartauto.service.EngineOilService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import javax.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping
@Api(tags = "EngineOil")
public class EngineOilController {

    private static final MainLogger LOGGER = MainLogger.getLogger(EngineOilController.class);
    private final EngineOilService engineOilService;

    public EngineOilController(EngineOilService engineOilService) {
        this.engineOilService = engineOilService;
    }

    @GetMapping(value = "/formdata", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<RestResponse<ManufacturerFormDataDto>> getFormData(
            @Valid
            @ApiParam(value = "car", example = "Mercedes-Benz", required = true)
            @RequestParam(name = "car") String manufacturerName) {

        LOGGER.info("Request from getAccountsByCif");
        ManufacturerFormDataDto formData = engineOilService.findByManufacturerName(manufacturerName);
        RestResponse<ManufacturerFormDataDto> manufacturerResponse = new RestResponse("SUCCESS", formData);
        return new ResponseEntity(manufacturerResponse, HttpStatus.OK);
    }

    @GetMapping(value = "/formResult", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<RestResponse<ManufacturerFormResultDto>> getFormResult(
            @ApiParam(value = "carModelType", example = "C 180", required = true)
            @RequestParam(name = "carModeltype") String carModeltype) {

        LOGGER.info("Request from getAccountsByCif");
        List<ManufacturerFormResultDto> formData = engineOilService.findByFormData(carModeltype);
        RestResponse<ManufacturerFormDataDto> manufacturerResponse = new RestResponse("SUCCESS", formData);
        return new ResponseEntity(manufacturerResponse, HttpStatus.OK);
    }
}
