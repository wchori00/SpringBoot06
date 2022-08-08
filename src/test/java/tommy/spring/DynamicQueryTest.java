package tommy.spring;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import com.querydsl.core.BooleanBuilder;

import tommy.spring.domain.Board;
import tommy.spring.domain.QBoard;
import tommy.spring.persistence.DynamicBoardRepository;

@SpringBootTest
public class DynamicQueryTest {
	@Autowired
	private DynamicBoardRepository boardRepo;
	@Test
	public void testDynamicQuery() {
		String searchCondition = "TITLE";
		String searchKeyword = "테스트 제목 : 10";
		BooleanBuilder builder = new BooleanBuilder();
		QBoard qboard = QBoard.board;
		if (searchCondition.equals("TITLE")) {
		builder.and(qboard.title.like("%" + searchKeyword + "%"));
		} else if (searchCondition.equals("CONTENT")) {
		builder.and(qboard.content.like("%" + searchKeyword + "%"));
		}
		Pageable paging = PageRequest.of(0, 5);
		Page<Board> boardList = boardRepo.findAll(builder, paging);
		System.out.println("검색결과");
		for (Board board : boardList) {
		System.out.println("---> " + board.toString());
		}
	}
}
