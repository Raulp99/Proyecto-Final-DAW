package com.nexo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nexo.entities.GruposFortniteEntity;

@Repository
public interface IGruposFortniteRepository extends CrudRepository<GruposFortniteEntity, Integer>{

}
