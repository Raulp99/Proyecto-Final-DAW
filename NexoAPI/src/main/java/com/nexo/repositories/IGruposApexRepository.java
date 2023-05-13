package com.nexo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nexo.entities.GruposApexEntity;

@Repository
public interface IGruposApexRepository extends CrudRepository<GruposApexEntity, Integer>{

}
