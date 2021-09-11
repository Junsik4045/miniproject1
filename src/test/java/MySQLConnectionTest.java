import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.util.List;


/*@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:web/WEB-INF/spring/root-context.xml"})
public class MySQLConnectionTest {

    @Autowired
    private DataSource ds;

    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    @Test
    public void testConnection() throws Exception{
       try(Connection con = ds.getConnection()){
            System.out.println(con);
            SqlSession session = sqlSessionFactory.openSession();
            System.out.println(session);

            List list = session.selectList("select * from Board");
        }catch (Exception e){
            System.out.println("실패");
        }
    }
}*/


