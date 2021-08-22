package com.smartauto.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "MANUFACTURER_FORM")
public class ManufacturerFormDataEntity {

    @Id
    @Column(name = "ID")
    private Long id;


    @Column(name = "MANUFACTURER_NAME")
    private String manufacturerName;

    @Column(name = "COUNTRY")
    private String country;

    @Column(name = "YEAR")
    private Integer year;

    @Column(name = "CAR_MODEL_NAME")
    private String carModelName;


    @Column(name = "CAR_MODEL_TYPE_NAME")
    private String carModelTypeName;

}
