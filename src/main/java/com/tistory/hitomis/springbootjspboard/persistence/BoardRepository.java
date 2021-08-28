package com.tistory.hitomis.springbootjspboard.persistence;

import com.tistory.hitomis.springbootjspboard.domain.Board;
import org.springframework.data.repository.CrudRepository;

public interface BoardRepository extends CrudRepository<Board, Long> {
}
