package com.coronatracker.coronatracker.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coronatracker.coronatracker.Model.GlobalData;

public interface GlobalDataRepository extends JpaRepository<GlobalData, Long>{

}
