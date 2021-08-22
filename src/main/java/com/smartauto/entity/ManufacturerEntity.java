package com.smartauto.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(schema = "sql11432074", name = "MANUFACTURER")
public class ManufacturerEntity {

    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "MANUFACTURER_NAME")
    private String manufacturerName;

    @Column(name = "LOGO")
    private String logo;

}
