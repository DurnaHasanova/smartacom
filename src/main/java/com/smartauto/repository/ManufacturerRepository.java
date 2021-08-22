package com.smartauto.repository;

import com.smartauto.entity.ManufacturerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ManufacturerRepository extends JpaRepository<ManufacturerEntity,String> {
    List<ManufacturerEntity> findAllByManufacturerName(String name);
    List<ManufacturerEntity> findAllById(Long id);
}
