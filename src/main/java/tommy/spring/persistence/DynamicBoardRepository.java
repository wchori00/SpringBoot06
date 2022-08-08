package tommy.spring.persistence;

import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

import tommy.spring.domain.Board;

public interface DynamicBoardRepository extends CrudRepository<Board, Long>, QuerydslPredicateExecutor<Board> {

}
