package com.smartauto.entity;

import com.smartauto.repository.AreaRepository;
import lombok.*;

import javax.persistence.*;
import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(schema = "sql11432074", name = "MANUFACTURER_AREA")
public class ManufacturerAreaEntity implements Externalizable {

    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "MANUFACTURER_ID")
    private Long manufacturerId;


    @Column(name = "AREA_ID")
    private Long areaId;

    @EqualsAndHashCode.Exclude @ToString.Exclude
    @OneToMany(targetEntity = ManufacturerEntity.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "ID", referencedColumnName = "MANUFACTURER_ID")
    private List<ManufacturerEntity> manufacturerEntity;

    @EqualsAndHashCode.Exclude @ToString.Exclude
    @OneToMany(targetEntity = AreaEntity.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "ID", referencedColumnName = "AREA_ID")
    private List<AreaEntity> areaEntity;

    @Override
    public void writeExternal(ObjectOutput objectOutput) throws IOException {

    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {

    }
}
