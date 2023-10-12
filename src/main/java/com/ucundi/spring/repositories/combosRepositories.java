package com.ucundi.spring.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.ucundi.spring.domain.combosEntity;

public interface combosRepositories extends CrudRepository<combosEntity, Long> {

    Optional<combosEntity> findById(Long id);

}