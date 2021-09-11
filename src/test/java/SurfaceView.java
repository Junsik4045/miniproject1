import com.miniproject.entity.board.Board;
import com.miniproject.entity.board.BoardDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.Map;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:web/WEB-INF/spring/root-context.xml"})
public class SurfaceView {

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;
    private String namespace = "boardDB";


    @Test
    public void selectAll(){
        sqlSessionTemplate.selectList(namespace+".selectBoardAll")
        .stream()
        .forEach(System.out::println);
    }

    @Test
    public void selectOne(){
        sqlSessionTemplate.selectList(namespace+".selectBoard",2)
        .stream()
        .forEach(System.out::println);
    }

    @Test
    public void insert(){
        BoardDto boardDto = new BoardDto();
        boardDto.setCategory("테스트");
        boardDto.setTitle("타이틀");
        boardDto.setContent("내용");
        boardDto.setWriter("테스터가");
        boardDto.setHeader("주의사항");
        sqlSessionTemplate.insert(namespace+".insertBoard",boardDto);
    }

    @Test
    public void delete(){
        sqlSessionTemplate.delete(namespace+".deleteBoard",1);
    }

    @Test
    public void update(){
        BoardDto boardDto = new BoardDto();
        boardDto.setCategory("테스트");
        boardDto.setTitle("타이틀");
        boardDto.setContent("내용");
        boardDto.setWriter("테스터가");
        boardDto.setHeader("주의사항");

        sqlSessionTemplate.update(namespace+".updateBoard",boardDto);
    }

    
}


