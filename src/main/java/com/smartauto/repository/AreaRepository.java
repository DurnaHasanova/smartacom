package com.smartauto.repository;

import com.smartauto.entity.AreaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AreaRepository extends JpaRepository<AreaEntity,Long> {
    List<AreaEntity> findAllById(Long id);
}
