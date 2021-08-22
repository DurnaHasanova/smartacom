package com.smartauto.repository;

import com.smartauto.entity.ManufacturerFormDataEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.smartauto.sqlQuery.SqlQuery;

import java.util.List;

@Repository
public interface ManufacturerFormDataRepository extends JpaRepository<ManufacturerFormDataEntity,String> {
    @Query(value = SqlQuery.FORMDATAQUERY, nativeQuery = true)
    List<ManufacturerFormDataEntity> findAllByManufacturerName(String manufacturerName);
}
