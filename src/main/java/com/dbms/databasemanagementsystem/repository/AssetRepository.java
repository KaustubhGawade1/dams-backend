package com.dbms.databasemanagementsystem.repository;

import com.dbms.databasemanagementsystem.model.asset;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssetRepository extends JpaRepository<asset,Long> {

}
