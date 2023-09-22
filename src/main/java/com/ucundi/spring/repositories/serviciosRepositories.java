package com.ucundi.spring.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.ucundi.spring.domain.serviciosEntity;

public interface serviciosRepositories extends CrudRepository<serviciosEntity, Long> {

     Optional<serviciosEntity> findById(Long id);

}
