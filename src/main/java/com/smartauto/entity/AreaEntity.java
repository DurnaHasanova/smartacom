package com.smartauto.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(schema = "sql11432074", name = "AREA")
public class AreaEntity {

    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "COUNTRY")
    private String country;
}
