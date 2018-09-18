package com.example.demo.repository;

import com.example.demo.entity.GoodInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GoodInfoRepository extends JpaRepository<GoodInfoEntity,Long> {
}
