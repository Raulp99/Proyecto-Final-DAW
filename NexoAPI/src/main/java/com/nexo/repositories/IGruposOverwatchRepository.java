package com.nexo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nexo.entities.GruposOverwatchEntity;

@Repository
public interface IGruposOverwatchRepository extends CrudRepository<GruposOverwatchEntity, Integer>{

}
