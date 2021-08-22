package com.smartauto.repository;

import com.smartauto.entity.ManufacturerAreaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ManufacturerAreaRepository extends JpaRepository<ManufacturerAreaEntity,Long> {
    List<ManufacturerAreaEntity> findAllById(Long id);
    List<ManufacturerAreaEntity> findAllByManufacturerId(Long id);
}
