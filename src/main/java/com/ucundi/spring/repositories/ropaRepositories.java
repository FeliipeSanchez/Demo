package com.ucundi.spring.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.ucundi.spring.domain.ropaEntity;

public interface ropaRepositories extends CrudRepository<ropaEntity, Long> {

     Optional<ropaEntity> findById(Long id);

}
