package tommy.spring;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import tommy.spring.domain.Board;
import tommy.spring.persistence.BoardRepository;

@SpringBootTest
public class QueryMethodTest {
	@Autowired
	private BoardRepository boardRepo;
	@Test
	public void testFindByTitleContaining() {
	Pageable paging = PageRequest.of(0, 5, Sort.Direction.DESC, "seq");
	Page<Board> pageInfo = boardRepo.findByTitleContaining("제목", paging);
	System.out.println("Page Size : " + pageInfo.getSize());
	System.out.println("Total Pages : " + pageInfo.getTotalPages());
	System.out.println("Total Count : " + pageInfo.getTotalElements());
	System.out.println("Next : " + pageInfo.nextOrLastPageable());
	List<Board> boardList = pageInfo.getContent();
	System.out.println("검색 결과");
	for(Board board : boardList) {
	System.out.println("---> " + board.toString());
	}
	}
	
}
