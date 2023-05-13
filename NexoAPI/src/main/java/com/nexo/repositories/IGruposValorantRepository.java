package com.nexo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nexo.entities.GruposValorantEntity;

@Repository
public interface IGruposValorantRepository extends CrudRepository<GruposValorantEntity, Integer>{

}
