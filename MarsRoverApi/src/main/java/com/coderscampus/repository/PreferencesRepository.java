package com.coderscampus.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coderscampus.dto.HomeDto;

public interface PreferencesRepository extends JpaRepository<HomeDto, Long> {

}
