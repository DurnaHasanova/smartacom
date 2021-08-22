package com.smartauto.repository;

import com.smartauto.entity.ManufacturerFormEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.smartauto.sqlQuery.SqlQuery;

import java.util.List;

@Repository
public interface ManufacturerFormRepository extends JpaRepository<ManufacturerFormEntity,String> {
    @Query(value = SqlQuery.FORMQUERY, nativeQuery = true)
    List<ManufacturerFormEntity> findAllByManufacturerName(String manufacturerName);
}
