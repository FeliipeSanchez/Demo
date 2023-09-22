package com.ucundi.spring.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.ucundi.spring.domain.camasEntity;

public interface camasRepositories extends CrudRepository<camasEntity, Long> {

    Optional<camasEntity> findById(Long id);

}
