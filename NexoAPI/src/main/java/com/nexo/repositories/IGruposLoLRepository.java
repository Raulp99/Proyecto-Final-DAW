package com.nexo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nexo.entities.GruposLoLEntity;

@Repository
public interface IGruposLoLRepository extends CrudRepository<GruposLoLEntity, Integer> {

}
