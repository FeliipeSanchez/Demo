package com.ucundi.spring.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.ucundi.spring.domain.comidaEntity;

public interface comidaRepositories extends CrudRepository<comidaEntity, Long> {

     Optional<comidaEntity> findById(Long id);
}