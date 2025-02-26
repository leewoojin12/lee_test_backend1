package org.example.lee_test_backend.repository;

import org.example.lee_test_backend.dto.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository  extends JpaRepository<Board, Long> {
}
