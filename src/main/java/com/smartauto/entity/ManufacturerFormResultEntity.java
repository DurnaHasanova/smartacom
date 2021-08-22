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
@Table(name = "ENGINE_OIL_TAB")
public class ManufacturerFormResultEntity {

    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "OIL_NAME")
    private String oilName;

    @Column(name = "CAPACITY")
    private Float capacity;

    @Column(name = "SPECIFICATION")
    private String specification;
}
