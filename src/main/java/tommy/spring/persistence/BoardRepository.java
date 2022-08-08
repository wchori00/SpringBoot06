package tommy.spring.persistence;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import tommy.spring.domain.Board;

public interface BoardRepository extends CrudRepository<Board, Long> {
//	List<Board> findByTitle(String searchKeyword);
//	List<Board> findByContentContaining(String searchKeyword);
//	List<Board> findByTitleContainingOrContentContaining(String title, String content);
//	List<Board> findByTitleContainingOrderBySeqDesc(String searchKeyword);
//	List<Board> findByTitleContaining(String searchKeyword, Pageable paging);
//	Page<Board> findByTitleContaining(String searchKeyword, Pageable paging);
//	@Query("select b from Board b where b.title like %?1% order by b.seq desc")
//	List<Board> queryAnnotationTest1(String searchKeyword);
//	@Query("select b from Board b where b.title like %:searchKeyword% order by b.seq desc")
//	List<Board> queryAnnotationTest1(String searchKeyword);
//	List<Board> queryAnnotationTest1(@Param("searchKeyword") String searchKeyword);
//	@Query("SELECT b.seq, b.title, b.writer, b.regDate FROM Board b WHERE b.title like %:searchKeyword% ORDER BY b.seq DESC")
//	List<Object[]> queryAnnotationTest2(@Param("searchKeyword") String searchKeyword);
//	@Query(value = "select seq, title, writer, reg_date from myboard where title like '%'||?1||'%' order by seq desc", nativeQuery = true)
//	List<Object[]> queryAnnotationTest3(String searchKeyword);
//	@Query("select b from Board b order by b.seq desc")
//	List<Board> queryAnnotationTest4(Pageable paging);
	List<Board> findByTitle(String searchKeyword);
	List<Board> findByContentContaining(String searchKeyword);
	List<Board> findByTitleContainingOrContentContaining(String title, String content);
	List<Board> findByTitleContainingOrderBySeqDesc(String searchKeyword);
	Page<Board> findByTitleContaining(String searchKeyword, Pageable paging);
}
