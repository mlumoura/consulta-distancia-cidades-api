package com.github.mlumoura.staties.repositories;

import com.github.mlumoura.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
