import com.kq.mapper.UserMapper;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Mytest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper sqlSession = context.getBean("userMapper", UserMapper.class);
        sqlSession.selectUser();
    }


    @Test
    public void select2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper sqlSession = context.getBean("userMapper2", UserMapper.class);
        sqlSession.selectUser();
    }


}
