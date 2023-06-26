package com.example.jaz_s26234_nbp.repository;

import com.example.jaz_s26234_nbp.model.QueryGold;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GoldRepository extends JpaRepository <QueryGold, Long> {

}
