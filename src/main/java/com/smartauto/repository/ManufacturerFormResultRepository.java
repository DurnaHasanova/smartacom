package com.smartauto.repository;

import com.smartauto.entity.ManufacturerFormResultEntity;
import com.smartauto.sqlQuery.SqlQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ManufacturerFormResultRepository extends JpaRepository<ManufacturerFormResultEntity,String> {
    @Query(value = SqlQuery.FORMRESULTQUERY, nativeQuery = true)
    List<ManufacturerFormResultEntity> findAllCarModelType(String carModelType);
}
