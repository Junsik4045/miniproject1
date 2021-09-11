import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:web/WEB-INF/spring/root-context.xml"})
public class MySQLConnectionTest {

    @Autowired
    private SqlSessionTemplate sessionTemplate;

    @Test
    public void testConnection() throws Exception{
        try{
            sessionTemplate.selectList("boardDB.selectBoardAll")
                    .stream()
                    .forEach(System.out :: println);

        }catch (Exception e){
           System.out.println(e.getMessage());
        }
    }
}


