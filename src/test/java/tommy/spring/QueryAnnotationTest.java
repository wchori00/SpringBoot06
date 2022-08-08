package tommy.spring;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import tommy.spring.domain.Board;
import tommy.spring.persistence.BoardRepository;

@SpringBootTest
public class QueryAnnotationTest {
	@Autowired
	private BoardRepository boardRepo;
	
//	@BeforeEach
//	public void dataPrepare() {
//	for(int i=1; i<=200; i++) {
//	Board board = new Board();
//	board.setTitle("테스트 제목 : " + i);
//	board.setWriter("테스터");
//	board.setContent("테스트 내용 : " + i);
//	board.setRegDate(new Date());
//	board.setCnt(0L);
//	boardRepo.save(board);
//	}
//	}
//	@Test
//	public void testFindByTitle() {
//	List<Board> boardList = boardRepo.findByTitle("테스트 제목 : 10");
//	System.out.println("검색 결과");
//	for(Board board : boardList) {
//	System.out.println("---> " + board.toString());
//	}
//	}
	
//	@Test
//	public void testFindByContentContaining() {
//	List<Board> boardList = boardRepo.findByContentContaining("17");
//	System.out.println("검색 결과");
//	for(Board board : boardList) {
//	System.out.println("---> " + board.toString());
//	}
//	}
	
//	@Test
//	public void testFindByTitleContainingOrContentContaining() {
//	List<Board> boardList = 
//	boardRepo.findByTitleContainingOrContentContaining("17", "10");
//	System.out.println("검색 결과");
//	for(Board board : boardList) {
//	System.out.println("---> " + board.toString());
//	}
//	}
	
//	@Test
//	public void testFindByTitleContainingOrderBySeqDesc() {
//	List<Board> boardList = boardRepo.findByTitleContainingOrderBySeqDesc("10");
//	System.out.println("검색 결과");
//	for(Board board : boardList) {
//	System.out.println("---> " + board.toString());
//	}
//	}
	
//	@Test
//	public void testFindByTitleContaining() {
//	Pageable paging = PageRequest.of(0, 5);
//	List<Board> boardList = boardRepo.findByTitleContaining("제목", paging);
//	System.out.println("검색 결과");
//	for(Board board : boardList) {
//	System.out.println("---> " + board.toString());
//	}
//	}
	
//	@Test
//	public void testFindByTitleContaining() {
//	Pageable paging = PageRequest.of(0, 5, Sort.Direction.DESC, "seq");
//	List<Board> boardList = boardRepo.findByTitleContaining("제목", paging);
//	System.out.println("검색 결과");
//	for(Board board : boardList) {
//	System.out.println("---> " + board.toString());
//	}
//	}
	
//	@Test
//	public void testQueryAnnotationTest1() {
//	List<Board> boardList = boardRepo.queryAnnotationTest1("테스트 제목 : 7");
//	System.out.println("검색 결과");
//	for(Board board : boardList) {
//	System.out.println("---> " + board.toString());
//	}
//	}
	
//	@Test
//	public void testQueryAnnotationTest2() {
//	List<Object[]> boardList = boardRepo.queryAnnotationTest2("테스트 제목 : 5");
//	System.out.println("검색 결과");
//	for(Object[] row : boardList) {
//		System.out.println("---> " + Arrays.toString(row));
//	}
//	}
	
//	@Test
//	public void testQueryAnnotationTest3() {
//	List<Object[]> boardList = boardRepo.queryAnnotationTest3("테스트 제목 : 5");
//	System.out.println("검색 결과");
//	for(Object[] row : boardList) {
//	System.out.println("---> " + Arrays.toString(row));
//	}
//	}
	
//	@Test
//	public void testQueryAnnotationTest4() {
//	Pageable paging = PageRequest.of(0, 5, Sort.Direction.DESC, "seq");
//	List<Board> boardList = boardRepo.queryAnnotationTest4(paging);
//	System.out.println("검색 결과");
//	for(Board board : boardList) {
//	System.out.println("---> " + board.toString());
//	}
//	}
	
}
