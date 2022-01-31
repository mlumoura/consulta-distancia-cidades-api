package com.github.mlumoura.countries.repositories;

import com.github.mlumoura.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
