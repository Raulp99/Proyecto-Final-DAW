package com.nexo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nexo.entities.GruposDota2Entity;

@Repository
public interface IGruposDota2Repository extends CrudRepository<GruposDota2Entity, Integer> {

}
