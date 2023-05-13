package com.nexo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nexo.entities.GruposRainbow6Entity;

@Repository
public interface IGruposRainbow6Repository extends CrudRepository<GruposRainbow6Entity, Integer>{

}
