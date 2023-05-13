package com.nexo.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nexo.repositories.IGruposLoLRepository;

@Repository
public class GruposLoLDAOImpl {

	@Autowired
	IGruposLoLRepository gruposLolRepository;

}
