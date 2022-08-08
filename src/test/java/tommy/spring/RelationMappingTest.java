package tommy.spring;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import tommy.spring.domain.Board;
import tommy.spring.domain.Member;
import tommy.spring.persistence.BoardRepository;
import tommy.spring.persistence.MemberRepository;

@SpringBootTest
public class RelationMappingTest {
	@Autowired
	private BoardRepository boardRepo;
	@Autowired
	private MemberRepository memberRepo;
//	@Test
//	public void testTwoWayMapping() {
//	Member member = memberRepo.findById("aaaa").get();
//	System.out.println("=======================");
//	System.out.println(member.getName() + "이 작성한 게시글 목록");
//	System.out.println("=======================");
//	List<Board> list = member.getBoardList();
//	for(Board board : list) {
//	System.out.println(board.toString());
//	}
//	}
	
//	@Test
//	public void testManyToOneInsert() {
//	Member member1 = new Member();
//	member1.setId("aaaa");
//	member1.setPassword("1111");
//	member1.setName("손오공");
//	member1.setRole("User");
//	// memberRepo.save(member1);
//	Member member2 = new Member();
//	member2.setId("bbbb");
//	member2.setPassword("2222");
//	member2.setName("사오정");
//	member2.setRole("Admin");
//	// memberRepo.save(member2);
//	for(int i=1; i<=3; i++) {
//	Board board = new Board();
//	board.setMember(member1);
//	board.setTitle("손오공이 등록한 글 " + i);
//	board.setContent("손오공이 등록한 글 내용 " + i);
//	board.setRegDate(new Date());
//	board.setCnt(0L);
//	// boardRepo.save(board);
//	}
//	memberRepo.save(member1);
//	for(int i=1; i<=3; i++) {
//	Board board = new Board();
//	board.setMember(member2);
//	board.setTitle("사오정이 등록한 글 " + i);
//	board.setContent("사오정이 등록한 글 내용 " + i);
//	board.setRegDate(new Date());
//	board.setCnt(0L);
//	// boardRepo.save(board);
//	}
//	memberRepo.save(member2);
//	}
	
	@Test
	public void testCascadeDelete() {
	memberRepo.deleteById("bbbb");
	}
}
