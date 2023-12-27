package com.example.Board_SpringBoot_CR.repository;

import com.example.Board_SpringBoot_CR.entity.BoardFileEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardFileRepository extends JpaRepository<BoardFileEntity, Long> {
}
