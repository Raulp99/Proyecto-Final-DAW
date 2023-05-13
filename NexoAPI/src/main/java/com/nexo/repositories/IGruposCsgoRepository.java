package com.nexo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nexo.entities.GruposCsgoEntity;

@Repository
public interface IGruposCsgoRepository extends CrudRepository<GruposCsgoEntity, Integer>{

}
