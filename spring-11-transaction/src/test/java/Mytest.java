import com.kq.mapper.UserMapper;
import com.kq.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Mytest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper sqlSession = context.getBean("userMapper2", UserMapper.class);
        sqlSession.selectUser();
    }


}
