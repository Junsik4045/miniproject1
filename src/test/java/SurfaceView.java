import com.miniproject.entity.Board;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Scanner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:web/WEB-INF/spring/root-context.xml"})
public class SurfaceView {

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;
    private String namespace = "boardDB";


    @Test
    public void selectAll(){

    }

    @Test
    public void selectOne(){

    }

    @Test
    public void insert(){
        Board board = new Board();
        board.setCategory("테스트");
        board.setTitle("타이틀");
        board.setContent("내용");
        board.setWriter("테스터가");
        board.setHeader("주의사항");
        sqlSessionTemplate.insert(namespace+".insertBoard",board);
    }

    @Test
    public void remove(){
        sqlSessionTemplate.delete(namespace+".deleteBoard",1);
    }



    
}


